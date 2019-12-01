
package hrms.GUI;

import hrms.Log_in;
import javax.swing.JOptionPane;


public class Change_password extends javax.swing.JFrame {

    
    String nPass,oPass,user;
    public Change_password() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCpassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();
        txtOpassword = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        chkPass = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Change password :");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 11, 170, 36);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(-6, 0, 430, 50);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        jPanel5.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Old password :");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(13, 11, 110, 25);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("New password :");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(13, 55, 110, 23);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirm password :");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(10, 90, 130, 28);
        jPanel5.add(txtCpassword);
        txtCpassword.setBounds(150, 90, 134, 30);
        jPanel5.add(txtPassword);
        txtPassword.setBounds(150, 50, 134, 30);
        jPanel5.add(txtOpassword);
        txtOpassword.setBounds(150, 10, 134, 30);

        jLabel12.setText("jLabel12");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(300, 10, 102, 24);

        jLabel13.setText("jLabel13");
        jPanel5.add(jLabel13);
        jLabel13.setBounds(300, 60, 102, 20);

        chkPass.setText("jLabel14");
        jPanel5.add(chkPass);
        chkPass.setBounds(290, 100, 102, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel5.add(jLabel2);
        jLabel2.setBounds(-6, 0, 430, 150);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 150));

        jPanel6.setLayout(null);

        jButton3.setText("Confirm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);
        jButton3.setBounds(183, 11, 82, 28);

        jButton4.setText("Cancel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4);
        jButton4.setBounds(283, 11, 78, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(-6, 0, 430, 50);

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 420, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//function to check any field in change password frame 
boolean chk(){
    boolean c=true;
    if(!(txtPassword.getText().equalsIgnoreCase(txtCpassword.getText()))| txtOpassword.getText().equalsIgnoreCase("")|
            txtPassword.getText().equalsIgnoreCase("")){
        c=false;
        chkPass.setText("Doesn't match");
        JOptionPane.showMessageDialog(null, "The password doesn't match");
    }
    else{
        chkPass.setText("");
    }
    return c;
}
//function to get any field in change password frame 
 void get(){
        
        nPass=txtPassword.getText();
        oPass=txtOpassword.getText();
    }
 //function to get user name  
 public void getUser(String User){
     user=User;
 }
 //function confirm Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(chk()){
            get();
            Log_in e=new Log_in();
           if(e.changePass(user, oPass, nPass)){
               this.setVisible(false);
               new Setting().setVisible(true);
           }
               
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//function cancel Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
      new Setting().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Change_password().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chkPass;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField txtCpassword;
    private javax.swing.JPasswordField txtOpassword;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
