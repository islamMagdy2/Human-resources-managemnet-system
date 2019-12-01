
package hrms.GUI;

import hrms.EmpBtn;
import hrms.MysqlConnect;
import java.sql.*;
import javax.swing.JOptionPane;


public class Edit_employee extends javax.swing.JFrame {
   
    private Connection con=null;
    private PreparedStatement ps=null;
    private ResultSet rs=null;
    private String searchType="id=?",s;   
    private int ID;
    private int idU,gradYearU;
    private String nameU,DOBU,genderU,statusU,degU,facU,unvU,gradeU,addrU,mob1U,mob2U,mailU,expU,pidU;
    private String userU,posU,departU,contU,dateU;
    private double salaryU;
   
    public Edit_employee() {
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
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        DOJ = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        department = new javax.swing.JTextField();
        salary = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        unv = new javax.swing.JTextField();
        gYear = new javax.swing.JTextField();
        gyear = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        degree = new javax.swing.JTextField();
        mStatus = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DOB = new javax.swing.JTextField();
        exp = new java.awt.TextArea();
        mail = new javax.swing.JTextField();
        grade = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        num = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        faculty = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(747, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search Employee :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(104, 12, 160, 21);

        txtSearch.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jPanel1.add(txtSearch);
        txtSearch.setBounds(274, 11, 227, 30);

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
        jRadioButton1.setBounds(284, 42, 39, 25);

        jRadioButton2.setBackground(new java.awt.Color(3, 3, 55));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Personal ID");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(323, 42, 95, 25);

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
        jRadioButton3.setBounds(418, 42, 87, 25);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(536, 42, 75, 25);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(0, 0, 740, 80);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 740, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 16, 53, 23);

        id.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(id);
        id.setBounds(160, 20, 44, 34);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Full Name :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 56, 69, 30);

        fName.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        fName.setPreferredSize(new java.awt.Dimension(80, 18));
        jPanel2.add(fName);
        fName.setBounds(160, 60, 239, 30);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personal ID :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 104, 150, 17);

        pId.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        pId.setPreferredSize(new java.awt.Dimension(80, 18));
        jPanel2.add(pId);
        pId.setBounds(160, 100, 239, 30);

        jLabel15.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pervious Exp :");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(470, 60, 86, 25);

        jLabel14.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Email :");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(480, 20, 69, 25);

        jLabel16.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Username :");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(470, 140, 86, 26);

        jLabel17.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("DOJ :");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(470, 180, 86, 26);

        username.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(570, 140, 136, 26);

        DOJ.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        DOJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOJActionPerformed(evt);
            }
        });
        jPanel2.add(DOJ);
        DOJ.setBounds(570, 180, 128, 30);

        position.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(position);
        position.setBounds(570, 230, 128, 26);

        jLabel18.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Position :");
        jPanel2.add(jLabel18);
        jLabel18.setBounds(470, 230, 69, 26);

        jLabel19.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Department :");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(470, 270, 90, 26);

        department.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentActionPerformed(evt);
            }
        });
        jPanel2.add(department);
        department.setBounds(570, 270, 122, 31);

        salary.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(salary);
        salary.setBounds(570, 320, 122, 26);

        jLabel20.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Salary :");
        jPanel2.add(jLabel20);
        jLabel20.setBounds(470, 320, 86, 26);

        unv.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(unv);
        unv.setBounds(340, 310, 100, 26);

        gYear.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(gYear);
        gYear.setBounds(160, 350, 165, 26);

        gyear.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        gyear.setForeground(new java.awt.Color(255, 255, 255));
        gyear.setText("Graduation year :");
        jPanel2.add(gyear);
        gyear.setBounds(10, 350, 120, 26);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Faculty :");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 310, 92, 26);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Qualification Degree :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 270, 225, 26);

        jLabel7.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Marital Status :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 240, 104, 17);

        degree.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(degree);
        degree.setBounds(160, 270, 165, 26);

        mStatus.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(mStatus);
        mStatus.setBounds(160, 230, 165, 30);

        gender.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(gender);
        gender.setBounds(160, 190, 165, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 190, 70, 30);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DOB :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 150, 104, 17);

        DOB.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(DOB);
        DOB.setBounds(160, 140, 165, 30);
        jPanel2.add(exp);
        exp.setBounds(570, 60, 163, 64);

        mail.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(mail);
        mail.setBounds(570, 20, 129, 25);

        grade.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(grade);
        grade.setBounds(160, 390, 167, 26);

        addr.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(addr);
        addr.setBounds(160, 430, 429, 26);

        num.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(num);
        num.setBounds(160, 480, 164, 26);

        num2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(num2);
        num2.setBounds(350, 480, 183, 26);

        jLabel13.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Mobile Num :");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(10, 480, 92, 26);

        jLabel12.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Address :");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 430, 61, 26);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grade :");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 390, 92, 26);

        jLabel21.setFont(new java.awt.Font("Eras Medium ITC", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("EL");
        jPanel2.add(jLabel21);
        jLabel21.setBounds(700, 324, 40, 20);

        jLabel10.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("UNV.");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(370, 290, 50, 17);

        faculty.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jPanel2.add(faculty);
        faculty.setBounds(160, 310, 165, 26);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel23);
        jLabel23.setBounds(0, 0, 740, 530);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 740, 530);

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
        jButton4.setBounds(300, 10, 110, 25);

        jButton5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(543, 10, 110, 25);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(420, 8, 110, 25);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel24);
        jLabel24.setBounds(0, 0, 740, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 630, 740, 40);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function set type of search
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        searchType="PersonalID=?";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed
//function cancel Button
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
         new employee().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void departmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentActionPerformed

    private void DOJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DOJActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed
    //function to check type of search edit employee frame   
    private boolean check(){
           boolean c=true;
           if("id=?".equals(searchType)){
               try{
                ID=   Integer.parseInt(txtSearch.getText());
               }catch(NumberFormatException e){JOptionPane.showMessageDialog(null, "invalid id");
                c=false;}
           }
           else if("PersonalID=?".equals(searchType)){
                   if(txtSearch.getText().length()!=14)
                   { JOptionPane.showMessageDialog(null, "invalid Personal id");
                   c=false;
                   }   
                   }
          
           return c;
       }  
      //function to get type of search in edit employee frame  
       private void get(){
        s=txtSearch.getText();
       }
       
           //function to fetch information employee   
       private void fetch(){
          
           con=new MysqlConnect().ConnectDB();
        
        String sql="Select * from employee where "+searchType;
          try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,s);
        rs=ps.executeQuery();
     while(rs.next()){
          id.setText(Integer.toString(rs.getInt("id")));
          fName.setText(rs.getString("FullName"));
          pId.setText(rs.getString("PersonalID"));
          DOB.setText(rs.getString("DOB"));
          gender.setText(rs.getString("Gender"));
          mStatus.setText(rs.getString("MaritalStatus"));
          degree.setText(rs.getString("QualificationDegree"));
          faculty.setText(rs.getString("Faculty"));
          unv.setText(rs.getString("University"));
          gYear.setText(Integer.toString(rs.getInt("Graduationyear")));
          grade.setText(rs.getString("Grade"));
          addr.setText(rs.getString("Address"));
          num.setText(rs.getString("MobileNumber"));
          num2.setText(rs.getString("AdditionalNumber"));
          mail.setText(rs.getString("Email"));
          exp.setText(rs.getString("PerviousExp"));
      
        }
     
      sql="Select * from jobInf where jobinfid=?";
      ps=con.prepareStatement(sql);
        ps.setString(1,id.getText());
        rs=ps.executeQuery();
      while(rs.next()){
      username.setText(rs.getString("username"));
      DOJ.setText(rs.getString("DOJ"));
      position.setText(rs.getString("position"));
      department.setText(rs.getString("department"));
      salary.setText(Double.toString(rs.getDouble("salary")));
      
      }
      if(con!=null)
                {con.close();
                 System.out.println("Connection is closed");
                }
                if(ps!=null)
                     ps.close();
          }catch(SQLException e){
              JOptionPane.showMessageDialog(null, e);
          }
    }
//function  search Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        get();
        if(check()){
            fetch();
        }   
        
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
//function set type of search
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        searchType="id=?";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed
//function set type of search
    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        searchType="FullName=?";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed
      //function to get in edit employee frame   
    private void getU(){
        idU=Integer.parseInt(id.getText());
          nameU=fName.getText();
          pidU=pId.getText();
          DOBU=DOB.getText();
          genderU=gender.getText();
          statusU=mStatus.getText();
          degU=degree.getText();
          facU=faculty.getText();
          unvU=unv.getText();
          gradYearU=Integer.parseInt(gYear.getText());
          gradeU=grade.getText();
          addrU=addr.getText();
          mob1U=num.getText();
          mob2U=num2.getText();
          mailU=mail.getText();
          expU=exp.getText();
         userU= username.getText();
         dateU= DOJ.getText();
         posU=position.getText();
         departU=department.getText();
         salaryU=Double.parseDouble(salary.getText());
    }
    @SuppressWarnings("empty-statement")
//function to check all filed edit employee frame
    private boolean checkU(){
        boolean f=true;
       if(idU<=1){ JOptionPane.showMessageDialog(null, "invalid id");     f=false;}
        if("".equalsIgnoreCase(nameU)){
            JOptionPane.showMessageDialog(null, "invalid Full name");     f=false;}
        if(pidU.length()!=14){
            JOptionPane.showMessageDialog(null, "invalid personal id");     f=false;}
        if("".equalsIgnoreCase(statusU)||"".equalsIgnoreCase(facU)||"".equalsIgnoreCase(unvU)){
            JOptionPane.showMessageDialog(null, "invalid status");     f=false;}
        if("".equals(addrU)){
            JOptionPane.showMessageDialog(null, "invalid address");     f=false;}
        if("".equals(mob1U)){
            JOptionPane.showMessageDialog(null, "invalid mob");      f=false;}
        if("".equals(mailU)){
            JOptionPane.showMessageDialog(null, "invalid email");     f=false;} 
        if("".equals(expU)){
            JOptionPane.showMessageDialog(null, "invalid  exp");     f=false;}
        if("".equals(DOBU)){
            JOptionPane.showMessageDialog(null,"invalid Date of birth");     f=false;}
        if(userU.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "invalid username");   f=false; }
        if(posU.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "invalid Position"); ;f=false; }
        if(departU.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "invalid department"); f=false; }
        if(Double.toString(salaryU).equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "invalid Salary"); f=false; }
       
       return f;
    }
    //function udate Button
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getU();
        if(checkU()){
        EmpBtn e=new EmpBtn();
        e.updateEmployee(idU, nameU, pidU, DOBU, genderU, statusU, degU, facU, unvU, gradYearU, gradeU, addrU, mob1U, mob2U, mailU, expU,userU, dateU, posU, departU,salaryU);
        }
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed
//function DELETE Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          con=new MysqlConnect().ConnectDB();
        
        String sql="DELETE FROM `hrms`.`employee` WHERE `id`='"+id.getText()+"';";
        try{
        
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
       /* sql="DELETE FROM `hrms`.`employee` WHERE `jobinfid`='"+id.getText()+"';";
        ps=con.prepareStatement(sql);
        ps.executeUpdate();*/
        JOptionPane.showMessageDialog(null, "Employee deleted successfully ..");}catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e);}       // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Edit_employee().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DOB;
    private javax.swing.JTextField DOJ;
    private javax.swing.JTextField addr;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField degree;
    private javax.swing.JTextField department;
    private java.awt.TextArea exp;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField faculty;
    private javax.swing.JTextField gYear;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField grade;
    private javax.swing.JLabel gyear;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField mStatus;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField num;
    private javax.swing.JTextField num2;
    private javax.swing.JTextField pId;
    private javax.swing.JTextField position;
    private javax.swing.JTextField salary;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField unv;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
