/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controle.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marciel
 */
public class TesteConexao {

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM livro");
            while (rs.next()) {
                System.out.println("Sigla: " + rs.getString("titulo"));
            }
        } catch (SQLException erro) {
            System.out.println("Erro de conexão! ");
        } finally {
            Conexao.closeAll(conn);
        }
    }
}
