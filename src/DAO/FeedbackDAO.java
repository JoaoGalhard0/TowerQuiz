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
public class FeedbackDAO {

    PreparedStatement stm;
    Connection conn;
    ResultSet rs;

    public void ListarRespostaCorreta(JLabel respostaCLabel) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 1 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaCLabel.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta2(JLabel respostaC2Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 2 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC2Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta3(JLabel respostaC3Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 3 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC3Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta4(JLabel respostaC4Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 1 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC4Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta5(JLabel respostaC5Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 5 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC5Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta6(JLabel respostaC6Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 6 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC6Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta7(JLabel respostaC7Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 7 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC7Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta8(JLabel respostaC8Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 8 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC8Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta9(JLabel respostaC9Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 9 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC9Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta10(JLabel respostaC10Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 10 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC10Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta11(JLabel respostaC11Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 11 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC11Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta12(JLabel respostaC12Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 12 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC12Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta13(JLabel respostaC13Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 13 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC13Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta14(JLabel respostaC14Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 14 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC14Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

    public void ListarRespostaCorreta15(JLabel respostaC15Label) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "select resposta from resposta where idPergunta = 15 and correta = true;";
            PreparedStatement stm = conn.prepareStatement(sql);

            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String respostaC = rs.getString("resposta"); // Obtém o valor do campo "pergunta" da tupla*/
                // Insere o valor no TextField
                respostaC15Label.setText(respostaC);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "FeedbackDAO" + erro);
//            return null;
        }

    }

}
