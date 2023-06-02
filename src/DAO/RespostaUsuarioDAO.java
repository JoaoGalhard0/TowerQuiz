/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.ParticipacaoDTO;
import DTO.RespostaUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RespostaUsuarioDAO {

    public void cadastrarParticipacao(RespostaUsuarioDTO objrespostausuariodto) {
        String sql = "insert into respostaUsuario (idParticipacao, idResposta)  values ('','');";
        Connection conn = new ConexaoDAO().conectaBD();

        try {
            PreparedStatement stm = conn.prepareStatement(sql);
            stm.setInt(1, objrespostausuariodto.getIdParticipacao());
            stm.setInt(2, objrespostausuariodto.getIdResposta());

            stm.execute();
            stm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }

    }
    
 

}
