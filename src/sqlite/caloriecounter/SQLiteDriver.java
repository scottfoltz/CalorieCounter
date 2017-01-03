/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite.caloriecounter;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 * Created by scottfoltz on 11/10/16.
 */
public class SQLiteDriver {

    Connection conn = null;

    public static Connection connectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:CalorieCounter.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
                    return null;
        }
    }

    

    /*public void addUsers(String firstName, String lastName) throws SQLException, ClassNotFoundException {

        if(conn == null){
            getConnection();
        }


        PreparedStatement prep = conn.prepareStatement("INSERT INTO user values(?,?,?)");
        prep.setString(2,firstName);
        prep.setString(3,lastName);
        prep.execute();


    }*/

}
    
    


