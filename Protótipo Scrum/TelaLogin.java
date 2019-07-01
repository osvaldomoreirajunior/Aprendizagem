package prototipacao;

import com.sun.glass.events.KeyEvent;
import javax.swing.JOptionPane;

public class TelaLogin extends javax.swing.JFrame {
    static boolean desaparecerTela = true;
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelSenha = new javax.swing.JLabel();
        labelLogin = new javax.swing.JLabel();
        loginText = new javax.swing.JTextField();
        bEntrar = new javax.swing.JButton();
        labelEz = new javax.swing.JLabel();
        labelSprint = new javax.swing.JLabel();
        senhaText = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EZ - Sprint");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        labelSenha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelSenha.setText("Senha:");

        labelLogin.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        labelLogin.setText("Login:");

        loginText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginTextActionPerformed(evt);
            }
        });
        loginText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginTextKeyPressed(evt);
            }
        });

        bEntrar.setText("Entrar");
        bEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrarActionPerformed(evt);
            }
        });

        labelEz.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        labelEz.setText("EZ");

        labelSprint.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        labelSprint.setText("Sprint");

        senhaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTextActionPerformed(evt);
            }
        });
        senhaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhaTextKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bEntrar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelSenha)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelLogin)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(labelEz)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(labelSprint))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEz, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSprint, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bEntrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginTextActionPerformed

    private void senhaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTextActionPerformed

    private void bEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrarActionPerformed
        
        String login = loginText.getText();
        String senha = new String(senhaText.getPassword());
        
        if(login.equals("admin")&& senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            this.dispose();
            new TelaPrincipal().setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bEntrarActionPerformed

    private void loginTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginTextKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String login = loginText.getText();
        String senha = new String(senhaText.getPassword());
        
        if(login.equals("admin")&& senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            this.dispose();
            new TelaPrincipal().setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_loginTextKeyPressed

    private void senhaTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhaTextKeyPressed
         if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String login = loginText.getText();
        String senha = new String(senhaText.getPassword());
        
        if(login.equals("admin")&& senha.equals("admin")){
            JOptionPane.showMessageDialog(null, "Logado com sucesso!");
            this.dispose();
            new TelaPrincipal().setVisible(true);
            
        }else{
            JOptionPane.showMessageDialog(null, "Acesso Negado", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    }//GEN-LAST:event_senhaTextKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bEntrar;
    private javax.swing.JLabel labelEz;
    private javax.swing.JLabel labelLogin;
    private javax.swing.JLabel labelSenha;
    private javax.swing.JLabel labelSprint;
    private javax.swing.JTextField loginText;
    private javax.swing.JPasswordField senhaText;
    // End of variables declaration//GEN-END:variables
}
