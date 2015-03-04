
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adm;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pessoa;

/**
 *
 * @author Aluno
 */
public class PessoaManter extends javax.swing.JFrame {

    /**
     * Creates new form PessoaManter
     */
    private List<Pessoa> lista; 
    private Integer posicao;
    public PessoaManter() {
        initComponents();
        lista = new ArrayList<Pessoa>();
        
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
        BPrimeiro = new javax.swing.JButton();
        BAnterior = new javax.swing.JButton();
        BProximo = new javax.swing.JButton();
        BUltimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        SCombocaixa = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        BCadastra = new javax.swing.JButton();
        BExcluir = new javax.swing.JButton();
        BConsultar = new javax.swing.JButton();
        BLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Navegação"));

        BPrimeiro.setText("Primeiro");
        BPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPrimeiroActionPerformed(evt);
            }
        });

        BAnterior.setText("Anterior");
        BAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAnteriorActionPerformed(evt);
            }
        });

        BProximo.setText("Próximo");
        BProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BProximoActionPerformed(evt);
            }
        });

        BUltimo.setText("Ultimo");
        BUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(BPrimeiro)
                .addGap(18, 18, 18)
                .addComponent(BAnterior)
                .addGap(29, 29, 29)
                .addComponent(BProximo)
                .addGap(41, 41, 41)
                .addComponent(BUltimo)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BPrimeiro)
                    .addComponent(BAnterior)
                    .addComponent(BProximo)
                    .addComponent(BUltimo))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel1.setText("Código: ");

        jLabel2.setText("Nome: ");

        jLabel3.setText("Sexo: ");

        txtnome.setText(" ");

        SCombocaixa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha", "M", "F" }));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ação"));

        BCadastra.setText("Cadastrar");
        BCadastra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCadastraActionPerformed(evt);
            }
        });

        BExcluir.setText("Excluir");
        BExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BExcluirActionPerformed(evt);
            }
        });

        BConsultar.setText("Consultar");
        BConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConsultarActionPerformed(evt);
            }
        });

        BLimpar.setText("Limpar");
        BLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BCadastra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BLimpar)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCadastra)
                    .addComponent(BExcluir)
                    .addComponent(BConsultar)
                    .addComponent(BLimpar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtnome))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SCombocaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(SCombocaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPrimeiroActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            Pessoa pessoa = lista.get(0);
            txtcod.setText(pessoa.getCodigo().toString());
            txtnome.setText(pessoa.getNome().toString());
            if(pessoa.getSexo().equals("F")){
                SCombocaixa.setSelectedIndex(1);
            }else if(pessoa.getSexo().equals("M")){
                SCombocaixa.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_BPrimeiroActionPerformed

    private void BCadastraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCadastraActionPerformed
        // TODO add your handling code here:
        Pessoa p = new Pessoa();
        if(txtnome.getText().isEmpty() || txtcod.getText().isEmpty() || SCombocaixa.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }else{
            Boolean deu = false;
            try {
                 p.setCodigo(Integer.parseInt(txtcod.getText()));
                 deu = true;
            } catch (Exception e) {
                deu = false;
                JOptionPane.showMessageDialog(rootPane, "Código apenas númericos");
            }
            if(deu==true){
                p.setNome(txtnome.getText());
                p.setSexo(SCombocaixa.getSelectedItem().toString());
                lista.add(p);
        
                JOptionPane.showMessageDialog(this, "Cadastrado");
            }
           
            
        }
        Limpar();
        
    }//GEN-LAST:event_BCadastraActionPerformed

    private void BExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BExcluirActionPerformed
        // TODO add your handling code here:
        //verifica se o codigo foi informado
        lista.remove(lista.get(posicao));
        Limpar();
    }
    private void Limpar(){
        txtcod.setText("");
        txtnome.setText("");
        SCombocaixa.setSelectedIndex(0);
        posicao=0;
    }//GEN-LAST:event_BExcluirActionPerformed

    private void BAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAnteriorActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            posicao=posicao-1;
            Pessoa pessoa = lista.get(posicao);
            txtcod.setText(pessoa.getCodigo().toString());
            txtnome.setText(pessoa.getNome().toString());
            if(pessoa.getSexo().equals("F")){
                SCombocaixa.setSelectedIndex(1);
            }else if(pessoa.getSexo().equals("M")){
                SCombocaixa.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_BAnteriorActionPerformed

    private void BProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BProximoActionPerformed
        // TODO add your handling code here:
        if(posicao<lista.size()-1){
            posicao = posicao+1;
            Pessoa pessoa = lista.get(posicao);
            txtcod.setText(pessoa.getCodigo().toString());
            txtnome.setText(pessoa.getNome().toString());
            if(pessoa.getSexo().equals("F")){
                SCombocaixa.setSelectedIndex(1);
            }else if(pessoa.getSexo().equals("M")){
                SCombocaixa.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_BProximoActionPerformed

    private void BUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUltimoActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            posicao = lista.size();
            Pessoa pessoa = lista.get(posicao-1);
            txtcod.setText(pessoa.getCodigo().toString());
            txtnome.setText(pessoa.getNome().toString());
            if(pessoa.getSexo().equals("F")){
                SCombocaixa.setSelectedIndex(1);
            }else if(pessoa.getSexo().equals("M")){
                SCombocaixa.setSelectedIndex(2);
            }
        }
    }//GEN-LAST:event_BUltimoActionPerformed

    private void BConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConsultarActionPerformed
        // TODO add your handling code here:
        String consulta = JOptionPane.showInputDialog("Digite o nome");
        Integer achou =null;
        Boolean encontrou=false;
        if(consulta.isEmpty()==false){
            for (Pessoa pessoa : lista){
                if(consulta.equals(pessoa.getNome())){
                    encontrou=true;
                    txtnome.setText(pessoa.getNome());
                    txtcod.setText(pessoa.getCodigo().toString());
                    if(pessoa.getSexo().equals("F")){
                        SCombocaixa.setSelectedIndex(1);
                    }else if(pessoa.getSexo().equals("M")){
                        SCombocaixa.setSelectedIndex(2);
                    }
                    posicao=achou;
                    break;
                }
                achou++;
            }
        }
        if(encontrou==false){
            JOptionPane.showMessageDialog(rootPane,"Pessoa não encontrada. ");
        }
    }//GEN-LAST:event_BConsultarActionPerformed

    private void BLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLimparActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_BLimparActionPerformed

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
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAnterior;
    private javax.swing.JButton BCadastra;
    private javax.swing.JButton BConsultar;
    private javax.swing.JButton BExcluir;
    private javax.swing.JButton BLimpar;
    private javax.swing.JButton BPrimeiro;
    private javax.swing.JButton BProximo;
    private javax.swing.JButton BUltimo;
    private javax.swing.JComboBox SCombocaixa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnome;
    // End of variables declaration//GEN-END:variables
}
