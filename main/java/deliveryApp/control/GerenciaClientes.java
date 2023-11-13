package deliveryApp.control;

import deliveryApp.model.Cliente;
import deliveryApp.model.Pedido;
import deliveryApp.model.Usuario;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class GerenciaClientes {

    ArrayList<Cliente> clientes = new ArrayList<>();
    ArrayList<Usuario> usuarios;
    Usuario u = new Usuario("admin", "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918", true);
    private boolean status;
    private boolean statusAdmin;
    private Cliente clienteAtual;
    private int posClienteAtual = 0;

    public GerenciaClientes(ArrayList<Cliente> clientes) {
        FileWriter arq = null;
        try {
            this.clientes = clientes;
            this.usuarios = new ArrayList<>();
            usuarios.add(u);

            arq = new FileWriter("users.txt");
            BufferedWriter buffWrite = new BufferedWriter(arq);
            buffWrite.write("admin\n");
            buffWrite.write("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\n");
            buffWrite.write("true\n");
            buffWrite.close();
            arq.close();

        } catch (IOException ex) {
            Logger.getLogger(GerenciaClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                Logger.getLogger(GerenciaClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public GerenciaClientes() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatusAdmin() {
        return statusAdmin;
    }

    public void setStatusAdmin(boolean statusAdmin) {
        this.statusAdmin = statusAdmin;
    }

    public void cadastro(Cliente c) throws IOException {

        clientes.add(c);
        FileWriter arq = new FileWriter("users.txt", true);
        BufferedWriter buffWrite = new BufferedWriter(arq);

        buffWrite.write(c.getUsuario().getUsuario() + "\n");
        buffWrite.write(c.getUsuario().getSenha() + "\n");
        buffWrite.write(c.getUsuario().isAdmin() + "\n");

        buffWrite.close();
        arq.close();
        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
    }

    public int testeLogin(Usuario user) {
        Usuario u = new Usuario("admin", "8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918", true);
        this.usuarios = new ArrayList<>();
        usuarios.add(u);

        for (int i = 0; i < clientes.size(); i++) {
            Usuario usuario = new Usuario();
            usuario.setUsuario(clientes.get(i).getUsuario().getUsuario());
            usuario.setSenha(clientes.get(i).getUsuario().getSenha());
            usuario.setAdmin(false);
            usuarios.add(usuario);
        }

        for (int i = 0; i < usuarios.size(); i++) {
            if (user.getUsuario().equals(usuarios.get(i).getUsuario())) {
                if (user.getSenha().equals(usuarios.get(i).getSenha())) {
                    if (usuarios.get(i).isAdmin()) {

                        return 2;
                    } else {
                        setPosClienteAtual(i - 1);
                        return 1;
                    }
                }
            }

        }
        return 0;
    }

    public String criptografar(String senha) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] bytes = md.digest(senha.getBytes());

            StringBuilder senhaCriptografada = new StringBuilder();
            for (byte b : bytes) {
                senhaCriptografada.append(String.format("%02x", b));
            }

            return senhaCriptografada.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<Cliente> getArray() {
        return clientes;
    }

    public Cliente retornarCliente(int pos) {
        Cliente c = clientes.get(pos);
        return c;
    }

    public void excluir(int pos) throws IOException {
        clientes.remove(pos);

        FileWriter arq = new FileWriter("users.txt");
        BufferedWriter buffWrite = new BufferedWriter(arq);
        buffWrite.write("admin\n");
        buffWrite.write("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\n");
        buffWrite.write("true\n");

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            buffWrite.write(cli.getUsuario().getUsuario() + "\n");
            buffWrite.write(cli.getUsuario().getSenha() + "\n");
            buffWrite.write(cli.getUsuario().isAdmin() + "\n");
        }

        buffWrite.close();
        arq.close();
        JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
    }

    public void alterar(int pos, Cliente c) throws IOException {
        clientes.get(pos).setCpf(c.getCpf());
        clientes.get(pos).setDataNasc(c.getDataNasc());
        clientes.get(pos).setEmail(c.getEmail());
        clientes.get(pos).setEndereco(c.getEndereco());
        clientes.get(pos).setNome(c.getNome());
        clientes.get(pos).setTelefone(c.getTelefone());
        clientes.get(pos).getUsuario().setUsuario(c.getUsuario().getUsuario());

        FileWriter arq = new FileWriter("users.txt");
        BufferedWriter buffWrite = new BufferedWriter(arq);
        buffWrite.write("admin\n");
        buffWrite.write("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\n");
        buffWrite.write("true\n");

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            buffWrite.write(cli.getUsuario().getUsuario() + "\n");
            buffWrite.write(cli.getUsuario().getSenha() + "\n");
            buffWrite.write(cli.getUsuario().isAdmin() + "\n");
        }

        buffWrite.close();
        arq.close();
        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
    }

    public void alterarSenha(int pos, Cliente c) throws IOException {
        clientes.get(pos).getUsuario().setSenha(c.getUsuario().getSenha());

        FileWriter arq = new FileWriter("users.txt");
        BufferedWriter buffWrite = new BufferedWriter(arq);
        buffWrite.write("admin\n");
        buffWrite.write("8c6976e5b5410415bde908bd4dee15dfb167a9c873fc4bb8a81f6f2ab448a918\n");
        buffWrite.write("true\n");

        for (int i = 0; i < clientes.size(); i++) {
            Cliente cli = clientes.get(i);
            buffWrite.write(cli.getUsuario().getUsuario() + "\n");
            buffWrite.write(cli.getUsuario().getSenha() + "\n");
            buffWrite.write(cli.getUsuario().isAdmin() + "\n");
        }

        buffWrite.close();
        arq.close();
    }

    public void setPosClienteAtual(int posClienteAtual) {
        this.posClienteAtual = posClienteAtual;
    }

    public int getPosClienteAtual() {
        return posClienteAtual;
    }

    public void addPedido(int pos, Pedido p) {
        clientes.get(pos).getPedidos().add(p);
        JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!!");
    }

    public void excluirPedidos(int pos, Pedido p) {
        clientes.get(pos).getPedidos().remove(p);
        JOptionPane.showMessageDialog(null, "Pedido excluído com sucesso!!");
    }

    public Pedido retornarPedido(int posCli, int posPed) {
        return clientes.get(posCli).getPedidos().get(posPed);
    }

    public ArrayList<Pedido> retornaArrayPedidos(String nome) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(nome)) {
                return clientes.get(i).getPedidos();
            }
        }
        return null;
    }

    public Pedido retornarPedido(String nome, int posPed) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getNome().equals(nome)) {
                return clientes.get(i).getPedidos().get(posPed);
            }
        }
        return null;
    }
}
