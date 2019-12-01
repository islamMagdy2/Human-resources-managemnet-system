
package hrms;

import hrms.GUI.employee;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;


public class Log_in {
   private Connection con;
   private PreparedStatement ps;
   private ResultSet rs; 
   private boolean c=false;
   private int id;
   private String name;
    /**
     *function to login in HRMS program
     * @param username
     * @param password
     * @return 
     */
    public boolean login(String username, String password) {
        con=new MysqlConnect().ConnectDB();
        String sql="Select * from login where username=? and password=?";
        
        try{
        
        ps=con.prepareStatement(sql);
        ps.setString(1,username);
        ps.setString(2, password);
        rs=ps.executeQuery();
        
        if(rs.next()){
           JOptionPane.showMessageDialog(null, "Welcome "+username);
           c=true;
           employee e=new employee();
           e.setVisible(true);
           e.setUser(username);
           sql="Select * from jobinf where username=?";
           ps=con.prepareStatement(sql);
           ps.setString(1,username);
           rs=ps.executeQuery();
           if(rs.next()){
               id=rs.getInt("jobinfid");
           }
            sql="Select * from employee where id='"+id+"';";
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            if(rs.next()){
                name=rs.getString("FullName");
            }
           recordattend();
        }
        else{
              JOptionPane.showMessageDialog(null,"invalid username or Password");}
        }catch(HeadlessException | SQLException err){
            JOptionPane.showMessageDialog(null,err);}
        try{
                if(con!=null)
                {con.close();
                 System.out.println("Connection is closed");
                }
                if(ps!=null)
                     ps.close();}catch(SQLException err){System.out.println("Error"); 
                     }
        return c;
    } 
    //function to record attend when user log_in
    private void recordattend(){
        String d,m,y,date,time,sql;
        date e=new date();
        d=e.day();
        m=e.month();
        y=e.year();
        date=e.date();
        time=e.time();
        con=new MysqlConnect().ConnectDB();
         sql="INSERT INTO `hrms`.`attendance` (`attenid`, `fullname`, `year`, `month`, `day`, `date`, `time`, `state`) VALUES ('"+id+"','"+name+"','"+y+"','"+m+"','"+d+"','"+date+"','"+time+"','attendtime');";
         try{
             ps=con.prepareStatement(sql);
              ps.executeUpdate();
         }catch(SQLException s){
             JOptionPane.showMessageDialog(null, s);
         }
        
    }

    /**
     *function to add User in log_in
     * @param user
     * @param pass
     * @param pos
     * @return
     */
    public boolean addUser(String user,String pass,String pos){
     con=new MysqlConnect().ConnectDB();
     String sql="Select * from jobinf where username=?";
   
        try{
        ps=con.prepareStatement(sql);
        ps.setString(1,user);
        rs=ps.executeQuery();
            
        if(rs.next()){
          sql="Select * from login where username=?";
          ps=con.prepareStatement(sql);
        ps.setString(1,user);
          rs=ps.executeQuery();
          if(rs.next()){
         JOptionPane.showMessageDialog(null,"This employee is already signed up ..");     
        
          }
          else{
              sql="INSERT INTO `hrms`.`login` (`username`, `password`,`position`) VALUES ('"+user+"', '"+pass+"','"+pos+"');";
              ps=con.prepareStatement(sql);
              ps.executeUpdate();
              JOptionPane.showMessageDialog(null, "Employee added successfully .. you can login now ....");
              c=true;
          }
         
        }
        else{
            JOptionPane.showMessageDialog(null, "This employee isn't exist .. you can't sign up ....");
            
        }}catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
           
  return c;   
}     

    /**
     * function to add user in HRMS data base
     * @param user
     * @param pass
     * @param pos
     * @return
     */
    public boolean addUser1(String user,String pass,String pos){
con=new MysqlConnect().ConnectDB();
     String sql="Select * from login where username=?";
   
        try{
          
          ps=con.prepareStatement(sql);
        ps.setString(1,user);
          rs=ps.executeQuery();
          if(rs.next()){
         JOptionPane.showMessageDialog(null,"This username is already exist ..");     
        
          }
          else{
              sql="INSERT INTO `hrms`.`login` (`username`, `password`,`position`) VALUES ('"+user+"', '"+pass+"','"+pos+"');";
              ps=con.prepareStatement(sql);
              ps.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "user added successfully .. you can login now ....");
              c=true;
          }
         
        }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
           
  return c;   
}     

    /**
     *function to change Password log_in
     * @param user
     * @param Opass
     * @param Npass
     * @return
     */
    public boolean changePass(String user,String Opass,String Npass){
    con=new MysqlConnect().ConnectDB();
     String sql="Select * from login where username=? and password=?";
     try{
          
          ps=con.prepareStatement(sql);
          ps.setString(1,user);
          ps.setString(2, Opass);
          rs=ps.executeQuery();
          if(rs.next()){
            sql="UPDATE `hrms`.`login` SET `password`=? WHERE `username`=?;";
            ps=con.prepareStatement(sql);
            ps.setString(1,Npass);
            ps.setString(2, user);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Password changed successfully");
            c=true;
          }
          else{
              JOptionPane.showMessageDialog(null, "old password isn't correct .. ");
          }
           }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, e);
                  }
     return c;
}
}
