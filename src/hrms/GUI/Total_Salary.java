
package hrms.GUI;

import hrms.MysqlConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import hrms.GUI.*;
import java.awt.HeadlessException;

public class Total_Salary extends javax.swing.JFrame {
    Connection con=null;
    PreparedStatement ps=null,ps2=null,ps3=null;
    ResultSet rs=null; 
    String User;
    int id;
    
   
    public void getUser(String username){
    User=username;
    }
    public Total_Salary() {
        initComponents();
         
    }
//function to view Total_Salary  
     void view(){
        con=new MysqlConnect().ConnectDB();
         String sql="Select * from jobinf where username='"+User+"'";
          try{
        ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
      while(rs.next()){
          id=rs.getInt("jobinfid");
          lsalary.setText(Double.toString(rs.getDouble("salary")));
          System.out.println(id);
        }
      sql="Select * from finance where idfinance='"+id+"'";
       ps=con.prepareStatement(sql);
      rs=ps.executeQuery();
      
         while(rs.next()){
             if(rs.getString("type").equalsIgnoreCase("bonus"))
      lbonus.setText(rs.getString("value"));
             if(rs.getString("type").equalsIgnoreCase("deduction"))
      lded.setText(rs.getString("value"));}
      
       sql="Select * from finextra ";
       ps=con.prepareStatement(sql);      
       rs=ps.executeQuery();
      while(rs.next()){
      lhealth.setText(rs.getString("HealthInsurance"));
     ltaxs.setText(rs.getString("taxs"));
      ldate.setText(rs.getString("precntagedate"));
      }
           }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lhealth = new javax.swing.JLabel();
        lded = new javax.swing.JLabel();
        lbonus = new javax.swing.JLabel();
        lsalary = new javax.swing.JLabel();
        ldate = new javax.swing.JLabel();
        ltaxs = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 360));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Total Salary :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 11, 137, 28);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, -10, 390, 70);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 390, 60));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Basic salary :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 22, 111, 17);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bonus :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 54, 111, 24);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Deduction :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 97, 111, 24);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Health Insurance :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 140, 111, 23);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Taxs :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 182, 111, 22);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(203, 18, 62, 24);

        lhealth.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lhealth);
        lhealth.setBounds(127, 141, 58, 23);

        lded.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lded);
        lded.setBounds(127, 98, 58, 24);

        lbonus.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lbonus);
        lbonus.setBounds(127, 55, 58, 24);

        lsalary.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lsalary);
        lsalary.setBounds(127, 19, 58, 24);

        ldate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ldate);
        ldate.setBounds(271, 19, 76, 25);

        ltaxs.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(ltaxs);
        ltaxs.setBounds(127, 182, 58, 19);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel15);
        jLabel15.setBounds(0, 0, 390, 220);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 390, 220));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setMinimumSize(new java.awt.Dimension(390, 60));
        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(280, 20, 89, 38);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel16);
        jLabel16.setBounds(0, 4, 390, 60);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 390, 70));

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function cancel Buttona
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
this.setVisible(false);
       new Finance().setVisible(true);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Total_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Total_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Total_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Total_Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
     
        java.awt.EventQueue.invokeLater(() -> {
            new Total_Salary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbonus;
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel lded;
    private javax.swing.JLabel lhealth;
    private javax.swing.JLabel lsalary;
    private javax.swing.JLabel ltaxs;
    // End of variables declaration//GEN-END:variables
}
