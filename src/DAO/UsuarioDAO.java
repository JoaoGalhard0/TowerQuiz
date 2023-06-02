package DAO;

import DTO.PerguntaDTO;
import DTO.UsuarioDTO;
import VIEW.frmCadastroVIEW;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class UsuarioDAO {

    PreparedStatement stm;
    Connection conn;
    ResultSet rs;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select*from usuario where RA = ? and senha_usuario = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, objUsuarioDTO.getRA());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());

            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuárioDAO" + erro);
            return null;
        }
    }

    public void cadastrarUsuario(UsuarioDTO objusuariodto) {
        String sql = "insert into usuario (RA, nome_usuario, email, Username, senha_usuario) values (?, ?, ?, ?, ?)";
        conn = new ConexaoDAO().conectaBD();

        try {
            stm = conn.prepareStatement(sql);
            stm.setString(1, objusuariodto.getRA());
            stm.setString(2, objusuariodto.getNome_usuario());
            stm.setString(3, objusuariodto.getEmail());
            stm.setString(4, objusuariodto.getUsername());
            stm.setString(5, objusuariodto.getSenha_usuario());

            stm.execute();
            stm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO" + erro);
        }

    }


}
