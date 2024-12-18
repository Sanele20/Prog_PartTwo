package com.mycompany.mavenproject3;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame2
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        lSign = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ePasswordL = new javax.swing.JTextField();
        eUsernameL = new javax.swing.JTextField();
        bLogin = new javax.swing.JButton();
        bHelpL = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("DON'T HAVE AN ACCOUNT? ");

        lSign.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lSign.setText("<html><u>SIGN UP!</u></html>");
        lSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lSign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lSignMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel2.setText("USERNAME");

        jLabel3.setText("PASSWORD");

        eUsernameL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eUsernameLActionPerformed(evt);
            }
        });

        bLogin.setText("LOGIN");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });

        bHelpL.setText("HELP");
        bHelpL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHelpLActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel7.setText("WELCOME TO EASYKANBAN");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel5)
                                .addComponent(bHelpL))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(94, 94, 94)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eUsernameL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ePasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bLogin)
                            .addComponent(lSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(eUsernameL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ePasswordL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(bLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lSign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(bHelpL)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lSignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lSignMouseClicked
        // TODO add your handling code here:
        // MouseListener to change color on hover
        lSign.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change color when mouse enters
                lSign.setForeground(Color.RED);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change color back when mouse exits
                lSign.setForeground(Color.BLACK);
            }
        });
        
          lSign.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e)  {
        // Create an instance of the new frame
        Registration registration = new Registration();
        registration.setVisible(true); // Show the new frame
        // Optionally hide the current frame
        Login.this.setVisible(false);
    }
});
        
    }//GEN-LAST:event_lSignMouseClicked

    private void eUsernameLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eUsernameLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eUsernameLActionPerformed

    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        // TODO add your handling code here:
        
         bLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                 String sUsername = eUsernameL.getText() ;
        String sPassword = ePasswordL.getText() ;
        String sEnter;
        
         if (sUsername != null && sPassword != null){
                
        sEnter = Validation.returnLoginStatus(sUsername, sPassword);
        
        JOptionPane.showMessageDialog(null,sEnter );
        
        if (Validation.loginUser(sUsername, sPassword)==true){
        // Create an instance of the new frame
        Developer developer = new Developer();
        developer.setVisible(true); // Show the new frame
        // Optionally hide the current frame
        Login.this.setVisible(false);
        
        }
        
         
          }else { JOptionPane.showMessageDialog(null,"Login "
                          + "incomplete. Not all fields are filled in.");
      }
        
            }
        });
        
        String sUsername = eUsernameL.getText() ;
        String sPassword = ePasswordL.getText() ;
        String sEnter;
        
         if (sUsername != null && sPassword != null){
                
        sEnter = Validation.returnLoginStatus(sUsername, sPassword);
        
        JOptionPane.showMessageDialog(null,sEnter );
        
        if (Validation.loginUser(sUsername, sPassword)==true){
        // Create an instance of the new frame
        Developer developer = new Developer();
        developer.setVisible(true); // Show the new frame
        // Optionally hide the current frame
        Login.this.setVisible(false);
        
        }
        
         
          }else { JOptionPane.showMessageDialog(null,"Login "
                          + "incomplete. Not all fields are filled in.");
      }
        
        
    }//GEN-LAST:event_bLoginActionPerformed

    private void bHelpLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHelpLActionPerformed
        // TODO add your handling code here:
         String helpMessage = "Help Instructions:\n\n"
                             + "1. Enter your username and corresponfing password.\n" 
                             + "2. Click the 'Login' button once all the fields "
                 + "have been filled in.\n"
                             + "3. If you do not have an account click 'SIGN UP!' "
                 + "to be taken to the registration page to create a new account.\n";
                
                

        JOptionPane.showMessageDialog(null, helpMessage, "Help", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_bHelpLActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bHelpL;
    private javax.swing.JButton bLogin;
    private javax.swing.JTextField ePasswordL;
    private javax.swing.JTextField eUsernameL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lSign;
    // End of variables declaration//GEN-END:variables
}
