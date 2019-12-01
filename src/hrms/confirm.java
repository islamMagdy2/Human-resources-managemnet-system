
package hrms;

import hrms.GUI.View_Loans;
import java.sql.*;
import javax.swing.JOptionPane;


public class confirm {
 Connection con=null;
 PreparedStatement ps=null;
 ResultSet rs=null;

    /**
     *function to check Loan request for employee in HRMS database
     * @return
     */
    public boolean check(){
     boolean c=true;
     con=new MysqlConnect().ConnectDB();
     String sql="Select * from loanreq where state=?";
      try{
    
         ps=con.prepareStatement(sql);      
         ps.setString(1,"pending");
         
         rs=ps.executeQuery();
       
        if(!rs.next()){
        JOptionPane.showMessageDialog(null, "There no any pending request");
        c=false;
        }
        else{
            View_Loans e=new View_Loans();
            e.setVisible(true);
        }
      
      
      
      }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
      return c;
 }

    /**
     *function to set respond Loan request for employee in HRMS database
     * @param s
     */
    public void respond(String s){
      con=new MysqlConnect().ConnectDB();
     String sql="update loanReq set state=?";
     try{
         ps=con.prepareStatement(sql);      
         ps.setString(1, s);
         ps.executeUpdate();
         
     }catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
     }
}
