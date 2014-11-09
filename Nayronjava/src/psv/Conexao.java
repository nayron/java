/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

import java.sql.*;

/**
 *
 * @author Náyron dos Anjos
 */
public class Conexao {
    /**
     * Responsavel por abrir conexão com banco de dados
     * @return con 
     */
    public static Connection abrirConexao() {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamentojg?";
            url += "user=root&password=abc123";
            con = DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
            } catch (SQLException e) {
            System.out.println(e.getMessage());
            } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
            } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return con;
    }
    /**
     * fechar banco de dados
     * @param con 
     */
    public static void fecharConexao(Connection con) {
        try {
        
            con.close();
            System.out.println("Conexão fechada.");
            } catch (SQLException e) {
            System.out.println(e.getMessage());
            } catch (Exception e) {
            System.out.println(e.getMessage());
}
    }
    public static void main(String[] args){
        abrirConexao();
    }
    
}
