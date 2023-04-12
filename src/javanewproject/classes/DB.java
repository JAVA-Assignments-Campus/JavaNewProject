/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javanewproject.classes;


import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;  

/**
 *
 * @author Jehan
 */
public class DB {
    private static String serverName = "localhost";
    private static String userName = "root";
    private static String dbName = "java_project";
    private static int portNumber = 3306;
    private static String pass = "";
    
    //make connection
    
    public static Connection getConnection()
    {
        try {
            Connection connection = null;
            
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(pass);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
