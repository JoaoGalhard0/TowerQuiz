package DAO;

import DTO.PerguntaDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PerguntaDAO {

    PreparedStatement stm;
    Connection conn;
    ResultSet rs;

    public void ListarPergunta(JLabel perguntaLabel) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 1 and idPergunta = 1;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta2(JLabel perguntaLabel2) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 1 and idPergunta = 2;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel2.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta3(JLabel perguntaLabel3) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 1 and idPergunta = 3;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel3.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta4(JLabel perguntaLabel4) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 1 and idPergunta = 4;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel4.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta5(JLabel perguntaLabel5) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 1 and idPergunta = 5;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel5.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta6(JLabel perguntaLabel6) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 2 and idPergunta = 6;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel6.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta7(JLabel perguntaLabel7) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 2 and idPergunta = 7;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel7.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta8(JLabel perguntaLabel8) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 2 and idPergunta = 8;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel8.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta9(JLabel perguntaLabel9) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 2 and idPergunta = 9;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel9.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta10(JLabel perguntaLabel10) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 2 and idPergunta = 10;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel10.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta11(JLabel perguntaLabel11) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 3 and idPergunta = 11;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel11.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta12(JLabel perguntaLabel12) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 3 and idPergunta = 12;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel12.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta13(JLabel perguntaLabel13) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 3 and idPergunta = 13;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel13.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta14(JLabel perguntaLabel14) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 3 and idPergunta = 14;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel14.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

    public void ListarPergunta15(JLabel perguntaLabel15) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Pergunta FROM pergunta where nivel = 3 and idPergunta = 15;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String pergunta = rs.getString("pergunta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                perguntaLabel15.setText(pergunta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "PerguntaDAO" + erro);
//            return null;
        }

    }

}
