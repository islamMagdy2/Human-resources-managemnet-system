
package hrms.GUI;

import hrms.Financial;


public class Add_Bonus extends javax.swing.JFrame {

    
     String fullName,department,bonusValue,reason   ;   
    int id,year,month;
    public Add_Bonus() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Department = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BonuceValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Month = new com.toedter.calendar.JMonthChooser();
        jLabel5 = new javax.swing.JLabel();
        Year = new com.toedter.calendar.JYearChooser();
        Reason = new java.awt.TextArea();
        jLabel6 = new javax.swing.JLabel();
        Lid = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Ldep = new javax.swing.JLabel();
        Lbonus = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 445));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bonus :");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 11, 60, 21);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel9.setToolTipText("");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, -10, 390, 60);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(12, 14, 20, 17);

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel4.add(ID);
        ID.setBounds(115, 13, 40, 30);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name :");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(12, 52, 69, 17);

        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        jPanel4.add(FullName);
        FullName.setBounds(115, 51, 200, 30);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department :");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(10, 100, 81, 17);
        jPanel4.add(Department);
        Department.setBounds(110, 90, 148, 30);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bonus value:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 140, 77, 17);

        BonuceValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BonuceValueActionPerformed(evt);
            }
        });
        jPanel4.add(BonuceValue);
        BonuceValue.setBounds(110, 130, 58, 30);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EL");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(170, 140, 15, 17);
        jPanel4.add(Month);
        Month.setBounds(110, 180, 94, 20);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("For Month :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 180, 73, 17);
        jPanel4.add(Year);
        Year.setBounds(230, 180, 77, 20);
        jPanel4.add(Reason);
        Reason.setBounds(100, 220, 180, 80);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reason :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 220, 51, 17);

        Lid.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lid.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(Lid);
        Lid.setBounds(170, 20, 90, 0);

        Lname.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lname.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(Lname);
        Lname.setBounds(320, 50, 60, 0);

        Ldep.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Ldep.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(Ldep);
        Ldep.setBounds(260, 100, 90, 20);

        Lbonus.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lbonus.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(Lbonus);
        Lbonus.setBounds(200, 140, 130, 0);

        jLabel16.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(jLabel16);
        jLabel16.setBounds(300, 220, 60, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel4.add(jLabel10);
        jLabel10.setBounds(0, 0, 390, 320);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 320));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(null);

        jButton3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3);
        jButton3.setBounds(230, 20, 73, 25);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1);
        jButton1.setBounds(110, 20, 81, 25);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel11.setToolTipText("");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(0, 0, 390, 60);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 390, 50));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void BonuceValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BonuceValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BonuceValueActionPerformed
//function cancel Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new Finance().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
//function to get any field in add bonus frame
private void get()
{
    try{
         id=Integer.parseInt(ID.getText());}catch(NumberFormatException e){Lid.setText("unvalid id");}
           fullName= FullName.getText();
           department=Department.getText();
           bonusValue=BonuceValue.getText();
           reason=Reason.getText();       
           year=Year.getYear();
           month= Month.getMonth();
           month+=1;
}
//function to check any field in add bonus frame 
private boolean check(){
        boolean f=true;
          if(id<=1)
        {Lid.setText("unvalid id");     f=false;}else{Lid.setText("");  }
        if("".equalsIgnoreCase(fullName)){
            Lname.setText("unvalid Name");     f=false;}else{Lname.setText("");  }
        if("".equals(department)){
            Ldep.setText("unvalid department");     f=false;}else{Ldep.setText("");  }
        if("".equals(bonusValue)){
            Lbonus.setText("unvalid bonuce");     f=false;}else{Lbonus.setText("");  }
return f;
}
//function confirm Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        get();
        if(check()){

            Financial f =new Financial();
            //f.Addfinance(id, fullName, department, bonusValue, reason,"bonuce" ,year, month);
            f.Addfinance(id, fullName, department, bonusValue, reason,"bonus" ,year, month);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Bonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Bonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Bonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Bonus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Bonus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BonuceValue;
    private javax.swing.JTextField Department;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Lbonus;
    private javax.swing.JLabel Ldep;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lname;
    private com.toedter.calendar.JMonthChooser Month;
    private java.awt.TextArea Reason;
    private com.toedter.calendar.JYearChooser Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
