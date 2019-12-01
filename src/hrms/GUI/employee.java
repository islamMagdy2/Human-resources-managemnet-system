
package hrms.GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
public class employee extends javax.swing.JFrame {

   
    public employee() {
        initComponents();
    }
    public void setUser(String user){
        welcome.setText(user);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPanel4 = new javax.swing.JPanel();
        jpanel1 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        main = new javax.swing.JTabbedPane();
        employee_data = new javax.swing.JPanel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        contract_data = new javax.swing.JPanel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("jMenu5");

        jMenu7.setText("jMenu7");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel4.setLayout(null);

        jpanel1.setLayout(null);

        jPanel14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel14.setLayout(null);

        jButton14.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton14.setText("Financial");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton14);
        jButton14.setBounds(13, 84, 124, 40);

        jButton15.setBackground(new java.awt.Color(255, 255, 255));
        jButton15.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton15.setText("Employee");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton15);
        jButton15.setBounds(13, 33, 124, 40);

        jButton16.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton16.setText("Setting");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton16);
        jButton16.setBounds(13, 186, 124, 40);

        jButton28.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton28.setText("Attendance");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton28);
        jButton28.setBounds(13, 135, 124, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel14.add(jLabel4);
        jLabel4.setBounds(4, 4, 140, 250);

        jpanel1.add(jPanel14);
        jPanel14.setBounds(10, 70, 150, 260);

        main.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        employee_data.setLayout(null);

        jButton30.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton30.setText("Edit Employee");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        employee_data.add(jButton30);
        jButton30.setBounds(200, 60, 160, 48);

        jButton31.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton31.setText("Add Employee Data");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        employee_data.add(jButton31);
        jButton31.setBounds(10, 60, 180, 48);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton2.setText("Searh Employee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        employee_data.add(jButton2);
        jButton2.setBounds(370, 60, 150, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        employee_data.add(jLabel1);
        jLabel1.setBounds(-6, 0, 540, 230);

        main.addTab("Employee Data", employee_data);

        contract_data.setLayout(null);

        jButton33.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton33.setText("Add Contract");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        contract_data.add(jButton33);
        jButton33.setBounds(50, 70, 150, 48);

        jButton34.setFont(new java.awt.Font("Eras Medium ITC", 0, 16)); // NOI18N
        jButton34.setText("Search Contract");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        contract_data.add(jButton34);
        jButton34.setBounds(280, 70, 160, 48);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        contract_data.add(jLabel5);
        jLabel5.setBounds(-6, 0, 540, 230);

        main.addTab("Contracts Data", contract_data);

        jpanel1.add(main);
        main.setBounds(190, 70, 540, 260);

        welcome.setBackground(new java.awt.Color(255, 255, 255));
        welcome.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText(" username");
        jpanel1.add(welcome);
        welcome.setBounds(90, 10, 110, 20);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpanel1.add(jButton1);
        jButton1.setBounds(600, 370, 100, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome");
        jpanel1.add(jLabel3);
        jLabel3.setBounds(40, 10, 60, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jpanel1.add(jLabel2);
        jLabel2.setBounds(4, 0, 780, 450);

        jMenu2.setText("Account");
        jMenuBar1.add(jMenu2);

        jMenu8.setText("Setting");
        jMenuBar1.add(jMenu8);

        jMenu6.setText("Setting");
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 784, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function Finance Button
    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        this.setVisible(false);
      Finance e= new Finance();
      e.setUser(welcome.getText());
      e.setVisible(true);
        //JTabbedPane main=new JTabbedPane();
        //main.setSize(570, 260);
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed
//function Setting Button
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
 this.setVisible(false);
      Setting e= new Setting();
      e.setUser(welcome.getText());
      e.setVisible(true);            // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed
//function Attendance Button
    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        this.setVisible(false);
        Attendance e=new Attendance();
        e.setUser(welcome.getText());
        e.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed
//function login Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new LogIn().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//function Add_Contract Button
    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        this.setVisible(false);
        new Add_Contract().setVisible(true);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton33ActionPerformed
//function Add_Employee1 Button
    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        this.setVisible(false);
        new Add_Employee1().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed
//function Edit_employee Button
    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        this.setVisible(false);
        Edit_employee s=  new Edit_employee();
        s.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed
//function Search_Contract Button
    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        this.setVisible(false);
new Search_Contract().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed
//function Search_employee Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Search_employee().setVisible(true);
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
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new employee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contract_data;
    private javax.swing.JPanel employee_data;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JTabbedPane main;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
