/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agenda.de.contatos;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nayron
 */
public class ContatoDao {

    private final Connection conexao;

    public ContatoDao() throws ClassNotFoundException, SQLException {
        this.conexao = CriarConexao.getConexao();
    }

    public void Adicionar(Contato c1) throws SQLException {
        String sql = "INSERT INTO agendadb.contato (nome, endereco, telefone, email, sexo) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getEndereco());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getSexo());

        stmt.execute();
        stmt.close();

    }

    /**
     *
     * @return @throws SQLException
     */
    public ArrayList<Contato> getLista() throws SQLException {
        String sql = "select * from contato";
        PreparedStatement stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        ArrayList<Contato> MinhaLista;
        MinhaLista = new ArrayList<Contato>();

        while (rs.next()) {
            Contato c1 = new Contato();
            c1.setId(rs.getInt("id"));
            c1.setNome(rs.getString("nome"));
            c1.setEndereco(rs.getString("endereco"));
            c1.setTelefone(rs.getString("telefone"));
            c1.setEmail(rs.getString("email"));
            c1.setSexo(rs.getString("sexo"));
            MinhaLista.add(c1);

        }
        rs.close();
        stmt.close();
        return MinhaLista;

    }

    public boolean Altera(Contato c1) throws SQLException {
        String sql = "UPDATE agendadb.contato SET nome=?, endereco=?, telefone=?, email=?, sexo=?"
                + "where id=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, c1.getNome());
        stmt.setString(2, c1.getEndereco());
        stmt.setString(3, c1.getTelefone());
        stmt.setString(4, c1.getEmail());
        stmt.setString(5, c1.getSexo());
        stmt.setInt(6, c1.getId());

        return stmt.executeUpdate() >0;

    }

    public boolean remove(int id) throws SQLException {
        String slq = "DELETE FROM agendadb.contato WHERE id=?";
        PreparedStatement stmt = conexao.prepareStatement(slq);
        stmt.setInt(1, id);

        return stmt.executeUpdate()> 0;
    }
}
