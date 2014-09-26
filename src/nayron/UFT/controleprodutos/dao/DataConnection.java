/*
 * File: DataConnection.java
 * Creation date: 12/06/2008
 * Author: Luis Antonio Tavares
 * 
 * Purpose: Declaration of class DataConnection
 *
 * Copyright 2008, INATEL Competence Center 

 * All rights are reserved. Reproduction in whole or part is
 * prohibited without the written consent of the copyright owner.
 */
package nayron.UFT.controleprodutos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/controle", "root", "abc123");
    }
}
