
package hrms.GUI;

import hrms.Financial;


public class Loan_Request extends javax.swing.JFrame {

  
    
     String fullName,department,loanValue,reason ;   
    int id,year,month;
    public Loan_Request() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        FullName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Department = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        LoanValue = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Month = new com.toedter.calendar.JMonthChooser();
        Year = new com.toedter.calendar.JYearChooser();
        jLabel6 = new javax.swing.JLabel();
        Reason = new java.awt.TextArea();
        Lid = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Ldep = new javax.swing.JLabel();
        Lvalue = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loan Request :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 120, 21);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(4, 0, 390, 40);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);
        jPanel2.add(ID);
        ID.setBounds(100, 10, 40, 30);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(12, 14, 20, 17);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(12, 52, 65, 17);

        FullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FullNameActionPerformed(evt);
            }
        });
        jPanel2.add(FullName);
        FullName.setBounds(103, 51, 151, 30);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 90, 81, 17);
        jPanel2.add(Department);
        Department.setBounds(103, 89, 151, 30);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loan Value :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 128, 75, 17);

        LoanValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoanValueActionPerformed(evt);
            }
        });
        jPanel2.add(LoanValue);
        LoanValue.setBounds(105, 127, 68, 30);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EL");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(177, 128, 15, 17);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("For Month :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(12, 165, 73, 17);
        jPanel2.add(Month);
        Month.setBounds(105, 165, 94, 30);
        jPanel2.add(Year);
        Year.setBounds(217, 165, 77, 30);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reason :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(12, 200, 51, 17);
        jPanel2.add(Reason);
        Reason.setBounds(100, 210, 186, 80);

        Lid.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lid.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(Lid);
        Lid.setBounds(150, 10, 70, 20);

        Lname.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lname.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(Lname);
        Lname.setBounds(260, 50, 70, 20);

        Ldep.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Ldep.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(Ldep);
        Ldep.setBounds(260, 90, 70, 20);

        Lvalue.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lvalue.setForeground(new java.awt.Color(204, 0, 0));
        jPanel2.add(Lvalue);
        Lvalue.setBounds(240, 130, 80, 20);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel14.setText("jLabel14");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(0, 0, 390, 320);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 390, 320));

        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(120, 10, 75, 25);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(220, 10, 73, 25);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 390, 40);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 390, 40));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FullNameActionPerformed

    private void LoanValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoanValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoanValueActionPerformed
//function to get any field in loan request frame
    private void get()
{              try{
         id=Integer.parseInt(ID.getText());}catch(NumberFormatException e){Lid.setText("unvalid id");}
           fullName= FullName.getText();
           department=Department.getText();
           loanValue=LoanValue.getText();
           reason=Reason.getText();       
           year=Year.getYear();
           month= Month.getMonth();
           month+=1;
}
//function to check any field in loan request frame
private boolean check(){
        boolean f=true;
          if(id<=1)
        {Lid.setText("unvalid id");     f=false;}else{Lid.setText("");  }
        if("".equalsIgnoreCase(fullName)){
            Lname.setText("unvalid Name");     f=false;}else{Lname.setText("");  }
        if("".equals(department)){
            Ldep.setText("unvalid department");     f=false;}else{Ldep.setText("");  }
        if("".equals(loanValue)){
            Lvalue.setText("unvalid bonuce");     f=false;}else{Lvalue.setText("");  }
return f;
}
 //function confirm Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        get();
        if(check()){
           Financial f=new Financial();
            f.request(id, fullName, department, loanValue, reason,year, month);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//function cancel Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Finance().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Loan_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loan_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loan_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loan_Request.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Loan_Request().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Department;
    private javax.swing.JTextField FullName;
    private javax.swing.JTextField ID;
    private javax.swing.JLabel Ldep;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lname;
    private javax.swing.JTextField LoanValue;
    private javax.swing.JLabel Lvalue;
    private com.toedter.calendar.JMonthChooser Month;
    private java.awt.TextArea Reason;
    private com.toedter.calendar.JYearChooser Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
