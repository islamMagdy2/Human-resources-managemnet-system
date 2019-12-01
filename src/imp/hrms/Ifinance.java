package imp.hrms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo pentium
 */
public interface Ifinance {
        public void Login(String username, String password) ;
       public void Addemloyee1(int id,String name,String DOB,String gender,String status,String deg,String fac,String unv,int gradYear,String grade,String addr,String mob1,String mob2,String mail,String exp);
       public void Addemloyee2(String user, String date, String pos, String depart, String cont) ;
       public void Addcontract(int id, String EName, String contType, String beg, String exp, String salary);
       public void Addfinance(int id,String fullName,String department,String bonuceValue,String reason,String x,int year,int month);
      
}
