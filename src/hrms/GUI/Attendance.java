/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrms.GUI;

import hrms.date;

/**
 *
 * @author Islam
 */
public class Attendance extends javax.swing.JFrame {

    /**
     * Creates new form Attendence
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public Attendance() {
        initComponents();
    }
    public void setUser(String user){
        welcome.setText(user);
    }
    
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel9 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jButton10.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton10.setText("Finance");
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

        jButton13.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 70, 150, 260);

        jTabbedPane6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel4.setLayout(null);

        jButton21.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton21.setText("View Report");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton21);
        jButton21.setBounds(190, 80, 200, 48);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel4.add(jLabel3);
        jLabel3.setBounds(0, -26, 560, 260);

        jTabbedPane6.addTab("Attendance Management ", jPanel4);

        jPanel10.setLayout(null);

        jButton22.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton22.setText("Add Vacation Request");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton22);
        jButton22.setBounds(30, 90, 220, 48);

        jButton19.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton19.setText("Confirm Vacation Requests");
        jPanel10.add(jButton19);
        jButton19.setBounds(300, 90, 240, 48);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel10.add(jLabel5);
        jLabel5.setBounds(-6, 0, 570, 230);

        jTabbedPane6.addTab("Vacation", jPanel10);

        jPanel1.add(jTabbedPane6);
        jTabbedPane6.setBounds(190, 70, 570, 260);

        welcome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText(" username");
        jPanel1.add(welcome);
        welcome.setBounds(100, 10, 110, 20);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(620, 390, 100, 50);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 10, 60, 20);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-6, 0, 790, 480);

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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        this.setVisible(false);
        Finance e=new Finance();
        e.setUser(welcome.getText());
        e.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       this.setVisible(false);
       employee e= new employee();
       e.setUser(welcome.getText());
       e.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        this.setVisible(false);
      Setting e= new Setting();
      e.setUser(welcome.getText());
      e.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             this.setVisible(false);
             new LogIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Attendance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
