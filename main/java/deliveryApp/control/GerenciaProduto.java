package deliveryApp.control;

import deliveryApp.model.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaProduto {
    ArrayList <Produto> produtos = new ArrayList<>();

    public GerenciaProduto(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }
    
    public GerenciaProduto(){
        produtos = new ArrayList<>();
    }
    
    public ArrayList<Produto> getProdutos(){
        return produtos;
    }
    
    public Produto retornarProduto(int pos){
        Produto p = produtos.get(pos);
        return p;
    }
 
}
