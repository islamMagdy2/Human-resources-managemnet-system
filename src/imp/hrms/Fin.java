package imp.hrms;

import hrms.MysqlConnect;
import java.sql.*;
import javax.swing.JOptionPane;
import hrms.GUI.*;
import java.awt.HeadlessException;

public class Fin extends javax.swing.JFrame implements Ifinance{
    Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;  
   
    
    
    
    
    public void Login(String username, String password) {
        con=new MysqlConnect().ConnectDB();
        String sql="Select * from login where username=? and password=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2, password);
        rs=ps.executeQuery();
        
        if(rs.next()){
           JOptionPane.showMessageDialog(null, "welcome user");
        }
        else{
              JOptionPane.showMessageDialog(null,"invalid username or Password");}
        }catch(Exception err){
            JOptionPane.showMessageDialog(null,err);}
        try{
                if(con!=null)
                {con.close();
                 System.out.println("Connection is closed");
                }
                if(ps!=null)
                     ps.close();}catch(SQLException err){System.out.println("Error"); 
                     }                         
    } 
    public void Addemloyee1(int id,String name,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp){
           
     con=new MysqlConnect().ConnectDB();
            String sql="Select * from employee where id=?";
   
        try{
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        rs=ps.executeQuery();
            
        if(rs.next()){
         JOptionPane.showMessageDialog(null," already exist choose another ID..");
      
        }
           
        else {
        try{        this.setVisible(false);
              sql="INSERT INTO `hrms`.`employee` (`id`, `Full Name`, `DOB`, `Gender`, `Marital status`, `Qualification degree`, `Faculty`, `University`, `Graduation year`, `Grade`, `Address`, `Mobile Number`, `Additional Number`, `Email`, `Pervious Exp`)values('id','name','DOB','gender','status','deg','fac','unv','gradYear','grade','addr','mob1','mob2','mail','exp')";
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Saved Successfully");
             new Add_Employee2().setVisible(true);}catch(HeadlessException | SQLException e){  JOptionPane.showMessageDialog(null,e);}} 
        
       
                if(con!=null)
                {con.close();
                 System.out.println("Connection is closed");
                }
                if(ps!=null)
                     ps.close();}catch(SQLException err){
                     System.out.println("Error");                   }
       
    }
        public void Addemloyee2(String user, String date, String pos, String depart, String cont) {
     
        con=new MysqlConnect().ConnectDB();
        String sql="Select * from login where username=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        
        ps.setString(1,user);
        rs=ps.executeQuery();
        
        if(rs.next()){
           JOptionPane.showMessageDialog(null,"Already exist");}
        } catch(SQLException e){JOptionPane.showMessageDialog(null, e);}     
       
       }
    
public void Addcontract(int id, String EName, String contType, String beg, String exp, String salary){
 con=new MysqlConnect().ConnectDB();
        String sql="Select * from employee where fullName=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,EName);
        rs=ps.executeQuery();
        
        if(!rs.next()){
                           JOptionPane.showMessageDialog(null,"Employee Name Doesn't exist");
        }}catch(SQLException e){JOptionPane.showMessageDialog(null, e);}

}
    public void Addfinance(int id,String fullName,String department,String Value,String reason,String x,int year,int month){
   
            con=new MysqlConnect().ConnectDB();
            String sql="Select * from employee where id=? and fullname=? and department=?";
        try{
    
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2, fullName);
        ps.setString(3, department);        
        rs=ps.executeQuery();
      
        if(rs.next()){
       
            String ins="insert into xxxx(id,fullname,department,value,month,year,type,reason) values(?,?,?,?,?,?,?,?)";
try{
        month+=1;
            ps=con.prepareStatement(ins);
            ps.setInt(1,id);
            ps.setString(2, fullName);
            ps.setString(3,department);
            ps.setString(4,Value);
            ps.setInt(5,month);
            ps.setInt(6,year);
            ps.setString(7,x);
            ps.setString(8, reason);
                 ps.execute();
                 JOptionPane.showMessageDialog(null,"saved");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);            
        }   
        }
        else{
              JOptionPane.showMessageDialog(null,"invalid user");}
            }catch(Exception err){
            JOptionPane.showMessageDialog(null,err);}
        }

   
}