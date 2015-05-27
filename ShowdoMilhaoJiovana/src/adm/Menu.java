/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adm;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jiovana
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Menu() {
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menujogador = new javax.swing.JMenu();
        mnugerenciarj = new javax.swing.JMenuItem();
        mnulistarj = new javax.swing.JMenuItem();
        menupergunta = new javax.swing.JMenu();
        mnugerenciarp = new javax.swing.JMenuItem();
        mnulistarp = new javax.swing.JMenuItem();
        menuranking = new javax.swing.JMenu();
        mnulistarr = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/4b0e7fd3038150fa2c1ac643651dfd10.jpg"))); // NOI18N
        jLabel1.setAutoscrolls(true);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 102, 0), 25));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 153, 0));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 0), 5, true));
        jMenuBar1.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        menujogador.setBackground(new java.awt.Color(255, 102, 0));
        menujogador.setForeground(new java.awt.Color(204, 0, 0));
        menujogador.setText("Jogador");
        menujogador.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        mnugerenciarj.setText("Gerenciar");
        mnugerenciarj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnugerenciarjActionPerformed(evt);
            }
        });
        menujogador.add(mnugerenciarj);

        mnulistarj.setText("Listar");
        mnulistarj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulistarjActionPerformed(evt);
            }
        });
        menujogador.add(mnulistarj);

        jMenuBar1.add(menujogador);

        menupergunta.setBackground(new java.awt.Color(255, 102, 0));
        menupergunta.setForeground(new java.awt.Color(204, 0, 0));
        menupergunta.setText("Pergunta");
        menupergunta.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        mnugerenciarp.setText("Gerenciar");
        mnugerenciarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnugerenciarpActionPerformed(evt);
            }
        });
        menupergunta.add(mnugerenciarp);

        mnulistarp.setText("Listar");
        mnulistarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulistarpActionPerformed(evt);
            }
        });
        menupergunta.add(mnulistarp);

        jMenuBar1.add(menupergunta);

        menuranking.setBackground(new java.awt.Color(255, 102, 0));
        menuranking.setForeground(new java.awt.Color(204, 0, 0));
        menuranking.setText("Ranking");
        menuranking.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N

        mnulistarr.setText("Listar");
        mnulistarr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnulistarrActionPerformed(evt);
            }
        });
        menuranking.add(mnulistarr);

        jMenuBar1.add(menuranking);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/silvio.jpg")));
    }//GEN-LAST:event_jLabel1MouseClicked

    private void mnugerenciarjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnugerenciarjActionPerformed
        // TODO add your handling code here:
        JogadorManter tela = new JogadorManter();
        //fechar janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_mnugerenciarjActionPerformed

    private void mnulistarrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulistarrActionPerformed
        // TODO add your handling code here:
        RankingListar tela = null;
        try {
            tela  = new RankingListar();
        } catch (ParseException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
        //fechar janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
        
    }//GEN-LAST:event_mnulistarrActionPerformed

    private void mnulistarjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulistarjActionPerformed
        // TODO add your handling code here:
        JogadorListar tela = new JogadorListar();
        //fechar janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_mnulistarjActionPerformed

    private void mnugerenciarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnugerenciarpActionPerformed
        // TODO add your handling code here:
        PerguntaManter tela = new PerguntaManter();
        //fechar janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_mnugerenciarpActionPerformed

    private void mnulistarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnulistarpActionPerformed
        // TODO add your handling code here:
        PerguntaListar tela = new PerguntaListar();
        //fechar janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        tela.setVisible(true);
    }//GEN-LAST:event_mnulistarpActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menujogador;
    private javax.swing.JMenu menupergunta;
    private javax.swing.JMenu menuranking;
    private javax.swing.JMenuItem mnugerenciarj;
    private javax.swing.JMenuItem mnugerenciarp;
    private javax.swing.JMenuItem mnulistarj;
    private javax.swing.JMenuItem mnulistarp;
    private javax.swing.JMenuItem mnulistarr;
    // End of variables declaration//GEN-END:variables
}
