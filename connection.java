/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intershipproject;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 */
public class connection {
    public static Connection dbconnection() throws Exception
    {
    
         Connection con;
         Class.forName("com.mysql.jdbc.Driver");
//         Class.forName("com.mysql.cj.jdbc.Driver");
         con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/temp", "root", "admin");
        
       return(con);
    }

   
    
}