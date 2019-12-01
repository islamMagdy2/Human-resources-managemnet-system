package hrms.GUI;

import hrms.Log_in;

public class LogIn extends javax.swing.JFrame {
   String username,password;
    public LogIn() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Luser = new javax.swing.JLabel();
        Lpass = new javax.swing.JLabel();
        chkPas = new javax.swing.JLabel();
        chkPass = new javax.swing.JLabel();
        chkUser = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(76, 90, 70, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(76, 130, 70, 30);
        getContentPane().add(txtusername);
        txtusername.setBounds(150, 90, 143, 30);

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtpassword);
        txtpassword.setBounds(150, 130, 143, 30);

        jButton1.setText("Sumbit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 184, 80, 30);

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(260, 184, 80, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Login :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(47, 64, 70, 20);
        getContentPane().add(Luser);
        Luser.setBounds(304, 90, 70, 0);
        getContentPane().add(Lpass);
        Lpass.setBounds(304, 166, 60, 0);

        chkPas.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        chkPas.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(chkPas);
        chkPas.setBounds(300, 130, 90, 21);

        chkPass.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        chkPass.setForeground(new java.awt.Color(195, 9, 9));
        getContentPane().add(chkPass);
        chkPass.setBounds(303, 138, 71, 0);

        chkUser.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        chkUser.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(chkUser);
        chkUser.setBounds(303, 95, 90, 21);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("New Employee ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 220, 120, 20);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/hr-management.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(-6, 0, 410, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpasswordActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          txtusername.setText("");
          txtpassword.setText("");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//function to check any field in login frame
    private boolean check(){
        boolean f=true;
            if("".equals(txtusername.getText())){
                   chkUser.setText("invalid username");     f=false;}
            if("".equals(txtpassword.getText())){
                   chkPas.setText("invalid password");     f=false;}
        return f;
}
   //function to get any field in login frame
 private void get(){
    username=txtusername.getText();
    password=txtpassword.getText();
}
 //function sumbit Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         
        if(check()){    
            get();
            Log_in l;
            l = new Log_in();
            boolean login;
            login = l.login(username, password);
            if(login)
                this.setVisible(false);
             }
                                    
    }//GEN-LAST:event_jButton1ActionPerformed
//function New_employee Button
    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
    this.setVisible(false); 
    new New_register().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new LogIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lpass;
    private javax.swing.JLabel Luser;
    private javax.swing.JLabel chkPas;
    private javax.swing.JLabel chkPass;
    private javax.swing.JLabel chkUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
