/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jiovana
 */
public class Cartas extends javax.swing.JFrame {

    /**
     * Creates new form Cartas
     */
    static Integer excluir;
    List<Integer> n = new ArrayList();
    public Cartas() {
        initComponents();
        n.add(0);
        n.add(1);
        n.add(2);
        n.add(3);
        Collections.shuffle(n);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblcarta1 = new javax.swing.JLabel();
        lblcarta2 = new javax.swing.JLabel();
        lblcarta3 = new javax.swing.JLabel();
        lblcarta4 = new javax.swing.JLabel();
        btnvoltar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 15));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 0));
        jLabel1.setText("Escolha uma carta: ");

        lblcarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartacapa.jpg"))); // NOI18N
        lblcarta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        lblcarta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcarta1MouseClicked(evt);
            }
        });

        lblcarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartacapa.jpg"))); // NOI18N
        lblcarta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        lblcarta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcarta2MouseClicked(evt);
            }
        });

        lblcarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartacapa.jpg"))); // NOI18N
        lblcarta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        lblcarta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcarta3MouseClicked(evt);
            }
        });

        lblcarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cartacapa.jpg"))); // NOI18N
        lblcarta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 5));
        lblcarta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcarta4MouseClicked(evt);
            }
        });

        btnvoltar.setBackground(new java.awt.Color(255, 255, 204));
        btnvoltar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnvoltar.setForeground(new java.awt.Color(255, 51, 0));
        btnvoltar.setText("Voltar ao Jogo");
        btnvoltar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 5, true));
        btnvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvoltarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/raibowy.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel7)
                .addGap(157, 157, 157)
                .addComponent(jLabel10)
                .addGap(90, 90, 90)
                .addComponent(btnvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblcarta1)
                .addGap(18, 18, 18)
                .addComponent(lblcarta2)
                .addGap(18, 18, 18)
                .addComponent(lblcarta3)
                .addGap(18, 18, 18)
                .addComponent(lblcarta4)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel2)
                .addGap(235, 235, 235)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(97, 97, 97))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(802, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(63, 63, 63)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcarta1)
                    .addComponent(lblcarta2)
                    .addComponent(lblcarta3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcarta4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnvoltar)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(439, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(41, 41, 41)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcarta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcarta1MouseClicked
        // TODO add your handling code here:
        excluir = n.get(0);
        lblcarta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ChibitaliaCard.jpg")));
        JOptionPane.showMessageDialog(rootPane, "A carta  eliminou " +excluir  +" alternativa(s)!");
        lblcarta2.setEnabled(false);
        lblcarta3.setEnabled(false);
        lblcarta4.setEnabled(false);
    }//GEN-LAST:event_lblcarta1MouseClicked

    private void lblcarta2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcarta2MouseClicked
        // TODO add your handling code here:
        lblcarta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/holyromanempire.jpg")));
        excluir = n.get(1);
        JOptionPane.showMessageDialog(rootPane, "A carta  eliminou " +excluir  +" alternativa(s)!");
        lblcarta1.setEnabled(false);
        lblcarta3.setEnabled(false);
        lblcarta4.setEnabled(false);
    }//GEN-LAST:event_lblcarta2MouseClicked

    private void lblcarta3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcarta3MouseClicked
        // TODO add your handling code here:
        lblcarta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Germania.jpg")));
        excluir = n.get(2);
        JOptionPane.showMessageDialog(rootPane, "A carta  eliminou " +excluir  +" alternativa(s)!");
        lblcarta1.setEnabled(false);
        lblcarta2.setEnabled(false);
        lblcarta4.setEnabled(false);
    }//GEN-LAST:event_lblcarta3MouseClicked

    private void lblcarta4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcarta4MouseClicked
        // TODO add your handling code here:
        lblcarta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/RomaAntiquaCard.jpg")));
        excluir = n.get(3);
        JOptionPane.showMessageDialog(rootPane, "A carta  eliminou " +excluir  +" alternativa(s)!");
        lblcarta1.setEnabled(false);
        lblcarta2.setEnabled(false);
        lblcarta3.setEnabled(false);
    }//GEN-LAST:event_lblcarta4MouseClicked

    private void btnvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvoltarActionPerformed
        // TODO add your handling code here:
       Jogo.setExcluidos(excluir);
        this.dispose();
    }//GEN-LAST:event_btnvoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cartas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cartas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnvoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblcarta1;
    private javax.swing.JLabel lblcarta2;
    private javax.swing.JLabel lblcarta3;
    private javax.swing.JLabel lblcarta4;
    // End of variables declaration//GEN-END:variables
}
