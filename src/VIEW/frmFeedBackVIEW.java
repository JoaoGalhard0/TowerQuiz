/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.FeedbackDAO;
import DAO.RespostaDAO;

/**
 *
 * @author JOAO PEDRO GALHARDO
 */
public class frmFeedBackVIEW extends javax.swing.JFrame {

    /**
     * Creates new form frmFeedBackVIEW
     */
    public frmFeedBackVIEW() {
        initComponents();
        FeedbackDAO respCdao = new  FeedbackDAO();
        respCdao.ListarRespostaCorreta(respC1TF);
        
        FeedbackDAO respC2dao = new  FeedbackDAO();
        respC2dao.ListarRespostaCorreta2(respC2TF);
        
        FeedbackDAO respC3dao = new  FeedbackDAO();
        respC3dao.ListarRespostaCorreta3(respC3TF);
        
        FeedbackDAO respC4dao = new  FeedbackDAO();
        respC4dao.ListarRespostaCorreta4(respC4TF);
        
        FeedbackDAO respC5dao = new  FeedbackDAO();
        respC5dao.ListarRespostaCorreta5(respC5TF);
        
        FeedbackDAO repspC6dao = new FeedbackDAO();
        repspC6dao.ListarRespostaCorreta6(respC6TDF);
        
        FeedbackDAO respC7dao = new  FeedbackDAO();
        respC7dao.ListarRespostaCorreta7(respC7TF);
        
        FeedbackDAO respC8dao = new  FeedbackDAO();
        respC8dao.ListarRespostaCorreta8(respC8TF);
        
        FeedbackDAO respC9dao = new  FeedbackDAO();
        respC9dao.ListarRespostaCorreta9(respC9TF);
        
        FeedbackDAO respC10dao = new  FeedbackDAO();
        respC10dao.ListarRespostaCorreta10(respC10TF);
        
        FeedbackDAO respC11dao = new  FeedbackDAO();
        respC11dao.ListarRespostaCorreta11(respC11TF);
        
        FeedbackDAO respC12dao = new  FeedbackDAO();
        respC12dao.ListarRespostaCorreta12(respC12TF);
        
        FeedbackDAO respC13dao = new  FeedbackDAO();
        respC13dao.ListarRespostaCorreta13(respC13TF);
        
        FeedbackDAO respC14dao = new  FeedbackDAO();
        respC14dao.ListarRespostaCorreta14(respC14TF);
        
        FeedbackDAO respC15dao = new  FeedbackDAO();
        respC15dao.ListarRespostaCorreta(respC15TF);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        respC6TF = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respC1TF = new javax.swing.JLabel();
        respC2TF = new javax.swing.JLabel();
        respC3TF = new javax.swing.JLabel();
        respC4TF = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        respC6TDF = new javax.swing.JLabel();
        respC7TF = new javax.swing.JLabel();
        respC8TF = new javax.swing.JLabel();
        respC9TF = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        respC11TF = new javax.swing.JLabel();
        respC12TF = new javax.swing.JLabel();
        respC13TF = new javax.swing.JLabel();
        respC14TF = new javax.swing.JLabel();
        respC5TF = new javax.swing.JLabel();
        respC10TF = new javax.swing.JLabel();
        respC15TF = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel16.setText("jLabel16");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        respC6TF.setBackground(new java.awt.Color(255, 102, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tower Quiz");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FEEDBACK");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NIVEL 1:");

        respC1TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC1TF.setForeground(new java.awt.Color(255, 255, 255));
        respC1TF.setText("1)");

        respC2TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC2TF.setForeground(new java.awt.Color(255, 255, 255));
        respC2TF.setText("2)");

        respC3TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC3TF.setForeground(new java.awt.Color(255, 255, 255));
        respC3TF.setText("3)");

        respC4TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC4TF.setForeground(new java.awt.Color(255, 255, 255));
        respC4TF.setText("4)");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIVEL 2:");

        respC6TDF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC6TDF.setForeground(new java.awt.Color(255, 255, 255));
        respC6TDF.setText("6)");

        respC7TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC7TF.setForeground(new java.awt.Color(255, 255, 255));
        respC7TF.setText("7)");

        respC8TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC8TF.setForeground(new java.awt.Color(255, 255, 255));
        respC8TF.setText("8)");

        respC9TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC9TF.setForeground(new java.awt.Color(255, 255, 255));
        respC9TF.setText("9)");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NIVEL 3:");

        respC11TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC11TF.setForeground(new java.awt.Color(255, 255, 255));
        respC11TF.setText("11)");

        respC12TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC12TF.setForeground(new java.awt.Color(255, 255, 255));
        respC12TF.setText("12)");

        respC13TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC13TF.setForeground(new java.awt.Color(255, 255, 255));
        respC13TF.setText("13)");

        respC14TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC14TF.setForeground(new java.awt.Color(255, 255, 255));
        respC14TF.setText("14)");

        respC5TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC5TF.setForeground(new java.awt.Color(255, 255, 255));
        respC5TF.setText("5)");

        respC10TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC10TF.setForeground(new java.awt.Color(255, 255, 255));
        respC10TF.setText("10)");

        respC15TF.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        respC15TF.setForeground(new java.awt.Color(255, 255, 255));
        respC15TF.setText("15)");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("VOLTAR");

        javax.swing.GroupLayout respC6TFLayout = new javax.swing.GroupLayout(respC6TF);
        respC6TF.setLayout(respC6TFLayout);
        respC6TFLayout.setHorizontalGroup(
            respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respC6TFLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
            .addGroup(respC6TFLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respC6TFLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(respC6TFLayout.createSequentialGroup()
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(respC1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respC2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC3TF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC4TF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC5TF, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(respC6TFLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(408, 408, 408)
                                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(respC11TF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(respC12TF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC13TF, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC14TF, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(respC15TF, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(respC9TF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respC7TF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respC6TDF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respC8TF, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respC10TF, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        respC6TFLayout.setVerticalGroup(
            respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(respC6TFLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(78, 78, 78)
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jLabel13))
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(respC6TFLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respC1TF)
                            .addComponent(respC6TDF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, respC6TFLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respC11TF)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respC2TF)
                    .addComponent(respC7TF)
                    .addComponent(respC12TF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(respC6TFLayout.createSequentialGroup()
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respC8TF)
                            .addComponent(respC13TF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respC9TF)
                            .addComponent(respC14TF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(respC6TFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(respC10TF)
                            .addComponent(respC15TF)))
                    .addGroup(respC6TFLayout.createSequentialGroup()
                        .addComponent(respC3TF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respC4TF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(respC5TF)))
                .addGap(176, 176, 176)
                .addComponent(jButton1)
                .addGap(70, 70, 70))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(respC6TF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(respC6TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmFeedBackVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmFeedBackVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmFeedBackVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmFeedBackVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmFeedBackVIEW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel respC10TF;
    private javax.swing.JLabel respC11TF;
    private javax.swing.JLabel respC12TF;
    private javax.swing.JLabel respC13TF;
    private javax.swing.JLabel respC14TF;
    private javax.swing.JLabel respC15TF;
    private javax.swing.JLabel respC1TF;
    private javax.swing.JLabel respC2TF;
    private javax.swing.JLabel respC3TF;
    private javax.swing.JLabel respC4TF;
    private javax.swing.JLabel respC5TF;
    private javax.swing.JLabel respC6TDF;
    private javax.swing.JPanel respC6TF;
    private javax.swing.JLabel respC7TF;
    private javax.swing.JLabel respC8TF;
    private javax.swing.JLabel respC9TF;
    // End of variables declaration//GEN-END:variables
}
