
package hrms.GUI;

import hrms.EmpBtn;


public class Add_Employee1 extends javax.swing.JFrame {
 //DOB =date of birth
     private int id,gradYear;
     private String holder,name,DOB,gender,status="single",deg,fac,unv,grade,addr,mob1,mob2,mail,exp,pid;

    public Add_Employee1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTextField11 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        TxtID = new javax.swing.JTextField();
        TxtName = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        Status = new javax.swing.JComboBox<>();
        address = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        mobile2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtdegree = new javax.swing.JTextField();
        faculty = new javax.swing.JTextField();
        university = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Grade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        TxtDOB = new org.jdesktop.swingx.JXDatePicker();
        graduationYear = new com.toedter.calendar.JYearChooser();
        idChk = new javax.swing.JLabel();
        DOBChk = new javax.swing.JLabel();
        nameChk = new javax.swing.JLabel();
        genderChk = new javax.swing.JLabel();
        maritalChk = new javax.swing.JLabel();
        qualificationChk = new javax.swing.JLabel();
        graduationChk = new javax.swing.JLabel();
        adressChk = new javax.swing.JLabel();
        mobileChk = new javax.swing.JLabel();
        emailChk = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TxtExperience = new java.awt.TextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtpID = new javax.swing.JTextField();
        chkID = new javax.swing.JLabel();
        chkpID = new javax.swing.JLabel();
        chkName = new javax.swing.JLabel();
        chkDegree = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        chkAddr = new javax.swing.JLabel();
        chkMob = new javax.swing.JLabel();
        ChkEmail = new javax.swing.JLabel();
        chkExp = new javax.swing.JLabel();
        chkDOB = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jTextField11.setText("jTextField11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 730));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Eras Medium ITC", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Personal Details :");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(10, 11, 142, 21);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel2.add(jLabel20);
        jLabel20.setBounds(0, 0, 530, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 530, 30);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(12, 13, 130, 22);

        jLabel2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Full Name :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 50, 130, 22);

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DOB :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 120, 82, 22);

        jLabel4.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gender :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 150, 52, 22);

        jLabel5.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marital status :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 190, 99, 22);

        jLabel6.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 340, 100, 22);

        jLabel8.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Mobile NUM :");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 390, 130, 22);

        jLabel9.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 440, 130, 22);

        TxtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDActionPerformed(evt);
            }
        });
        jPanel1.add(TxtID);
        TxtID.setBounds(162, 13, 25, 22);

        TxtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNameActionPerformed(evt);
            }
        });
        jPanel1.add(TxtName);
        TxtName.setBounds(160, 42, 190, 30);

        male.setBackground(new java.awt.Color(4, 4, 28));
        buttonGroup1.add(male);
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setSelected(true);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male);
        male.setBounds(160, 150, 60, 23);

        Female.setBackground(new java.awt.Color(4, 4, 28));
        buttonGroup1.add(Female);
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        jPanel1.add(Female);
        Female.setBounds(240, 150, 70, 23);

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Married", "Divorsed", "Widow" }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });
        jPanel1.add(Status);
        Status.setBounds(160, 190, 110, 20);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address);
        address.setBounds(150, 340, 330, 30);

        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        jPanel1.add(mobile);
        mobile.setBounds(150, 390, 150, 30);

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(150, 430, 185, 30);

        mobile2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mobile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobile2ActionPerformed(evt);
            }
        });
        jPanel1.add(mobile2);
        mobile2.setBounds(330, 390, 150, 30);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Another NUM");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(370, 370, 80, 20);

        jLabel11.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Qualification :");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 230, 84, 17);

        txtdegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdegreeActionPerformed(evt);
            }
        });
        jPanel1.add(txtdegree);
        txtdegree.setBounds(160, 230, 110, 30);

        faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyActionPerformed(evt);
            }
        });
        jPanel1.add(faculty);
        faculty.setBounds(290, 230, 105, 30);

        university.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                universityActionPerformed(evt);
            }
        });
        jPanel1.add(university);
        university.setBounds(410, 230, 106, 30);

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Facullty");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(310, 210, 50, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("UNV");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(440, 210, 30, 20);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("EX: BAC Degree");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(170, 210, 90, 20);

        jLabel15.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Grade :");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(280, 300, 44, 17);

        Grade.setText("Ex: V.Good (75%)");
        Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GradeActionPerformed(evt);
            }
        });
        jPanel1.add(Grade);
        Grade.setBounds(330, 290, 110, 30);

        jLabel16.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Graduation year :");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(10, 300, 106, 17);

        TxtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDOBActionPerformed(evt);
            }
        });
        jPanel1.add(TxtDOB);
        TxtDOB.setBounds(160, 120, 136, 22);
        jPanel1.add(graduationYear);
        graduationYear.setBounds(170, 290, 77, 30);

        idChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(idChk);
        idChk.setBounds(135, 13, 0, 0);

        DOBChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DOBChk);
        DOBChk.setBounds(118, 93, 0, 0);

        nameChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nameChk);
        nameChk.setBounds(118, 53, 0, 0);

        genderChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(genderChk);
        genderChk.setBounds(116, 128, 0, 0);

        maritalChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(maritalChk);
        maritalChk.setBounds(117, 160, 0, 0);

        qualificationChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(qualificationChk);
        qualificationChk.setBounds(117, 201, 0, 0);

        graduationChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(graduationChk);
        graduationChk.setBounds(124, 249, 0, 0);

        adressChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(adressChk);
        adressChk.setBounds(116, 286, 0, 0);

        mobileChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(mobileChk);
        mobileChk.setBounds(116, 329, 0, 0);

        emailChk.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(emailChk);
        emailChk.setBounds(118, 368, 0, 0);

        jLabel18.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Pervious Experinece :");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(0, 490, 130, 17);
        jPanel1.add(TxtExperience);
        TxtExperience.setBounds(150, 480, 220, 80);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Company/Position/Years..");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(380, 530, 140, 20);

        jLabel22.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Personal ID :");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(10, 90, 85, 17);

        txtpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtpID);
        txtpID.setBounds(160, 80, 200, 30);

        chkID.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(chkID);
        chkID.setBounds(191, 13, 100, 22);

        chkpID.setForeground(new java.awt.Color(199, 0, 0));
        chkpID.setMinimumSize(new java.awt.Dimension(15, 20));
        jPanel1.add(chkpID);
        chkpID.setBounds(360, 80, 160, 30);

        chkName.setForeground(new java.awt.Color(199, 0, 0));
        chkName.setMinimumSize(new java.awt.Dimension(15, 20));
        jPanel1.add(chkName);
        chkName.setBounds(370, 50, 150, 30);

        chkDegree.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(chkDegree);
        chkDegree.setBounds(134, 250, 160, 30);

        jLabel26.setForeground(new java.awt.Color(199, 0, 0));
        jLabel26.setMinimumSize(new java.awt.Dimension(15, 20));
        jPanel1.add(jLabel26);
        jLabel26.setBounds(450, 280, 70, 60);

        chkAddr.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(chkAddr);
        chkAddr.setBounds(180, 320, 140, 20);

        chkMob.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(chkMob);
        chkMob.setBounds(140, 370, 160, 23);

        ChkEmail.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(ChkEmail);
        ChkEmail.setBounds(360, 430, 150, 30);

        chkExp.setForeground(new java.awt.Color(199, 0, 0));
        jPanel1.add(chkExp);
        chkExp.setBounds(385, 484, 130, 50);

        chkDOB.setForeground(new java.awt.Color(199, 0, 0));
        chkDOB.setMaximumSize(new java.awt.Dimension(15, 20));
        chkDOB.setMinimumSize(new java.awt.Dimension(15, 20));
        jPanel1.add(chkDOB);
        chkDOB.setBounds(310, 120, 180, 20);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel1.add(jLabel24);
        jLabel24.setBounds(0, 0, 530, 590);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 30, 530, 590);

        jPanel3.setLayout(null);

        jButton1.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(162, 11, 70, 25);

        jButton2.setFont(new java.awt.Font("Eras Medium ITC", 0, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(293, 10, 80, 25);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrms/GUI/pics/FRaij7m.jpg"))); // NOI18N
        jPanel3.add(jLabel23);
        jLabel23.setBounds(0, 0, 530, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 620, 530, 40);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
//function to get any field in add employee 1 frame
private void get()
{
    holder=TxtID.getText();
      id=Integer.parseInt(holder);
      chkID.setText("");
        name=TxtName.getText();
        System.out.println("name");
        pid=txtpID.getText();
       System.out.println("pid");
        DOB=TxtDOB.getDate().toString();
       System.out.println("DOB");
       deg=txtdegree.getText();
       System.out.println("deg");
       fac=faculty.getText();
       System.out.println("fac");
       unv=university.getText();
       System.out.println("unv");
       gradYear=graduationYear.getYear();
       System.out.println("gradeyear");
       grade=Grade.getText();
       System.out.println("grade");
       addr=address.getText();
       System.out.println("addr");
       mob1=mobile.getText();
       System.out.println("mob");
       mob2=mobile2.getText(); 
       System.out.println("mob2");
       mail=email.getText();
       System.out.println("mail");
       exp=TxtExperience.getText();
       System.out.println("exp");
       System.out.println(DOB);
}
//function to check any field in add employee 1 frame
    private boolean check(){
        boolean f=true;
       try{
        if(Integer.parseInt(TxtID.getText())<=1)
        {chkID.setText("invalid id");     f=false;}else{chkID.setText("");}}catch(NumberFormatException e){chkID.setText("invalid id");     f=false;}
       System.out.println("reached11");
        if("".equalsIgnoreCase(TxtName.getText())){
            chkName.setText("invalid Name");     f=false;}else{chkName.setText("");}
       System.out.println("reached12");
        if(txtpID.getText().length()!=14){
            chkpID.setText("invalid personal ID");     f=false;}else{chkpID.setText("");}
        System.out.println("reached13");
        if("".equalsIgnoreCase(txtdegree.getText())||"".equalsIgnoreCase(faculty.getText())||"".equalsIgnoreCase(university.getText())){
                chkDegree.setText("invalid qualifications");     f=false;}else{chkDegree.setText("");}
        System.out.println("reached14");
        if("".equals(address.getText())){
            chkAddr.setText("invalid address");     f=false;}else{chkAddr.setText("");}
        System.out.println("reached15");
        if("".equals(mobile.getText())){
            chkMob.setText("invalid mobile");     f=false;}else{chkMob.setText("");}
        System.out.println("reached16");
        if("".equals(email.getText())){
            ChkEmail.setText("invalid email");     f=false;} else{ChkEmail.setText("");}
       System.out.println("reached17");
        if("".equals(TxtExperience.getText())){
           chkExp.setText("invalid  exp");     f=false;}else{chkExp.setText("");}
        System.out.println("reached18");
        try{
            TxtDOB.getDate().toString();
            chkDOB.setText("");
                    }catch(NullPointerException E){
           chkDOB.setText("invalid  DOB");     f=false;}
       System.out.println("reached19");
        return f;
        
    }
    //function Save Button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     if(check()){
        get();       
        EmpBtn emp=new EmpBtn();
        boolean addEmployee1 = emp.addEmployee1(id, name,pid, DOB, gender, status, deg, fac, unv, gradYear, grade, addr, mob1, mob2, mail, exp);
        if(addEmployee1){
             this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed
//function cancel Button
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new employee().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void GradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GradeActionPerformed
       
                    // TODO add your handling code here:
    }//GEN-LAST:event_GradeActionPerformed

    private void txtdegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdegreeActionPerformed
                // TODO add your handling code here:
         
         
    }//GEN-LAST:event_txtdegreeActionPerformed

    private void mobile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobile2ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_mobile2ActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed

    // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void TxtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNameActionPerformed
    
    // TODO add your handling code here:
    }//GEN-LAST:event_TxtNameActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed

               // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed
//when Gender male
    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender="male";
                
    }//GEN-LAST:event_maleActionPerformed
//when Gender female
    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        gender="female";                // TODO add your handling code here:
    }//GEN-LAST:event_FemaleActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
       status=(String)Status.getSelectedItem(); // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    
    private void TxtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDActionPerformed
  
        
                // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDActionPerformed
//function to get date of birth
    private void TxtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDOBActionPerformed
         DOB=TxtDOB.getToolTipText();
         // TODO add your handling code here:
    }//GEN-LAST:event_TxtDOBActionPerformed

    private void facultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyActionPerformed
       
                // TODO add your handling code here:
    }//GEN-LAST:event_facultyActionPerformed

    private void universityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_universityActionPerformed
        
               // TODO add your handling code here:
    }//GEN-LAST:event_universityActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
 
                
// TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void txtpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpIDActionPerformed
        
               // TODO add your handling code here:
    }//GEN-LAST:event_txtpIDActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Employee1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Add_Employee1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChkEmail;
    private javax.swing.JLabel DOBChk;
    private javax.swing.JRadioButton Female;
    private javax.swing.JTextField Grade;
    private javax.swing.JComboBox<String> Status;
    private org.jdesktop.swingx.JXDatePicker TxtDOB;
    private java.awt.TextArea TxtExperience;
    private javax.swing.JTextField TxtID;
    private javax.swing.JTextField TxtName;
    private javax.swing.JTextField address;
    private javax.swing.JLabel adressChk;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel chkAddr;
    private javax.swing.JLabel chkDOB;
    private javax.swing.JLabel chkDegree;
    private javax.swing.JLabel chkExp;
    private javax.swing.JLabel chkID;
    private javax.swing.JLabel chkMob;
    private javax.swing.JLabel chkName;
    private javax.swing.JLabel chkpID;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailChk;
    private javax.swing.JTextField faculty;
    private javax.swing.JLabel genderChk;
    private javax.swing.JLabel graduationChk;
    private com.toedter.calendar.JYearChooser graduationYear;
    private javax.swing.JLabel idChk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
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
    private javax.swing.JTextField jTextField11;
    private javax.swing.JRadioButton male;
    private javax.swing.JLabel maritalChk;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField mobile2;
    private javax.swing.JLabel mobileChk;
    private javax.swing.JLabel nameChk;
    private javax.swing.JLabel qualificationChk;
    private javax.swing.JTextField txtdegree;
    private javax.swing.JTextField txtpID;
    private javax.swing.JTextField university;
    // End of variables declaration//GEN-END:variables
}
