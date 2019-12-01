
package hrms.GUI;

import hrms.MysqlConnect;
import hrms.confirm;
import hrms.date;
import java.sql.*;
import javax.swing.JOptionPane;

public class Finance extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    int dialogResult2,dialogResult1;
    String date;
    
    public Finance() {
        initComponents();
    }
  
    /**
     * function to set user name in program
     * @param user
     */
    public void setUser(String user){
        welcome.setText(user);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        add_deduction = new javax.swing.JButton();
        add_bonus = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        main.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jButton10.setBackground(new java.awt.Color(255, 255, 255));
        jButton10.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton10.setText("Financial");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton10);
        jButton10.setBounds(13, 84, 124, 40);

        jButton11.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton11.setText("Employee");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(13, 33, 124, 40);

        jButton12.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton12.setText("Setting");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(13, 186, 124, 40);

        jButton13.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton13.setText("Attendance");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(13, 135, 124, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 4, 150, 250);

        main.add(jPanel2);
        jPanel2.setBounds(10, 70, 150, 260);

        jTabbedPane6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setLayout(null);

        add_deduction.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        add_deduction.setText("Add Deduction");
        add_deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_deductionActionPerformed(evt);
            }
        });
        jPanel4.add(add_deduction);
        add_deduction.setBounds(340, 60, 170, 48);

        add_bonus.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        add_bonus.setText("Add Bonus");
        add_bonus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_bonusActionPerformed(evt);
            }
        });
        jPanel4.add(add_bonus);
        add_bonus.setBounds(50, 60, 170, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, -26, 560, 260);

        jTabbedPane6.addTab("Bonus & Deduction", jPanel4);

        jPanel10.setLayout(null);

        jButton22.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton22.setText("record Loan Request");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton22);
        jButton22.setBounds(10, 53, 181, 48);

        jButton19.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton19.setText("View Loan ");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton19);
        jButton19.setBounds(201, 53, 150, 48);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton1.setText("Confirm Loan Requests");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1);
        jButton1.setBounds(357, 53, 197, 48);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel10.add(jLabel5);
        jLabel5.setBounds(-6, -30, 570, 270);

        jTabbedPane6.addTab("Loan", jPanel10);

        jPanel11.setLayout(null);

        jButton24.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton24.setText("View Total Salary");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton24);
        jButton24.setBounds(60, 60, 157, 48);

        jButton25.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton25.setText("Pay Month Salary");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton25);
        jButton25.setBounds(340, 60, 159, 48);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel11.add(jLabel6);
        jLabel6.setBounds(-6, -26, 570, 260);

        jTabbedPane6.addTab("Payroll", jPanel11);

        main.add(jTabbedPane6);
        jTabbedPane6.setBounds(190, 70, 570, 260);

        welcome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("username");
        main.add(welcome);
        welcome.setBounds(80, 10, 120, 20);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        main.add(jButton2);
        jButton2.setBounds(600, 380, 100, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");
        main.add(jLabel1);
        jLabel1.setBounds(30, 10, 60, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        main.add(jLabel2);
        jLabel2.setBounds(-6, 0, 800, 480);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Leave");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 795, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed
//function employee Button
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
    this.setVisible(false);
    employee e=new employee();
    e.setUser(welcome.getText());
    e.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed
//function Setting Button
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.setVisible(false);
      Setting e= new Setting();
      e.setUser(welcome.getText());
      e.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed
//function Attendance Button
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
         this.setVisible(false);
         Attendance e=new Attendance();
          e.setUser(welcome.getText());
          e.setVisible(true);
    }//GEN-LAST:event_jButton13ActionPerformed
//function Add_Deduction Button
    private void add_deductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_deductionActionPerformed
        this.setVisible(false);
        new Add_Deduction().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_add_deductionActionPerformed
//function View_Loans Button
    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        this.setVisible(false); 
        View_Loans e=new View_Loans();
        e.getUser(welcome.getText());
        e.fetch();
        e.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed
//function Loan_Request Button
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
       this.setVisible(false);
       new Loan_Request().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed
//function Add_Bonus Button
    private void add_bonusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_bonusActionPerformed
    this.setVisible(false);
    new Add_Bonus().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_add_bonusActionPerformed
//function LogIn Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
             this.setVisible(false);
             new LogIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
//function Confirm_loans2 Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           this.setVisible(false);
           new Confirm_loans2().setVisible(true);
            

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//function pay month salary Button
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
          date d=new date();
       dialogResult1 =  JOptionPane.showConfirmDialog(null, "Do you want to pay month salary of "+d.date(), "confirm salary", 1, 2);
if(dialogResult1==0){
         dialogResult2=JOptionPane.showConfirmDialog(null, "are you sure");
}
if(dialogResult2==0){
      date=d.date();
      con=new MysqlConnect().ConnectDB();
      String sql="Insert Into finextra(`Taxs`,`HealthInsurance`,`incentives`,precntagedate)VALUES('0.03','0.1','0.15','"+date+"')";
      try{
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved Successfully");
      } catch(SQLException e){
          JOptionPane.showMessageDialog(null, e);
      }   
}
    }//GEN-LAST:event_jButton25ActionPerformed
//function Total_Salary Button
    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        
        this.setVisible(false);
       Total_Salary s= new Total_Salary();
        s.getUser(welcome.getText());
        s.view();
        s.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

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
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Finance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_bonus;
    private javax.swing.JButton add_deduction;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JPanel main;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables

    
}
