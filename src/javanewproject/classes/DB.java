/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanewproject.classes;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;  
import java.sql.SQLException;

/**
 *
 * @author Jehan
 */
public class DB {
    /*
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_project";
    private static int portNumber = 3306;
    private static String pass = "";*/
    
    //make connection
    
    public static void getConnection()
    {
        String name,pass,url;  
        Connection con = null;  
        
        try {                       

            Class.forName("com.mysql.jdbc.Driver");
            url="jdbc:mysql://localhost:3306/spring"; 
            name = "root";
            pass = "";
            
            con = DriverManager.getConnection(url,name,pass);  
            System.out.println("Connection created");  
            con.close();  
            System.out.println("Connection closed");
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
