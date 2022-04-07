/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
   */  
package MainUI;
import java.sql.*;

//import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;

public class MyConnection {
    public static Connection con(){
        Connection con=null;
        try{
            Class.forName("com.mysql.jdbc.Driver"); //jdbc:mysql://localhost:3306/database_1
                     con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/database_1","root","");
                    // JOptionPane.showMessageDialog(null,"connected database");
        
                     //String username=jTextField1.getText();
        }
        
       
        catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            
        }
      
        return con;
        
       // return Con;
    }

}

