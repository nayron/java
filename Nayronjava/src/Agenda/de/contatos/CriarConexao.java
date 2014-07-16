/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.de.contatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayron
 */
public class CriarConexao {

    public static Connection getConexao() throws ClassNotFoundException, SQLException {
       
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/agendadb", "root", "abc123");
       


    }
   
}
