/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cursoiftojava.Nayron;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class DBConnection {
    public Connection getMyDBConnection() throws ClassNotFoundException,SQLException{
        return DriverManager.getConnection("jdbc:derby://localhost:1527/jogo1","nayron","abc123");
         // return DriverManager.getConnection("jdbc:mysql://localhost:3306/jogo1","root","abc123");
    }
    
}
