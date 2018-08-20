import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela extends JFrame {

    private JLabel nome = new JLabel();
    private JTextField campoNome = new JTextField();
    private JButton botao = new JButton();
    private JButton botao2 = new JButton();
    private String msg;
    private JButton reset = new JButton();
	//private JButton reset = new JButton (); 
	public Janela() {
		
            reset.setText("Resetar o nome");
	    reset.setBounds(300, 300, 140, 100);
	    add (reset); 
            reset.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent e) {
				
            campoNome.setText("Nome");
            
            }
            });
		
		
            botao2.setText("Caixa de Texto");
            botao2.setBounds(160, 100, 120, 20);
            add(botao2);
            botao2.addActionListener(new ActionListener() {
		
		
			
            @Override
            public void actionPerformed(ActionEvent e) {
            int numero = 0;
            Janela obj = new Janela();
				
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero!"));
            //	numero = numero * 2;
            JOptionPane.showMessageDialog(null,"" + obj.multiplicar (numero));
            //msg = JOptionPane.showInputDialog("Digite seu texto");
            //campoNome.setText(msg);
				
            }
            });
		
		
            botao.setText("Salvar");
            botao.setBounds(160, 50, 80, 20);
            add(botao);
	
            botao.addActionListener(new ActionListener() {
			
            @Override
            public void actionPerformed(ActionEvent arg0) {
				
            if(campoNome.getText().equals("")) {
		JOptionPane.showMessageDialog(null, "Você não digitou nada! A aplicação será fechada!");
		dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Nome "+campoNome.getText()+" foi salvo!");
            }
            }
            });
		
            campoNome.setBounds(125, 10, 150, 30);
            add(campoNome);
		
            nome.setText("Digite seu nome:");
            nome.setBounds(10, 10, 100, 30);
            add(nome);
		
            setTitle("Minha Primeira Janela S2");
            setSize(600, 600);
            setLayout(null);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            setVisible(true);
        }

public static void main(String[] args) {
    new Janela();
}


public int multiplicar (int valor) {
	
    return valor * 3 ;
}
}