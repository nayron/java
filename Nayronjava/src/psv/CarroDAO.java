/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package psv;

import java.sql.*;
import java.util.*;

/**
 *
 * @author Náyron dos Anjos
 */
public class CarroDAO {

    private Connection con;

    public CarroDAO(Connection con) {
        setCon(con);

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;

    }

    public String inserir(CarroBean carro) {

        String sql = "insert into carro(placa,cor,descricao)values(?,?,?)";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            ps.setString(2, carro.getCor());
            ps.setString(3, carro.getDescricao());

            if (ps.executeUpdate() > 0) {
                return "Inserido com sucesso.";
            } else {
                return "Erro ao inserir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public String alterar(CarroBean carro) {
        String sql = "update carro set cor = ?,descricao = ?";
        sql += " where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getCor());
            ps.setString(2, carro.getDescricao());
            ps.setString(3, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Alterado com sucesso.";
            } else {
                return "Erro ao alterar";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    /**
     * Este método receberá um objeto CarroBen como parâmetro e fará a exclusão
     * dos dados na nossa tabela carro.
     *
     * @param carro
     * @return
     */
    public String excluir(CarroBean carro) {
        String sql = "delete from carro where placa = ?";
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ps.setString(1, carro.getPlaca());
            if (ps.executeUpdate() > 0) {
                return "Excluído com sucesso.";
            } else {
                return "Erro ao excluir";
            }
        } catch (SQLException e) {
            return e.getMessage();
        }
    }

    public List<CarroBean> listarTodos() {
        String sql = "select * from carro ";
        //criar uma lista de carros para armazenar os objetos carros que retornarão da nossa consulta.
        List<CarroBean> listaCarro = new ArrayList<>();
        try {
            PreparedStatement ps = getCon().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs != null) {
                while (rs.next()) {
                    CarroBean cb = new CarroBean();
                    cb.setPlaca(rs.getString(1));
                    cb.setCor(rs.getString(2));
                    cb.setDescricao(rs.getString(3));
                    listaCarro.add(cb);
                }
                return listaCarro;
            } else {
                return null;
            }
        } catch (SQLException e) {
            return null;
        }
    }
}
