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
package edu.univas.si.controleprodutos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {

	protected static Connection con = null;

	private String _userName = null;
	private String _password = null;
	private String _url = null;
	private String _jdbcDriver = null;

	public DataConnection() {
		_userName = "postgres";
		_password = "database";
		_url = "jdbc:postgresql://localhost:5432/postgres";
		_jdbcDriver = "org.postgresql.Driver";
	}

	/**
	 * Conecta com o banco.
	 * 
	 * @return con conexão estabelecida.
	 */

	public Connection getConnection() {
		try {
			if (con == null) {

				Class.forName(_jdbcDriver);
				con = DriverManager.getConnection(_url, _userName, _password);

			} else if (con.isClosed()) {
				con = null;
				return getConnection();
			}
		} catch (ClassNotFoundException e) {
			System.out.print("ClassNotFoundException: ");
			System.out.println(e.getMessage());

		} catch (SQLException e) {
			System.out.print("SQLException: ");
			System.out.println(e.getMessage());
		}
		return con;
	}

	/**
	 * Encerra a conectividade com o banco.
	 * 
	 */
	public void closeConnection() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				System.out.print("SQLException: ");
				System.out.println(e.getMessage());
			}
		}
	}

}
