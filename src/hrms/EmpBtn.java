
package hrms;

import hrms.GUI.Add_Employee2;
import hrms.GUI.employee;
import java.sql.*;
import javax.swing.JOptionPane;

public class EmpBtn {
    
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs; 
    
    /**
     *function to add Personal Details for employee in HRMS database
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
     * @return 
     */
    public boolean addEmployee1(int id,String name,String pid,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp){
    
     boolean c=true;
     con=new MysqlConnect().ConnectDB();
     String sql="Select * from employee where id=?";
   
        try{
        ps=con.prepareStatement(sql);
        ps.setString(1,Integer.toString(id));
        rs=ps.executeQuery();
            
        if(rs.next()){
         JOptionPane.showMessageDialog(null," already exist choose another ID..");
         c=false;
        }
           
        else {
            
            new Add_Employee2(id,name,pid,DOB,gender,status,deg,fac,unv,gradYear,grade,addr,mob1,mob2,mail,exp).setVisible(true);}
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);
        c=false;}
       return c;
    }
    
    /**
     *function to add Job Details for employee in HRMS database
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
     * @param user
     * @param date
     * @param pos
     * @param depart
     * @param salary
     * @return
     */
    public boolean addEmployee2(int id,String name,String pid,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp,String user, String date, String pos, String depart,double salary) {
        boolean c=true;
        con=new MysqlConnect().ConnectDB();
        String sql="Select * from login where username=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,user);
        rs=ps.executeQuery();
        
        if(rs.next()){
           JOptionPane.showMessageDialog(null,"Username already exist");
            c=false;}
        else{
            sql="INSERT INTO `hrms`.`employee` (`id`, `FullName`, `PersonalID`, `DOB`, `Gender`, `MaritalStatus`, `QualificationDegree`, `Faculty`, `University`, `Graduationyear`, `Grade`, `Address`, `MobileNumber`, `AdditionalNumber`, `Email`, `PerviousExp`) VALUES ('"+id+"','"+name+"','"+pid+"','"+DOB+"','"+gender+"','"+status+"','"+deg+"','"+fac+"','"+unv+"','"+gradYear+"','"+grade+"','"+addr+"','"+mob1+"','"+mob2+"','"+mail+"','"+exp+"')";
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
              
              sql="INSERT INTO `hrms`.`jobInf` (`jobinfid`,`username`, `DOJ`, `position`, `department`, `salary`)"
                      + " values('"+id+"','"+user+"','"+date+"','"+pos+"','"+depart+"','"+salary+"')";
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null,"Saved Successfully");
              new employee().setVisible(true);
        } 
        
       
                if(con!=null)
                {con.close();
                 System.out.println("Connection is closed");
                }
                if(ps!=null)
                     ps.close();}catch(SQLException err){
                     JOptionPane.showMessageDialog(null, err);
                     c=false;
        }
         
       return c;
       }
    
    /**
     *function to add contract Details for employee in HRMS database
     * @param id
     * @param EName
     * @param contType
     * @param beg
     * @param exp
     */
    public void Addcontract(int id, String EName, String contType, String beg, String exp){
 con=new MysqlConnect().ConnectDB();
        String sql="Select * from employee where fullName=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,EName);
        rs=ps.executeQuery();
        
        if(!rs.next()){
                           JOptionPane.showMessageDialog(null,"Employee Name Doesn't exist");
        }
        else{
                sql="INSERT INTO `hrms`.`contractInf` (`contractId`, `name`, `contractType`, `beg`, `exp`)values('"+id+"','"+EName+"','"+contType+"','"+beg+"','"+exp+"')";
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
               JOptionPane.showMessageDialog(null,"Added Successfully");
                }
        
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}

        
}

    /**
     *function to update Details for employee in HRMS database
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
     * @param user
     * @param date
     * @param pos
     * @param depart
     * @param salary
     */
    public void updateEmployee(int id,String name,String pid,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp,String user, String date, String pos, String depart,double salary){
        con=new MysqlConnect().ConnectDB();
         String sql="UPDATE `hrms`.`employee` SET `id`=?,`FullName`=?, `PersonalID`=?, `DOB`=?, `Gender`=?,"
                 + " `MaritalStatus`=?, `QualificationDegree`=?, `Faculty`=?, `University`=?,"
                 + " `Graduationyear`=?, `Grade`=?, `Address`=?, `MobileNumber`=?, `AdditionalNumber`=?, `Email`=?, `PerviousExp`=? WHERE `id`=?";
   
        try{      
         ps=con.prepareStatement(sql);
            ps.setString(1,Integer.toString(id));
            ps.setString(2,name);
            ps.setString(3, pid);
            ps.setString(4, DOB);
            ps.setString(5, gender);
            ps.setString(6, status);
            ps.setString(7, deg);
            ps.setString(8, fac);
            ps.setString(9, unv);
            ps.setString(10,Integer.toString(gradYear));
            ps.setString(11, grade);
            ps.setString(12, addr);
            ps.setString(13,mob1);
            ps.setString(14, mob2);
            ps.setString(15, mail);
            ps.setString(16, exp);
            ps.setString(17, Integer.toString(id));
             ps.executeUpdate();
        sql="UPDATE `hrms`.`jobinf` SET `jobinfid`=?, `username`=?, `DOJ`=?, `position`=?, `department`=?, `salary`=? WHERE `jobinfid`=?;";     
            ps=con.prepareStatement(sql); 
            ps.setString(1,Integer.toString(id));
            ps.setString(2,user);
            ps.setString(3, date);
            ps.setString(4, pos);
            ps.setString(5, depart);
            ps.setString(6, Double.toString(salary));
            ps.setString(7,Integer.toString(id));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Updated Successfully");
                    }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        }}
         
       