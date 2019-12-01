
package hrms;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


public class Financial {
     Connection con=null;
    PreparedStatement ps=null;
    ResultSet rs=null;  
    
    /**
     *function to add Personal Bonus & Deduction and Loan in HRMS database
     * @param id
     * @param fullName
     * @param department
     * @param Value
     * @param reason
     * @param x
     * @param year
     * @param month
     */
    public void Addfinance(int id,String fullName,String department,String Value,String reason,String x,int year,int month){
   
            con=new MysqlConnect().ConnectDB();
            String sql="Select * from employee where id=? and FullName=?";
        try{
    
         ps=con.prepareStatement(sql);
         ps.setInt(1,id);
         ps.setString(2, fullName);      
            rs=ps.executeQuery();
       
        if(rs.next()){
            System.out.println("reached");
            sql="Select * from jobInf where id=? and department=?";
             try{
    
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2,department);      
        rs=ps.executeQuery();
      
            if(rs.next()){
                String ins="insert into finance(id,fullname,department,value,month,year,reason,type) values(?,?,?,?,?,?,?,?)";
        
            ps=con.prepareStatement(ins);
            ps.setInt(1,id);
            ps.setString(2, fullName);
            ps.setString(3,department);
            ps.setString(4,Value);
            ps.setInt(5,month);
            ps.setInt(6,year);
            ps.setString(7,reason);
            ps.setString(8, x);
            ps.execute();
           JOptionPane.showMessageDialog(null,"saved");
            
        }else{
              JOptionPane.showMessageDialog(null,"Couldn't find this employee");}
            }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);            
        }   
        }else{
              JOptionPane.showMessageDialog(null,"Couldn't find this employee");}
            }catch(HeadlessException | SQLException err){
            JOptionPane.showMessageDialog(null,err);}
            }
    
    /**
     *function to add Loan request  for employee in HRMS database
     * @param id
     * @param fullName
     * @param department
     * @param Value
     * @param reason
     * @param year
     * @param month
     */
    public void request(int id,String fullName,String department,String Value,String reason,int year,int month){
                con=new MysqlConnect().ConnectDB();
            String sql="Select * from employee where id=? and FullName=?";
        try{
    
         ps=con.prepareStatement(sql);
         ps.setInt(1,id);
         ps.setString(2, fullName);      
            rs=ps.executeQuery();
       
        if(rs.next()){
            System.out.println("reached");
            sql="Select * from jobInf where id=? and department=?";
             try{
    
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setString(2,department);      
        rs=ps.executeQuery();
      
            if(rs.next()){
                String ins="insert into loanReq(id,fullname,department,value,month,year,reason,state) values(?,?,?,?,?,?,?,?)";
        
            ps=con.prepareStatement(ins);
            ps.setInt(1,id);
            ps.setString(2, fullName);
            ps.setString(3,department);
            ps.setString(4,Value);
            ps.setInt(5,month);
            ps.setInt(6,year);
            ps.setString(7,reason);
            ps.setString(8,"pending");
            ps.execute();
           JOptionPane.showMessageDialog(null,"saved");
            
        }else{
              JOptionPane.showMessageDialog(null,"Couldn't find this employee");}
            }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,e);            
        }   
        }else{
              JOptionPane.showMessageDialog(null,"Couldn't find this employee");}
            }catch(HeadlessException | SQLException err){
            JOptionPane.showMessageDialog(null,err);}
}
    
   
}  
        
    

   

