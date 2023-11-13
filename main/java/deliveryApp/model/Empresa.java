package deliveryApp.model;

import java.util.ArrayList;

public class Empresa {
    private String nome;
    private String ramo;
    private String cnpj;
    private Endereco endereco;
    private String telefone;
    private ArrayList<Produto> produtos;

    public Empresa(String nome, String ramo, String cnpj, Endereco endereco, String telefone, ArrayList<Produto> produtos) {
        this.nome = nome;
        this.ramo = ramo;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.produtos = produtos;
    }
    
    public Empresa(){
         this.produtos = new ArrayList<>();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
