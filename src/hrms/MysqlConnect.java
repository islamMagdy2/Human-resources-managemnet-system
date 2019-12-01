
package hrms;

import java.sql.*;
import javax.swing.*;


public class MysqlConnect {
  private Connection conn=null;

    /**
     *function to connect HRMS database
     * @return
     */
    public Connection ConnectDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");//return class or interface with the given string name
            //
            System.out.println("Driver Loaded");}catch(ClassNotFoundException er){
            System.out.println("Load driver failed "+er);
            }
            String url="jdbc:mysql://localhost:3306/HRMS?useSSL=false";
        String username="root",password="hr2017";
        try{
            conn=DriverManager.getConnection(url,username,password);
           JOptionPane.showMessageDialog(null,"connected to database");
           
        }catch(SQLException e){
            System.out.println("databased connection faild"+e);
          
            }
            return conn;
        }
    }

