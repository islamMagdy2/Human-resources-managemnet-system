
package hrms.GUI;

import hrms.Financial;


public class Add_Deduction extends javax.swing.JFrame {

    
    
    
    String fullName,department,deductionValue, reason ;   
    int id,year,month;
    
    public Add_Deduction() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Department = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        DeductionValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Month = new com.toedter.calendar.JMonthChooser();
        Year = new com.toedter.calendar.JYearChooser();
        Reason = new java.awt.TextArea();
        jLabel6 = new javax.swing.JLabel();
        Lid = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Ldep = new javax.swing.JLabel();
        Ldeduction = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 390));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Deduction :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 95, 21);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, -10, 390, 60);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(12, 14, 20, 17);

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        jPanel2.add(ID);
        ID.setBounds(140, 10, 35, 30);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 60, 69, 17);
        jPanel2.add(FullName);
        FullName.setBounds(140, 50, 150, 30);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Department :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 100, 81, 17);
        jPanel2.add(Department);
        Department.setBounds(140, 90, 148, 30);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deduction Value :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 130, 109, 17);

        DeductionValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeductionValueActionPerformed(evt);
            }
        });
        jPanel2.add(DeductionValue);
        DeductionValue.setBounds(140, 130, 67, 30);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setText("EL");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(202, 105, 15, 17);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("For Month :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 170, 73, 17);
        jPanel2.add(Month);
        Month.setBounds(140, 170, 94, 30);
        jPanel2.add(Year);
        Year.setBounds(260, 170, 77, 30);
        jPanel2.add(Reason);
        Reason.setBounds(100, 220, 175, 80);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reason :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 220, 51, 17);

        Lid.setForeground(new java.awt.Color(204, 51, 0));
        jPanel2.add(Lid);
        Lid.setBounds(190, 20, 70, 20);

        Lname.setForeground(new java.awt.Color(204, 51, 0));
        jPanel2.add(Lname);
        Lname.setBounds(300, 50, 80, 20);

        Ldep.setForeground(new java.awt.Color(204, 51, 0));
        jPanel2.add(Ldep);
        Ldep.setBounds(300, 90, 70, 20);

        Ldeduction.setForeground(new java.awt.Color(204, 51, 0));
        jPanel2.add(Ldeduction);
        Ldeduction.setBounds(250, 130, 80, 20);

        jLabel13.setText("jLabel13");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(290, 184, 60, 20);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EL");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(210, 134, 30, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(0, 0, 390, 310);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 390, 310));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(230, 10, 73, 25);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(110, 10, 81, 25);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 0, 390, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 40));

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

    private void DeductionValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeductionValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeductionValueActionPerformed
//function cancel Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Finance().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//function to get any field in add Deduction frame
private void get()
{              try{
         id=Integer.parseInt(ID.getText());}catch(NumberFormatException e){Lid.setText("unvalid id");}
           fullName= FullName.getText();
           department=Department.getText();
           deductionValue=DeductionValue.getText();
           reason=Reason.getText();       
           year=Year.getYear();
           month= Month.getMonth();
           month+=1;
}
//function to check any field in add Deduction frame 
private boolean check(){
        boolean f=true;
          if(id<=1)
        {Lid.setText("unvalid id");     f=false;}else{Lid.setText("");  }
        if("".equalsIgnoreCase(fullName)){
            Lname.setText("unvalid Name");     f=false;}else{Lname.setText("");  }
        if("".equals(department)){
            Ldep.setText("unvalid department");     f=false;}else{Ldep.setText("");  }
        if("".equals(deductionValue)){
            Ldeduction.setText("unvalid bonuce");     f=false;}else{Ldeduction.setText("");  }
return f;
}
    //function confirm Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        get();
        if(check()){
            Financial f=new Financial();
            f.Addfinance(id, fullName, department, deductionValue, reason, "deduction",year, month);
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
            java.util.logging.Logger.getLogger(Add_Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Deduction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DeductionValue;
    private javax.swing.JTextField Department;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Ldeduction;
    private javax.swing.JLabel Ldep;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lname;
    private com.toedter.calendar.JMonthChooser Month;
    private java.awt.TextArea Reason;
    private com.toedter.calendar.JYearChooser Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
