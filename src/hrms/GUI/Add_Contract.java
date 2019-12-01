
package hrms.GUI;
import hrms.EmpBtn;

public class Add_Contract extends javax.swing.JFrame {
  String EName,contType,Salary ,beg,exp  ;   
    int Id;
    
 
    public Add_Contract() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtContract = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jXbeginning = new org.jdesktop.swingx.JXDatePicker();
        jXexpired = new org.jdesktop.swingx.JXDatePicker();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        salary = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" Contract ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 60, 88, 17);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Employee full name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(28, 100, 140, 20);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contract type :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 140, 92, 17);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Beginning From :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 170, 104, 17);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Expired At :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(30, 210, 72, 17);

        txtContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContractActionPerformed(evt);
            }
        });
        jPanel2.add(txtContract);
        txtContract.setBounds(170, 130, 204, 30);
        jPanel2.add(txtName);
        txtName.setBounds(170, 90, 204, 30);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel2.add(txtID);
        txtID.setBounds(170, 50, 30, 30);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contract :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 27, 79, 21);

        jXbeginning.setToolTipText("00000000000");
        jXbeginning.setName(""); // NOI18N
        jXbeginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXbeginningActionPerformed(evt);
            }
        });
        jPanel2.add(jXbeginning);
        jXbeginning.setBounds(170, 170, 200, 22);

        jXexpired.setToolTipText("0000000");
        jPanel2.add(jXexpired);
        jXexpired.setBounds(170, 210, 200, 20);

        id.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        id.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(id);
        id.setBounds(184, 50, 81, 30);

        name.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(name);
        name.setBounds(358, 90, 81, 30);

        type.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        type.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(type);
        type.setBounds(358, 130, 81, 30);

        salary.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        salary.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(salary);
        salary.setBounds(266, 246, 88, 26);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(-6, 0, 470, 290);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 290);

        jPanel5.setLayout(null);

        jButton3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(112, 20, 80, 25);

        jButton5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5);
        jButton5.setBounds(239, 20, 80, 25);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel5.add(jLabel8);
        jLabel8.setBounds(-6, 0, 470, 60);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 290, 460, 60);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Leave");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContractActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContractActionPerformed
//function to get any field in add cotract frame
    public void get(){

           Id=Integer.parseInt(txtID.getText()+0);
           EName= txtName.getText();
           contType=txtContract.getText();
           beg=jXbeginning.getDate().toString();
           exp= jXexpired.getDate().toString();       
           //Salary=txtSalary.getText();
           
}
//function to check any field in add contract frame 
    private boolean check(){
    boolean f=true;
  if(txtID.getText().equalsIgnoreCase("")){
            id.setText("Invalid");
            f=false;
        }
        if(txtName.getText().equalsIgnoreCase("")){
            name.setText("Invalid");
            f=false;
        }
         if(txtContract.getText().equalsIgnoreCase("")){
            type.setText("Invalid");
            f=false;
        }
/*        if(txtSalary.getText().equalsIgnoreCase("")){
            salary.setText("Invalid");
            f=false;
        }*/
       return f;
}
    //function Save Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
     if(  check()){
        get();
         EmpBtn cont=new EmpBtn();
       cont.Addcontract(Id,EName,contType,beg,exp);
    }
    }//GEN-LAST:event_jButton3ActionPerformed
//function cancel Button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new employee().setVisible(true);  
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jXbeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXbeginningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jXbeginningActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add_Contract().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private org.jdesktop.swingx.JXDatePicker jXbeginning;
    private org.jdesktop.swingx.JXDatePicker jXexpired;
    private javax.swing.JLabel name;
    private javax.swing.JLabel salary;
    private javax.swing.JTextField txtContract;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables
}
