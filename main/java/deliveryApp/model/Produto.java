package deliveryApp.model;

public class Produto {
    private String tipo;
    private float preco;
    private int codigo;

    public Produto(String tipo, float preco, int codigo) {
        this.tipo = tipo;
        this.preco = preco;
        this.codigo = codigo;
    }
    
    public Produto(){
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
}
