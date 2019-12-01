
package hrms;

import java.sql.*;
import javax.swing.JOptionPane;


public class Add_user {
    private Connection con;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean c=true;

    /**
     *function to add User in HRMS database
     * @param user
     * @param pass
     * @return
     */
    public boolean addUser(String user,String pass){
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
          c=false;
          }
          else{
              sql="INSERT INTO `hrms`.`login` (`username`, `password`) VALUES ('"+user+"', '"+pass+"');";
              ps=con.prepareStatement(sql);
              ps.executeUpdate(sql);
              JOptionPane.showMessageDialog(null, "Employee added successfully .. you can login now ....");
          }
         
        }
        else{
            JOptionPane.showMessageDialog(null, "This employee isn't exist .. you can't sign up ....");
            c=false;
        }}catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
           
  return c;   
}    
}
