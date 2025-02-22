/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.intergraphs.views;

/**
 *
 * @author USER
 */
public class VistaMultiPlayer extends javax.swing.JFrame {

    /**
     * Creates new form VistaMultiPlayer
     */
    public VistaMultiPlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelTurn = new javax.swing.JLabel();
        jLabelQuestion = new javax.swing.JLabel();
        btnOptionA = new javax.swing.JButton();
        btnOptionB = new javax.swing.JButton();
        btnOptionC = new javax.swing.JButton();
        btnOptionD = new javax.swing.JButton();
        btn5050 = new javax.swing.JButton();
        btnHint = new javax.swing.JButton();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 525));
        setMinimumSize(new java.awt.Dimension(800, 525));
        setPreferredSize(new java.awt.Dimension(800, 525));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Multijugador");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 300, 40));

        jLabelTurn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTurn.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTurn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTurn.setText("Turno: (Nombre player)");
        getContentPane().add(jLabelTurn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 300, 40));

        jLabelQuestion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelQuestion.setText("Pregunta aquí");
        getContentPane().add(jLabelQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 145, 600, 50));

        btnOptionA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOptionA.setText("A: Opción 1");
        getContentPane().add(btnOptionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 225, 290, 40));

        btnOptionB.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOptionB.setText("B: Opción 2");
        getContentPane().add(btnOptionB, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 225, 290, 40));

        btnOptionC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOptionC.setText("C: Opción 3");
        getContentPane().add(btnOptionC, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 285, 290, 40));

        btnOptionD.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOptionD.setText("D: Opción 4");
        getContentPane().add(btnOptionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 285, 290, 40));

        btn5050.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5050.setText("50:50");
        getContentPane().add(btn5050, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 70, 40));

        btnHint.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHint.setText("Pista");
        getContentPane().add(btnHint, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 70, 40));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fondo.png"))); // NOI18N
        jLabelBackground.setMaximumSize(new java.awt.Dimension(800, 600));
        jLabelBackground.setMinimumSize(new java.awt.Dimension(800, 600));
        jLabelBackground.setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 525));

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
            java.util.logging.Logger.getLogger(VistaMultiPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMultiPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMultiPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMultiPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMultiPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn5050;
    private javax.swing.JButton btnHint;
    private javax.swing.JButton btnOptionA;
    private javax.swing.JButton btnOptionB;
    private javax.swing.JButton btnOptionC;
    private javax.swing.JButton btnOptionD;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelQuestion;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTurn;
    // End of variables declaration//GEN-END:variables
}
