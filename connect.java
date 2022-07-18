/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ujianpraktek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class connect {
    
    private static Connection MySQLConnector;
    
    public static Connection connectDB()throws SQLException{
        try {
            String url = "jdbc:mysql://localhost:3306/ujianpraktekjava";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConnector = DriverManager.getConnection(url, user, pass);
            System.out.println("Berhasil Terhubung Database");
        }catch(SQLException e) {
            System.out.println("Koneksi Error" + e.getMessage());
        }
        return MySQLConnector;
    }
    
}
