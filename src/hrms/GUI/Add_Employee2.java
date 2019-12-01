
package hrms.GUI;

import hrms.EmpBtn;

public class Add_Employee2 extends javax.swing.JFrame {

   private String user,pos,depart,cont,date;
    private double salary;
    private int id,gradYear;
    private String name, pid,DOB,gender,status,deg,fac,unv,grade,addr,mob1,mob2,mail,exp;
  
    
    
    public Add_Employee2() {
        initComponents();}
    
    
    
    
    /**
     *function to get all atrabilious from add employee 1
     * @param id
     * @param name
     * @param pid
     * @param DOB
     * @param gender
     * @param status
     * @param deg
     * @param fac
     * @param unv
     * @param gradYear
     * @param grade
     * @param addr
     * @param mob1
     * @param mob2
     * @param mail
     * @param exp
     */
    
    public Add_Employee2(int id,String name,String pid,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp) {
        initComponents();
        this.id=id;  this.name=name;  this.pid=pid;  this.DOB=DOB;  
            this.gender=gender;     this.status=status;   this.deg=deg;
            this.fac=fac;    this.unv=unv;  this.gradYear=gradYear;
            this.grade=grade;   this.addr=addr;  this.mob1=mob1;  this.mob2=mob2;
            this.mail=mail;    this.exp=exp;
        

        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jDialog3 = new javax.swing.JDialog();
        jDialog4 = new javax.swing.JDialog();
        jDialog5 = new javax.swing.JDialog();
        jDialog6 = new javax.swing.JDialog();
        jDialog7 = new javax.swing.JDialog();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dep = new javax.swing.JTextField();
        Position = new javax.swing.JTextField();
        Username = new javax.swing.JTextField();
        joining = new org.jdesktop.swingx.JXDatePicker();
        Lusername = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        Ldepartment = new javax.swing.JLabel();
        Lposition = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Salary = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lSalary = new javax.swing.JLabel();
        chxDate = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog4Layout = new javax.swing.GroupLayout(jDialog4.getContentPane());
        jDialog4.getContentPane().setLayout(jDialog4Layout);
        jDialog4Layout.setHorizontalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog4Layout.setVerticalGroup(
            jDialog4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog5Layout = new javax.swing.GroupLayout(jDialog5.getContentPane());
        jDialog5.getContentPane().setLayout(jDialog5Layout);
        jDialog5Layout.setHorizontalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog5Layout.setVerticalGroup(
            jDialog5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog6Layout = new javax.swing.GroupLayout(jDialog6.getContentPane());
        jDialog6.getContentPane().setLayout(jDialog6Layout);
        jDialog6Layout.setHorizontalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog6Layout.setVerticalGroup(
            jDialog6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog7Layout = new javax.swing.GroupLayout(jDialog7.getContentPane());
        jDialog7.getContentPane().setLayout(jDialog7Layout);
        jDialog7Layout.setHorizontalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog7Layout.setVerticalGroup(
            jDialog7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(380, 415));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Job Data :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 11, 83, 21);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(-6, 0, 380, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 374, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Date Of Joining :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(20, 80, 103, 17);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 30, 69, 17);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Position :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 130, 56, 17);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Department :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 180, 81, 17);

        dep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depActionPerformed(evt);
            }
        });
        dep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                depKeyReleased(evt);
            }
        });
        jPanel2.add(dep);
        dep.setBounds(150, 170, 120, 30);

        Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionActionPerformed(evt);
            }
        });
        Position.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PositionKeyReleased(evt);
            }
        });
        jPanel2.add(Position);
        Position.setBounds(150, 120, 120, 30);

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UsernameKeyReleased(evt);
            }
        });
        jPanel2.add(Username);
        Username.setBounds(150, 30, 120, 28);

        joining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joiningActionPerformed(evt);
            }
        });
        jPanel2.add(joining);
        joining.setBounds(150, 80, 150, 30);

        Lusername.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lusername.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(Lusername);
        Lusername.setBounds(280, 30, 90, 20);

        position.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        position.setForeground(new java.awt.Color(171, 19, 19));
        jPanel2.add(position);
        position.setBounds(280, 100, 80, 0);

        Ldepartment.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Ldepartment.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(Ldepartment);
        Ldepartment.setBounds(270, 170, 100, 20);

        Lposition.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        Lposition.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(Lposition);
        Lposition.setBounds(270, 130, 100, 20);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Salary :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 221, 58, 29);

        Salary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryActionPerformed(evt);
            }
        });
        jPanel2.add(Salary);
        Salary.setBounds(150, 222, 73, 29);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("EL");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(227, 220, 21, 30);

        lSalary.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        lSalary.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(lSalary);
        lSalary.setBounds(254, 221, 100, 31);

        chxDate.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        chxDate.setForeground(new java.awt.Color(177, 10, 10));
        jPanel2.add(chxDate);
        chxDate.setBounds(280, 80, 80, 20);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(-6, 10, 380, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 39, 374, 270);

        jPanel3.setLayout(null);

        jButton3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(109, 11, 80, 25);

        jButton4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(207, 11, 80, 25);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel10);
        jLabel10.setBounds(0, 0, 390, 50);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 310, 374, 50);

        jMenu1.setText("Menu");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Account");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Leave");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function cancel Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         this.setVisible(false);
         new Add_Employee1().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
   //function to check any field in add employee 2 frame 
 private boolean check(){
        boolean f=true;
           if(Username.getText().equalsIgnoreCase("")){
        Lusername.setText("invalid username");f=false; }else{Lusername.setText("");}
           if(Position.getText().equalsIgnoreCase("")){
        Lposition.setText("invalid Position");f=false; }else{Lposition.setText("");}
           if(dep.getText().equalsIgnoreCase("")){
        Ldepartment.setText("invalid Department");f=false; }else{Ldepartment.setText("");}
           if(Salary.getText().equalsIgnoreCase("")){
        lSalary.setText("invalid Salary");f=false; }else{lSalary.setText("");}
           try{
               joining.getDate().toString();
               chxDate.setText("");
           }catch(NullPointerException e){
               chxDate.setText("invalid Date");
               f=false;
           }
return f;
}
   //function to get any field in add employee 2 frame 
 private void get(){
        user=Username.getText();
        date=joining.getDate().toString();
        pos=Position.getText();
        depart=dep.getText();
        try{salary=Double.parseDouble(Salary.getText());}catch(NumberFormatException e){lSalary.setText("invalid Salary");}
        
    }
 //function confierm Button
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if( check()){
          get();
           EmpBtn emp=new EmpBtn();
          boolean addEmployee2 = emp.addEmployee2(id,name,pid,DOB,gender,status,deg,fac,unv,gradYear,grade,addr,mob1,mob2,mail,exp,user, date, pos, depart,salary);
          if(addEmployee2){
              this.setVisible(false);
          }
      }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionActionPerformed

    private void depActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_depActionPerformed

    private void UsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyReleased
       
            // TODO add your handling code here:
    }//GEN-LAST:event_UsernameKeyReleased

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void PositionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PositionKeyReleased
         
            // TODO add your handling code here:
    }//GEN-LAST:event_PositionKeyReleased

    private void depKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depKeyReleased
                // TODO add your handling code here:
    }//GEN-LAST:event_depKeyReleased

    private void SalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalaryActionPerformed

    private void joiningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joiningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_joiningActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Employee2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Employee2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ldepartment;
    private javax.swing.JLabel Lposition;
    private javax.swing.JLabel Lusername;
    private javax.swing.JTextField Position;
    private javax.swing.JTextField Salary;
    private javax.swing.JTextField Username;
    private javax.swing.JLabel chxDate;
    private javax.swing.JTextField dep;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JDialog jDialog4;
    private javax.swing.JDialog jDialog5;
    private javax.swing.JDialog jDialog6;
    private javax.swing.JDialog jDialog7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private org.jdesktop.swingx.JXDatePicker joining;
    private javax.swing.JLabel lSalary;
    private javax.swing.JLabel position;
    // End of variables declaration//GEN-END:variables
}
