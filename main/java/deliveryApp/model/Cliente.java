package deliveryApp.model;

import java.util.ArrayList;
import java.util.Date;

public class Cliente {
    private String cpf;
    private String nome;
    private Date dataNasc;
    private Endereco endereco;
    private String email;
    private String telefone;
    private Usuario usuario;
    private ArrayList<Pedido> pedidos;

    public Cliente(String cpf, String nome, Date dataNasc, Endereco endereco, String email, String telefone, Usuario usuario, ArrayList<Pedido> pedidos) {
        this.cpf = cpf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.pedidos = pedidos;
       
        
    }
    
     public Cliente(){
       this.pedidos = new ArrayList<>(); 
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
     
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    
}
