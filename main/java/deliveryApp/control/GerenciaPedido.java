package deliveryApp.control;

import deliveryApp.model.Pedido;
import deliveryApp.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaPedido {

    ArrayList<Pedido> pedidos = new ArrayList<>();
    private int codigo = 0;

    public GerenciaPedido(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    
    public ArrayList<Pedido> getPedido(){
        return pedidos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        codigo++;
    }
    
}
