package deliveryApp.control;

import deliveryApp.model.Empresa;
import deliveryApp.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaEmpresa {
    ArrayList<Empresa> empresas = new ArrayList<>();

    public GerenciaEmpresa(ArrayList<Empresa> empresas){
        this.empresas = empresas;
    }
    
    public GerenciaEmpresa(){
    }
    
    public void cadastro(Empresa e){
        empresas.add(e);
        JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
    }
    
    public void addProduto(int pos, Produto p){
        empresas.get(pos).getProdutos().add(p);
    }
    
    public void excluirProduto(int pos, Produto p){
        empresas.get(pos).getProdutos().remove(p);
        JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
    }
    
    public void alterarProduto(int pos, Produto p, int posProd){
        empresas.get(pos).getProdutos().get(posProd).setPreco(p.getPreco());
        empresas.get(pos).getProdutos().get(posProd).setTipo(p.getTipo());
        JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
    }
    
    public Empresa retornarEmpresa(int pos){
        Empresa e = empresas.get(pos);
        return e;
    }
    
    public Produto retornarProduto(int posEmp, int posProd ){
        return empresas.get(posEmp).getProdutos().get(posProd);
    }
    
    public void alterar(int pos, Empresa e){
        empresas.get(pos).setCnpj(e.getCnpj());
        empresas.get(pos).setNome(e.getNome());
        empresas.get(pos).setRamo(e.getRamo());
        empresas.get(pos).setTelefone(e.getTelefone());
        empresas.get(pos).setEndereco(e.getEndereco());
        JOptionPane.showMessageDialog(null, "Empresa alterada com sucesso!");
    }
    
    public void excluir(int pos){
        empresas.remove(pos);
        JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!");
    }
}
