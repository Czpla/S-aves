/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Czpla
 */
public class Connect {
    
    private static Connection connection;
    private static final String db = "s_ave";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/" + db;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public Connection connect() {
        try {
            Class.forName(this.driver);
            
            this.connection = DriverManager.getConnection(this.url, this.user, this.password);
            
            return this.connection;
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);  
        }
        
        return null;
    }
    
    public void disconnect() {
        try {
            if(this.connection != null) {
                this.connection.close();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);  
        }
    }    
}
