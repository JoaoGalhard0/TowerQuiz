/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JOAO PEDRO GALHARDO
 */
public class RankingDAO {

    public void ListarUsername(JLabel UsernameLabel) {
        Connection conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Username FROM usuario where RA = ? ;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String username = rs.getString("username"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                UsernameLabel.setText(username);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RankingDAO" + erro);
//            return null;
        }
    }
}
