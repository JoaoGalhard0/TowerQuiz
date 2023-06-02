/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.RespostaDTO;
import DTO.RespostaUsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class RespostaDAO {

    PreparedStatement stm;
    Connection conn;
    ResultSet rs;

    public RespostaUsuarioDTO ListarResposta(JRadioButton respostaLabel) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM resposta where idResposta = 1;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("Resposta"); // Obtém o valor do campo "resposta" da tupla*/]
                boolean certa = rs.getBoolean("Correta");
                // Insere o valor no TextField
                respostaLabel.setText(resposta);
                RespostaUsuarioDTO resp = new RespostaUsuarioDTO();
                resp.setIdResposta(1);
                resp.setIdParticipacao(0);
                return resp;
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }
        return null;
    }

    public void ListarResposta2(JRadioButton respostaLabel2) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 2;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel2.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta3(JRadioButton respostaLabel3) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 3;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel3.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta4(JRadioButton respostaLabel4) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 4;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel4.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta5(JRadioButton respostaLabel5) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 5;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel5.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta6(JRadioButton respostaLabel6) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 6;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel6.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta7(JRadioButton respostaLabel7) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 7;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel7.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta8(JRadioButton respostaLabel8) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 8;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel8.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta9(JRadioButton respostaLabel9) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 9;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel9.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta10(JRadioButton respostaLabel10) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 10;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel10.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta11(JRadioButton respostaLabel11) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 11;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel11.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta12(JRadioButton respostaLabel12) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 12;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel12.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta13(JRadioButton respostaLabel13) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 13;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel13.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta14(JRadioButton respostaLabel14) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 14;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel14.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta15(JRadioButton respostaLabel15) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 15;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel15.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta16(JRadioButton respostaLabel16) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 16;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel16.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta17(JRadioButton respostaLabel17) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 17;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel17.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta18(JRadioButton respostaLabel18) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 18;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel18.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta19(JRadioButton respostaLabel19) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 19;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel19.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta20(JRadioButton respostaLabel20) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 20;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel20.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta21(JRadioButton respostaLabel21) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 21;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel21.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta22(JRadioButton respostaLabel22) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 22;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel22.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta23(JRadioButton respostaLabel23) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 23;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel23.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta24(JRadioButton respostaLabel24) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 24;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel24.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta25(JRadioButton respostaLabel25) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 25;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel25.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta26(JRadioButton respostaLabel26) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 26;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel26.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta27(JRadioButton respostaLabel27) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 27;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel27.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta28(JRadioButton respostaLabel28) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 28;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel28.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta29(JRadioButton respostaLabel29) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 29;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel29.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta30(JRadioButton respostaLabel30) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 30;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel30.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta31(JRadioButton respostaLabel31) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 31;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel31.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta32(JRadioButton respostaLabel32) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 32;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel32.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta33(JRadioButton respostaLabel33) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 33;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel33.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta34(JRadioButton respostaLabel34) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 34;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel34.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta35(JRadioButton respostaLabel35) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 35;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel35.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta36(JRadioButton respostaLabel36) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 36;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel36.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta37(JRadioButton respostaLabel37) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 37;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel37.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta38(JRadioButton respostaLabel38) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 38;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel38.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta39(JRadioButton respostaLabel39) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 39;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel39.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta40(JRadioButton respostaLabel40) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 40;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel40.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta41(JRadioButton respostaLabel41) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 41;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel41.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta42(JRadioButton respostaLabel42) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 42;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel42.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta43(JRadioButton respostaLabel43) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 43;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel43.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta44(JRadioButton respostaLabel44) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 44;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel44.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta45(JRadioButton respostaLabel45) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 45;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel45.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta46(JRadioButton respostaLabel46) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 46;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel46.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta47(JRadioButton respostaLabel47) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 47;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel47.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta48(JRadioButton respostaLabel48) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 48;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel48.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta49(JRadioButton respostaLabel49) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 49;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel49.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta50(JRadioButton respostaLabel50) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 50;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel50.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta51(JRadioButton respostaLabel51) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 51;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel51.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta52(JRadioButton respostaLabel52) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 52;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel52.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta53(JRadioButton respostaLabel53) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 53;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel53.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta54(JRadioButton respostaLabel54) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 54;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel54.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta55(JRadioButton respostaLabel55) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 55;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel55.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta56(JRadioButton respostaLabel56) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 56;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel56.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta57(JRadioButton respostaLabel57) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 57;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel57.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta58(JRadioButton respostaLabel58) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 58;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel58.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta59(JRadioButton respostaLabel59) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 59;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel59.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

    public void ListarResposta60(JRadioButton respostaLabel60) {
        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT Resposta FROM resposta where idResposta = 60;";
            PreparedStatement stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();

            if (rs.next()) {
                String resposta = rs.getString("resposta"); // Obtém o valor do campo "resposta" da tupla*/
                // Insere o valor no TextField
                respostaLabel60.setText(resposta);
            } else {
                JOptionPane.showMessageDialog(null, "Nenhum resultado encontrado!");
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "RespostaDAO" + erro);
//           return null;
        }

    }

}
