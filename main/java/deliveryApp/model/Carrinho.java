package deliveryApp.model;

import java.util.ArrayList;
import java.util.Date;

public class Carrinho {
    private float precoTotal;
    private Date dataCriacao;
    private ArrayList<Pedido> pedidos;
    private Cliente cliente;
    private String tipoPagamento;
    
    public Carrinho(float precoTotal, Date dataCriacao, ArrayList<Pedido> pedidos, Cliente cliente, String tipoPagamento) {
        this.precoTotal = precoTotal;
        this.dataCriacao = dataCriacao;
        this.pedidos = pedidos;
        this.cliente = cliente;
        this.tipoPagamento = tipoPagamento;
    }
    
    public Carrinho(){
        
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    
    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    
    
}
