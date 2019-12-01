
package hrms.GUI;

import hrms.Financial;
import hrms.MysqlConnect;
import hrms.confirm;
import java.sql.*;
import javax.swing.JOptionPane;

public class View_Loans extends javax.swing.JFrame {

    int id,year,month;
    String fullName,department,Value,reason,User;
    Connection con;
        PreparedStatement ps;
        ResultSet rs;
    
    public View_Loans() {
        initComponents();
    }

        public void getUser(String username){
    User=username;
    }
      //function to fetch all field in view loans frame 
        public void fetch(){
        
         con=new MysqlConnect().ConnectDB();
         String sql="Select * from jobinf where username='"+User+"'";
        try{
     ps=con.prepareStatement(sql);
        rs=ps.executeQuery();
      while(rs.next()){
          id=rs.getInt("jobinfid");}
      sql="Select * from loanreq where idloanreq='"+id+"'";
         ps=con.prepareStatement(sql);
         rs=ps.executeQuery();
       
        while(rs.next()){
            Lid.setText(Integer.toString(rs.getInt("idloanreq")));
            Lname.setText(rs.getString("fullname"));
            Ldep.setText(rs.getString("department"));
            Lvalue.setText(rs.getString("value"));
            Lmonth.setText(rs.getString("month"));
            Lyear.setText(rs.getString("year"));
            Lreason.setText(convertToMultiline(rs.getString("reason")));
            lstate.setText(rs.getString("state"));
        }
        
    }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
      }
      
      
      public static String convertToMultiline(String orig)
{
    return "<html>" + orig.replaceAll("\n", "<br>");
}
      //function to get all field in view loans frame 
    private void get(){
        id=Integer.parseInt(Lid.getName());
        fullName=Lname.getText();
        department=Ldep.getText();
        Value=Lvalue.getText();
        reason=Lreason.getText();
        year=Integer.parseInt(Lyear.getText());
        month=Integer.parseInt(Lmonth.getText());
    }
      
      
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Ldep = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        Lid = new javax.swing.JLabel();
        Lvalue = new javax.swing.JLabel();
        Lmonth = new javax.swing.JLabel();
        Lyear = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Lreason = new javax.swing.JLabel();
        lstate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Loan requests :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 146, 29);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel17);
        jLabel17.setBounds(0, 0, 400, 50);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

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

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(12, 90, 81, 17);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loan Value :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(12, 128, 75, 17);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EL");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(160, 130, 15, 17);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("For Month :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(12, 165, 73, 17);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Reason :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(12, 200, 51, 17);

        Ldep.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Ldep.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Ldep);
        Ldep.setBounds(100, 80, 154, 28);

        Lname.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lname);
        Lname.setBounds(100, 40, 154, 40);

        Lid.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lid);
        Lid.setBounds(101, 11, 0, 25);

        Lvalue.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lvalue.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lvalue);
        Lvalue.setBounds(98, 123, 50, 30);

        Lmonth.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lmonth.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lmonth);
        Lmonth.setBounds(100, 160, 48, 25);

        Lyear.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lyear.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lyear);
        Lyear.setBounds(160, 160, 50, 25);

        jLabel15.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(145, 143, 10, 60);

        Lreason.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lreason.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(Lreason);
        Lreason.setBounds(80, 200, 104, 25);

        lstate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(lstate);
        lstate.setBounds(80, 230, 80, 30);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("State :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 230, 60, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(0, 0, 400, 280);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 400, 280));

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(263, 11, 94, 23);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel19);
        jLabel19.setBounds(0, 0, 400, 50);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 400, 50));

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function cancel Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new Finance().setVisible(true);
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(View_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Loans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new View_Loans().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldep;
    private javax.swing.JLabel Lid;
    private javax.swing.JLabel Lmonth;
    private javax.swing.JLabel Lname;
    private javax.swing.JLabel Lreason;
    private javax.swing.JLabel Lvalue;
    private javax.swing.JLabel Lyear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JLabel lstate;
    // End of variables declaration//GEN-END:variables
}
