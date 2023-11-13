package deliveryApp.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private int codigo;
    private Date data;
    private Empresa empresa;
    private ArrayList<Produto> produtos;
    private float valorTotal;

    public Pedido(int codigo, Date data, Empresa empresa, ArrayList<Produto> produtos, float valorTotal) {
        this.codigo = codigo;
        this.data = data;
        this.empresa = empresa;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }
    
    public Pedido(){
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
}
