/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.Aviary;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo Czpla
 */
public class PersistAviary {
    
    private Connect connection;
    private Statement statement;
    private ResultSet resultset;
    
    public PersistAviary() {
        this.connection = new Connect();
    }
    
    public boolean store(Aviary aviary) {
        try {
            this.statement = this.connection.connect().createStatement();
            this.statement.executeUpdate("INSERT INTO AVIARY (NAME, CITY, STATE, STREET, NUMBER, SIZE) VALUES (" +
                    "'" + aviary.getName()  + "'," +
                    "'" + aviary.getCity()  + "'," +
                    "'" + aviary.getState() + "'," +
                    "'" + aviary.getStreet() + "'," +
                    aviary.getNumber() + "," +
                    aviary.getSize()   + ")");
            
            this.connection.disconnect();
                    
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE); 
        }
        
        return false;
    }
    
    public List<Aviary> show() {
        try {
            List<Aviary> aviarys = new ArrayList<>();
          
            Aviary aviary;
            
            this.statement = this.connection.connect().createStatement();            
            this.resultset = this.statement.executeQuery("SELECT * FROM AVIARY");
            
            while(this.resultset.next()) {
                
                aviary = new Aviary();
                
                aviary.setName(this.resultset.getString(2));
                aviary.setCity(this.resultset.getString(3));
                aviary.setState(this.resultset.getString(4));
                aviary.setStreet(this.resultset.getString(5));
                aviary.setNumber(this.resultset.getInt(6));
                aviary.setSize(this.resultset.getInt(7));
                
                aviarys.add(aviary);
            }
            
            this.connection.disconnect();
            
            return aviarys;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return null;
    }
}
