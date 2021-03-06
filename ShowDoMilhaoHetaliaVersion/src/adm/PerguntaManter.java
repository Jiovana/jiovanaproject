/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adm;

import DAO.PerguntaDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Pergunta;

/**
 *
 * @author Jiovana
 */
public class PerguntaManter extends javax.swing.JFrame {

    /**
     * Creates new form PerguntaManter
     */
    private List<Pergunta> lista;
    private Integer posicao;
    public PerguntaManter() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        lista = dao.listar();
        posicao = 0;
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
        botaoP = new javax.swing.JButton();
        botaoA = new javax.swing.JButton();
        botaoPr = new javax.swing.JButton();
        botaoU = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoC = new javax.swing.JButton();
        botaoL = new javax.swing.JButton();
        botaoE = new javax.swing.JButton();
        botaoCon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtenunciado = new javax.swing.JTextField();
        txta = new javax.swing.JTextField();
        txtb = new javax.swing.JTextField();
        txtc = new javax.swing.JTextField();
        txtd = new javax.swing.JTextField();
        caixacerta = new javax.swing.JComboBox();
        caixanivel = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 204));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 5, true), "Navegação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        botaoP.setBackground(new java.awt.Color(0, 153, 153));
        botaoP.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoP.setForeground(new java.awt.Color(0, 0, 153));
        botaoP.setText("Primeiro");
        botaoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPActionPerformed(evt);
            }
        });

        botaoA.setBackground(new java.awt.Color(0, 153, 153));
        botaoA.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoA.setForeground(new java.awt.Color(0, 0, 153));
        botaoA.setText("Anterior");
        botaoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAActionPerformed(evt);
            }
        });

        botaoPr.setBackground(new java.awt.Color(0, 153, 153));
        botaoPr.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoPr.setForeground(new java.awt.Color(0, 0, 153));
        botaoPr.setText("Próximo");
        botaoPr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrActionPerformed(evt);
            }
        });

        botaoU.setBackground(new java.awt.Color(0, 153, 153));
        botaoU.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoU.setForeground(new java.awt.Color(0, 0, 153));
        botaoU.setText("Último");
        botaoU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoP)
                .addGap(18, 18, 18)
                .addComponent(botaoA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(botaoPr)
                .addGap(18, 18, 18)
                .addComponent(botaoU)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoP)
                    .addComponent(botaoA)
                    .addComponent(botaoPr)
                    .addComponent(botaoU))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 5, true), "Ação", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Snap ITC", 0, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        botaoC.setBackground(new java.awt.Color(0, 153, 153));
        botaoC.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoC.setForeground(new java.awt.Color(0, 0, 153));
        botaoC.setText("Cadastrar");
        botaoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCActionPerformed(evt);
            }
        });

        botaoL.setBackground(new java.awt.Color(0, 153, 153));
        botaoL.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoL.setForeground(new java.awt.Color(0, 0, 153));
        botaoL.setText("Limpar");
        botaoL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLActionPerformed(evt);
            }
        });

        botaoE.setBackground(new java.awt.Color(0, 153, 153));
        botaoE.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoE.setForeground(new java.awt.Color(0, 0, 153));
        botaoE.setText("Excluir");
        botaoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEActionPerformed(evt);
            }
        });

        botaoCon.setBackground(new java.awt.Color(0, 153, 153));
        botaoCon.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        botaoCon.setForeground(new java.awt.Color(0, 0, 153));
        botaoCon.setText("Consultar");
        botaoCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoL)
                .addGap(18, 18, 18)
                .addComponent(botaoE)
                .addGap(18, 18, 18)
                .addComponent(botaoCon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoC)
                    .addComponent(botaoL)
                    .addComponent(botaoE)
                    .addComponent(botaoCon))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Cadastro de Perguntas");

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("Enunciado:");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("a.");

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("b.");

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("c.");

        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("d.");

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 153));
        jLabel8.setText("Certa:");

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 153));
        jLabel9.setText("Nível:");

        txtid.setEditable(false);
        txtid.setFocusCycleRoot(true);
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });

        caixacerta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha", "a", "b", "c", "d" }));

        caixanivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 442, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtenunciado))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtc)
                                    .addComponent(txtd, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(111, 111, 111)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caixanivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(caixacerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel9)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caixacerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(caixanivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtenunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(txta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(txtb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            posicao = posicao-1;
            Pergunta p = lista.get(posicao);
            txtenunciado.setText(p.getEnunciado());
            txtid.setText(p.getId().toString());
            txta.setText(p.getA());
            txtb.setText(p.getB());
            txtc.setText(p.getC());
            txtd.setText(p.getD());
            if(p.getCerta().equals("A")){
                caixacerta.setSelectedIndex(1);
            }else if(p.getCerta().equals("B")){
                caixacerta.setSelectedIndex(2);
            }else if(p.getCerta().equals("C")){
                caixacerta.setSelectedIndex(3);
            }else if(p.getCerta().equals("D")){
                caixacerta.setSelectedIndex(4);
            }
            if(p.getNivel().equals(1)){
                caixanivel.setSelectedIndex(1);
            }else if(p.getNivel().equals(2)){
                caixanivel.setSelectedIndex(2);
            }else if(p.getNivel().equals(3)){
                caixanivel.setSelectedIndex(3);
            }else if(p.getNivel().equals(4)){
                caixanivel.setSelectedIndex(4);
            }else if(p.getNivel().equals(5)){
                caixanivel.setSelectedIndex(5);
            }
           
        }
        
    }//GEN-LAST:event_botaoAActionPerformed

    private void botaoPrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrActionPerformed
        // TODO add your handling code here:
        if(posicao<lista.size()-1){
            posicao = posicao+1;
            Pergunta p = lista.get(posicao);
            txtenunciado.setText(p.getEnunciado());
            txtid.setText(p.getId().toString());
            txta.setText(p.getA());
            txtb.setText(p.getB());
            txtc.setText(p.getC());
            txtd.setText(p.getD());
            if(p.getCerta().equals("A")){
                caixacerta.setSelectedIndex(1);
            }else if(p.getCerta().equals("B")){
                caixacerta.setSelectedIndex(2);
            }else if(p.getCerta().equals("C")){
                caixacerta.setSelectedIndex(3);
            }else if(p.getCerta().equals("D")){
                caixacerta.setSelectedIndex(4);
            }
            if(p.getNivel().equals(1)){
                caixanivel.setSelectedIndex(1);
            }else if(p.getNivel().equals(2)){
                caixanivel.setSelectedIndex(2);
            }else if(p.getNivel().equals(3)){
                caixanivel.setSelectedIndex(3);
            }else if(p.getNivel().equals(4)){
                caixanivel.setSelectedIndex(4);
            }else if(p.getNivel().equals(5)){
                caixanivel.setSelectedIndex(5);
            }
           
        }
    }//GEN-LAST:event_botaoPrActionPerformed

    private void botaoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCActionPerformed
        // TODO add your handling code here:
        Pergunta p = new Pergunta();
        if(txtenunciado.getText().isEmpty() || txta.getText().isEmpty() || txtb.getText().isEmpty() || txtc.getText().isEmpty()
        || txtd.getText().isEmpty() || caixacerta.getSelectedIndex()==0 ||  caixanivel.getSelectedIndex()==0){
                JOptionPane.showMessageDialog(rootPane, "Preencha todos os campos");
        }else{
                p.setEnunciado(txtenunciado.getText());
                p.setA(txta.getText());
                p.setB(txtb.getText());
                p.setC(txtc.getText());
                p.setD(txtd.getText());
                p.setCerta(caixacerta.getSelectedItem().toString());
                p.setNivel(Integer.parseInt(caixanivel.getSelectedItem().toString()));
                PerguntaDAO dao = new PerguntaDAO();
                boolean deucerto = dao.inserir(p);
                if (deucerto == true) {
                JOptionPane.showMessageDialog(rootPane, "Cadastrado com sucesso!");
                 } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar!");
                }
                lista.add(p);
                posicao++;
                Limpar();
            }    
    }
    public void Limpar(){
        txtenunciado.setText("");
        txta.setText("");
        txtb.setText("");
        txtc.setText("");
        txtd.setText("");
        txtid.setText("");
        caixacerta.setSelectedIndex(0);
        caixanivel.setSelectedIndex(0);
        posicao=0;
        
        
    }//GEN-LAST:event_botaoCActionPerformed

    private void botaoLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLActionPerformed
        // TODO add your handling code here:
        Limpar();
    }//GEN-LAST:event_botaoLActionPerformed

    private void botaoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEActionPerformed
        // TODO add your handling code here:
            PerguntaDAO dao = new PerguntaDAO();
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
    }//GEN-LAST:event_botaoEActionPerformed

    private void botaoConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConActionPerformed
        // TODO add your handling code here:
        String consulta = JOptionPane.showInputDialog("Digite o id da pergunta: ");
        Integer achou =0;
        Boolean encontrou=false;
        if(consulta.isEmpty()==false){
            for (Pergunta p : lista){
                if(consulta.equals(p.getId().toString())){
                    encontrou=true;
                    txtenunciado.setText(p.getEnunciado());
                    txtid.setText(p.getId().toString());
                    txta.setText(p.getA());
                    txtb.setText(p.getB());
                    txtc.setText(p.getC());
                    txtd.setText(p.getD());
                    switch (p.getCerta()) {
                        case "A":
                            caixacerta.setSelectedIndex(1);
                            break;
                        case "B":
                            caixacerta.setSelectedIndex(2);
                            break;
                        case "C":
                            caixacerta.setSelectedIndex(3);
                            break;
                        case "D":
                            caixacerta.setSelectedIndex(4);
                            break;
                    }
                    if(p.getNivel().equals(1)){
                        caixanivel.setSelectedIndex(1);
                    }else if(p.getNivel().equals(2)){
                         caixanivel.setSelectedIndex(2);
                    }else if(p.getNivel().equals(3)){
                         caixanivel.setSelectedIndex(3);
                    }else if(p.getNivel().equals(4)){
                         caixanivel.setSelectedIndex(4);
                    }else if(p.getNivel().equals(5)){
                         caixanivel.setSelectedIndex(5);
                    }
                    posicao=achou;
                    break;
                }
                achou++;
            }
        }
        if(encontrou==false){
            JOptionPane.showMessageDialog(rootPane,"Id não encontrado. ");
        }
        
    }//GEN-LAST:event_botaoConActionPerformed

    private void botaoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            Pergunta p = lista.get(0);
            txtenunciado.setText(p.getEnunciado());
            txtid.setText(p.getId().toString());
            txta.setText(p.getA());
            txtb.setText(p.getB());
            txtc.setText(p.getC());
            txtd.setText(p.getD());
            if(p.getCerta().equals("A")){
                caixacerta.setSelectedIndex(1);
            }else if(p.getCerta().equals("B")){
                caixacerta.setSelectedIndex(2);
            }else if(p.getCerta().equals("C")){
                caixacerta.setSelectedIndex(3);
            }else if(p.getCerta().equals("D")){
                caixacerta.setSelectedIndex(4);
            }
            if(p.getNivel().equals(1)){
                caixanivel.setSelectedIndex(1);
            }else if(p.getNivel().equals(2)){
                caixanivel.setSelectedIndex(2);
            }else if(p.getNivel().equals(3)){
                caixanivel.setSelectedIndex(3);
            }else if(p.getNivel().equals(4)){
                caixanivel.setSelectedIndex(4);
            }else if(p.getNivel().equals(5)){
                caixanivel.setSelectedIndex(5);
            }
           
        }
    }//GEN-LAST:event_botaoPActionPerformed

    private void botaoUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUActionPerformed
        // TODO add your handling code here:
        if(lista.size()>0){
            posicao = lista.size();
            Pergunta p = lista.get(posicao-1);
            txtenunciado.setText(p.getEnunciado());
            txtid.setText(p.getId().toString());
            txta.setText(p.getA());
            txtb.setText(p.getB());
            txtc.setText(p.getC());
            txtd.setText(p.getD());
            if(p.getCerta().equals("A")){
                caixacerta.setSelectedIndex(1);
            }else if(p.getCerta().equals("B")){
                caixacerta.setSelectedIndex(2);
            }else if(p.getCerta().equals("C")){
                caixacerta.setSelectedIndex(3);
            }else if(p.getCerta().equals("D")){
                caixacerta.setSelectedIndex(4);
            }
            if(p.getNivel().equals(1)){
                caixanivel.setSelectedIndex(1);
            }else if(p.getNivel().equals(2)){
                caixanivel.setSelectedIndex(2);
            }else if(p.getNivel().equals(3)){
                caixanivel.setSelectedIndex(3);
            }else if(p.getNivel().equals(4)){
                caixanivel.setSelectedIndex(4);
            }else if(p.getNivel().equals(5)){
                caixanivel.setSelectedIndex(5);
            }
           
        }
    }//GEN-LAST:event_botaoUActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

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
            java.util.logging.Logger.getLogger(PerguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoA;
    private javax.swing.JButton botaoC;
    private javax.swing.JButton botaoCon;
    private javax.swing.JButton botaoE;
    private javax.swing.JButton botaoL;
    private javax.swing.JButton botaoP;
    private javax.swing.JButton botaoPr;
    private javax.swing.JButton botaoU;
    private javax.swing.JComboBox caixacerta;
    private javax.swing.JComboBox caixanivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txta;
    private javax.swing.JTextField txtb;
    private javax.swing.JTextField txtc;
    private javax.swing.JTextField txtd;
    private javax.swing.JTextField txtenunciado;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
