package exemplos;

public class Produto {
    
    private String nome;
    private Double preco;
    private int quantidade;
    
    public Produto(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalcompra(){
        
        double totalParaPagar = 0.0;
        
        if (this.getQuantidade() <= 10){
        totalParaPagar = this.getPreco() * this.getQuantidade();
        }
        if (this.getQuantidade() >=11 && this.getQuantidade() <= 20) { 
            totalParaPagar = (this.getPreco() - (this.getPreco() * 0.1)) * this.getQuantidade();
        }
        if (this.getQuantidade() >= 21 && this.getQuantidade() <= 50){
            totalParaPagar = (this.getPreco() - (this.getPreco() * 0.2)) * this.getQuantidade();
        }
        if (this.getQuantidade() > 50) {
            totalParaPagar = (this.getPreco() - (this.getPreco() * 0.25)) * this.getQuantidade();
        }
        
        return totalParaPagar;
    }
    
}    