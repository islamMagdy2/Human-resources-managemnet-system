
package hrms.GUI;

import hrms.MysqlConnect;
import java.sql.*;
import javax.swing.JOptionPane;

public class Search_Contract extends javax.swing.JFrame {
    
      private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private String searchType="contractId=?",s;
    private int ID;

    
    public Search_Contract() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        eDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bDate = new javax.swing.JTextField();
        DOB3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(510, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Contract :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 160, 21);

        txtSearch.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jPanel1.add(txtSearch);
        txtSearch.setBounds(180, 10, 227, 30);

        jRadioButton1.setBackground(new java.awt.Color(3, 3, 55));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(260, 40, 39, 25);

        jRadioButton3.setBackground(new java.awt.Color(3, 3, 55));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Full Name");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(330, 40, 87, 25);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(420, 70, 75, 25);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-6, 0, 520, 110);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(null);

        jButton4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(160, 30, 110, 25);

        jButton5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(290, 30, 110, 25);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(-6, 4, 520, 70);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 390, 520, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contract ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 16, 100, 23);

        id.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(id);
        id.setBounds(160, 20, 44, 34);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 56, 90, 30);

        fName.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        fName.setPreferredSize(new java.awt.Dimension(80, 18));
        jPanel2.add(fName);
        fName.setBounds(160, 60, 239, 30);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contract Type :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 104, 150, 17);

        type.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(type);
        type.setBounds(160, 100, 165, 30);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Beginning date :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 150, 120, 17);

        eDate.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(eDate);
        eDate.setBounds(160, 180, 165, 30);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Expired Dtae :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 110, 17);

        bDate.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(bDate);
        bDate.setBounds(160, 140, 165, 30);

        DOB3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(DOB3);
        DOB3.setBounds(160, 140, 165, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel8);
        jLabel8.setBounds(-6, 0, 520, 270);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 520, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function search Type Button
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        searchType="contractId=?";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
//function search Type Button
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        searchType="name=?";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
//function cancel Button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new employee().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
//function to check any field in search contract frame
     private boolean check(){
           boolean c=true;
           if(searchType=="id=?"){
               try{
                ID=   Integer.parseInt(txtSearch.getText());
               }catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "invalid id");
                c=false;}
           }
           else if(searchType=="PersonalID=?"){
                   if(txtSearch.getText().length()!=14)
                   { JOptionPane.showMessageDialog(null, "invalid Personal id");
                   c=false;
                   }   
                   }
          
           return c;
       }
    //function to get any field in search contract frame
     private void get(){
        s=txtSearch.getText();
       }
    //function to fitch field in search contract frame
     private void fetch(){
        con=new MysqlConnect().ConnectDB();
        
        String sql="Select * from contractInf where "+searchType;
          try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,s);
        rs=ps.executeQuery();
      while(rs.next()){
      id.setText(Integer.toString(rs.getInt("contractId")));
      fName.setText(rs.getString("name"));
      type.setText(rs.getString("contractType"));
      bDate.setText(rs.getString("beg"));
      eDate.setText(rs.getString("exp"));
      
      }}catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
     }
     //function update Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        get();
        if(check() ){
            fetch();
        }

        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Search_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Contract.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Contract().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOB3;
    private javax.swing.JTextField bDate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField eDate;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField type;
    // End of variables declaration//GEN-END:variables
}
