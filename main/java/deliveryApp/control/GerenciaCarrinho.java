package deliveryApp.control;

import deliveryApp.model.Carrinho;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerenciaCarrinho {
    ArrayList<Carrinho> carrinhos = new ArrayList<>();
    private int codigo = 0;

    public GerenciaCarrinho(ArrayList<Carrinho> carrinhos) {
        this.carrinhos = carrinhos;
    }
    
    public ArrayList<Carrinho> getCarrinho(){
        return carrinhos;
    }

    public void cadastro(Carrinho c){
        carrinhos.add(c);
        JOptionPane.showMessageDialog(null, "Carrinho finalizado com sucesso!!");
    }
    
    public Carrinho retornarCarrinho(int pos){
        Carrinho c = carrinhos.get(pos);
        return c;
    }
    
    public void excluir(String nome){
       for(int i = 0; i< carrinhos.size(); i++){
           if(carrinhos.get(i).getCliente().getNome().equals(nome)){
               carrinhos.remove(i);
               JOptionPane.showMessageDialog(null, "Carrinho excluído com sucesso!!");
           }
       } 
    }
}
