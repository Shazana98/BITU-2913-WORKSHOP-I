/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Shazana Affandi
 */
public class MySqlDatabase {
   
    Connection conn = null;
        
    public static Connection ConnectDB()
    {
        try
        {
           Class.forName("com.mysql.jdbc.Driver");
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dental_clinic", "root", "root");
           return conn;
        }catch(Exception e)
         {
            JOptionPane.showMessageDialog(null,e);
            return null;
         }
    }
}