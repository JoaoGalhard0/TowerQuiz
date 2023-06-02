/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ParticipacaoDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author JOAO PEDRO GALHARDO
 */
public class ParticipacaoDAO {
        
        public void cadastrarParticipacao(ParticipacaoDTO objparticipacaodto) {
        String sql = "insert into participacao (idUsuario, idJogo) values (?, ?);";
            Connection conn = new ConexaoDAO().conectaBD();

        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, objparticipacaodto.getIdUsuario());
            stm.setInt(2, objparticipacaodto.getIdJogo());
            
            stm.execute();
            stm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }

    }
}
