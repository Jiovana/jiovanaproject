/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adm;

import DAO.JogadorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Jogador;

/**
 *
 * @author Jiovana
 */
public class JogadorManter extends javax.swing.JFrame {

    /**
     * Creates new form JogadorCadastrar
     */
    private List<Jogador> lista;
    private Integer posicao;

    public JogadorManter() {
        initComponents();
        //buscar lista no banco
        JogadorDAO dao = new JogadorDAO();
        lista = dao.listar();
        posicao=0;
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
        bprimeiro = new javax.swing.JButton();
        banterior = new javax.swing.JButton();
        bproximo = new javax.swing.JButton();
        bultimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        txtsenha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bcadastrar = new javax.swing.JButton();
        bexcluir = new javax.swing.JButton();
        bconsultar = new javax.swing.JButton();
        blimpar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 51, 0), 1, true), "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        bprimeiro.setBackground(new java.awt.Color(255, 102, 102));
        bprimeiro.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bprimeiro.setForeground(new java.awt.Color(51, 102, 0));
        bprimeiro.setText("Primeiro");
        bprimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprimeiroActionPerformed(evt);
            }
        });

        banterior.setBackground(new java.awt.Color(255, 102, 102));
        banterior.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        banterior.setForeground(new java.awt.Color(51, 102, 0));
        banterior.setText("Anterior");
        banterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banteriorActionPerformed(evt);
            }
        });

        bproximo.setBackground(new java.awt.Color(255, 102, 102));
        bproximo.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bproximo.setForeground(new java.awt.Color(51, 102, 0));
        bproximo.setText("Próximo");
        bproximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bproximoActionPerformed(evt);
            }
        });

        bultimo.setBackground(new java.awt.Color(255, 102, 102));
        bultimo.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bultimo.setForeground(new java.awt.Color(51, 102, 0));
        bultimo.setText("Ultimo");
        bultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bultimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(bprimeiro)
                .addGap(18, 18, 18)
                .addComponent(banterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bproximo)
                .addGap(18, 18, 18)
                .addComponent(bultimo)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprimeiro)
                    .addComponent(banterior)
                    .addComponent(bproximo)
                    .addComponent(bultimo))
                .addContainerGap())
        );

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("===Cadastro de Jogadores===");

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Senha:");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 0), 1, true), "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        bcadastrar.setBackground(new java.awt.Color(255, 102, 102));
        bcadastrar.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bcadastrar.setForeground(new java.awt.Color(51, 102, 0));
        bcadastrar.setText("Cadastrar");
        bcadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcadastrarActionPerformed(evt);
            }
        });

        bexcluir.setBackground(new java.awt.Color(255, 102, 102));
        bexcluir.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bexcluir.setForeground(new java.awt.Color(51, 102, 0));
        bexcluir.setText("Excluir");
        bexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bexcluirActionPerformed(evt);
            }
        });

        bconsultar.setBackground(new java.awt.Color(255, 102, 102));
        bconsultar.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        bconsultar.setForeground(new java.awt.Color(51, 102, 0));
        bconsultar.setText("Consultar");
        bconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bconsultarActionPerformed(evt);
            }
        });

        blimpar.setBackground(new java.awt.Color(255, 102, 102));
        blimpar.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        blimpar.setForeground(new java.awt.Color(51, 102, 0));
        blimpar.setText("Limpar");
        blimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bcadastrar)
                .addGap(26, 26, 26)
                .addComponent(bexcluir)
                .addGap(27, 27, 27)
                .addComponent(bconsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(blimpar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcadastrar)
                    .addComponent(bexcluir)
                    .addComponent(bconsultar)
                    .addComponent(blimpar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 0));
        jLabel4.setText("E-mail:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtsenha))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel1)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtlogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bultimoActionPerformed
        // TODO add your handling code here:
        if (lista.size() > 0) {
            posicao = lista.size();
            Jogador j = lista.get(posicao - 1);
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            txtemail.setText(j.getEmail());
        }
    }//GEN-LAST:event_bultimoActionPerformed

    private void bcadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcadastrarActionPerformed
        // TODO add your handling code here:
        Jogador j = new Jogador();
        if (txtlogin.getText().isEmpty() || txtsenha.getText().isEmpty() || txtemail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        } else {
            j.setLogin(txtlogin.getText());
            j.setSenha(txtsenha.getText());
            j.setEmail(txtemail.getText());
            //instancia a classe de acesso a dados jogadorDAO
            JogadorDAO dao = new JogadorDAO();
            //chama o inserir
            boolean deucerto = dao.inserir(j);
            if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar!");
            }
            lista.add(j);
            posicao ++;
            Limpar();
        }

        
    }

    private void Limpar() {
        posicao = 0;
        txtlogin.setText("");
        txtsenha.setText("");
        txtemail.setText("");

    }//GEN-LAST:event_bcadastrarActionPerformed

    private void bexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bexcluirActionPerformed
        // TODO add your handling code here:
        //chave primaria informada
        if(txtlogin.getText().isEmpty()==false){
            JogadorDAO dao = new JogadorDAO();
            boolean deucerto = dao.excluir(lista.get(posicao));
            if(deucerto==true){
                JOptionPane.showMessageDialog(rootPane,"Excluido com sucesso");
                 //atualiza a lista sem jogador excluido
                lista = dao.listar();
                Limpar();    
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir");
            }     
        }else{
            JOptionPane.showMessageDialog(rootPane, "Login não informado");
        }      
    }//GEN-LAST:event_bexcluirActionPerformed

    private void blimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blimparActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_blimparActionPerformed

    private void bconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bconsultarActionPerformed
        // TODO add your handling code here:
        String consulta = JOptionPane.showInputDialog("Digite o login do jogador: ");
        Integer achou = 0;
        Boolean encontrou = false;
        if (consulta.isEmpty() == false) {
            for (Jogador jogador : lista) {
                if (consulta.equals(jogador.getLogin())) {
                    encontrou = true;
                    txtlogin.setText(jogador.getLogin());
                    txtsenha.setText(jogador.getSenha());
                    txtemail.setText(jogador.getEmail());
                    posicao = achou;
                    break;
                }
                achou++;
            }
        }
        if (encontrou == false) {
            JOptionPane.showMessageDialog(rootPane, "Jogador não encontrado. ");
        }
    }//GEN-LAST:event_bconsultarActionPerformed

    private void bprimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprimeiroActionPerformed
        // TODO add your handling code here:
        if (lista.size() > 0) {
            Jogador j = lista.get(0);
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            txtemail.setText(j.getEmail());
        }
    }//GEN-LAST:event_bprimeiroActionPerformed

    private void banteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banteriorActionPerformed
        // TODO add your handling code here:
        if (lista.size() > 0) {
            posicao = posicao - 1;
            Jogador j = lista.get(posicao);
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            txtemail.setText(j.getEmail());
        }
    }//GEN-LAST:event_banteriorActionPerformed

    private void bproximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bproximoActionPerformed
        // TODO add your handling code here:
        if (posicao < lista.size() - 1) {
            posicao = posicao + 1;
            Jogador j = lista.get(posicao);
            txtlogin.setText(j.getLogin());
            txtsenha.setText(j.getSenha());
            txtemail.setText(j.getEmail());
        }
    }//GEN-LAST:event_bproximoActionPerformed

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
            java.util.logging.Logger.getLogger(JogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogadorManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton banterior;
    private javax.swing.JButton bcadastrar;
    private javax.swing.JButton bconsultar;
    private javax.swing.JButton bexcluir;
    private javax.swing.JButton blimpar;
    private javax.swing.JButton bprimeiro;
    private javax.swing.JButton bproximo;
    private javax.swing.JButton bultimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JTextField txtsenha;
    // End of variables declaration//GEN-END:variables
}