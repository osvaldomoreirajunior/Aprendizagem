package exemplos;

import javax.swing.JOptionPane;

public class UsandoProduto {
    
    public static void main(String[] args){
        Produto objetoProduto = new Produto();
        
        boolean aux = true;
        String continuar;
        double total = 0;
        
        while (aux = true){
            objetoProduto.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
            objetoProduto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Produto")));  
            objetoProduto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade")));
            continuar = JOptionPane.showInputDialog("Quer continuar?(sim/nao) ");
            
            total = total + objetoProduto.totalcompra();
            
            if ("nao".equals(continuar)){
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null,"O valor total a ser pago será de " + total);
    }
    
}
