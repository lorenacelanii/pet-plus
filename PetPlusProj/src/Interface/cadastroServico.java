/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interface;

import DAO.ServicosDao;
import classes.Servicos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class cadastroServico extends javax.swing.JFrame {

    private String nome;
    private ImageIcon foto;
    private int acesso;

    
    public cadastroServico() {
        initComponents();
        listarValores();
        
            

    }
    
    
    public cadastroServico(String nome, ImageIcon foto, int acesso) {
        initComponents();
        listarValores();
        this.nome = nome;
        this.foto = foto;
        this.acesso = acesso;
            

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
        jPanel2 = new javax.swing.JPanel();
        txtNomeServico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        panel1 = new java.awt.Panel();
        jLabel4 = new javax.swing.JLabel();
        panel2 = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        jLabel3 = new javax.swing.JLabel();
        botaoCadastrar = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaServicos = new javax.swing.JTable();
        BotaoAlterar = new javax.swing.JButton();
        BotaoDeletar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        txtIdServico = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Corbel Light", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de serviço");
        jLabel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(244, 208, 106));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomeServico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(txtNomeServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 260, 30));

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        txtDescricao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane1.setViewportView(txtDescricao);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 260, 40));

        panel1.setBackground(new java.awt.Color(12, 196, 216));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("nome do serviço :");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 130, 30));

        panel2.setBackground(new java.awt.Color(12, 196, 216));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("descrição :");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel2.getAccessibleContext().setAccessibleName("nome do serviço :");

        jPanel2.add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 40));

        panel3.setBackground(new java.awt.Color(12, 196, 216));
        panel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("preço :");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(38, 38, 38))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 130, 30));

        botaoCadastrar.setBackground(new java.awt.Color(51, 215, 116));
        botaoCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        botaoCadastrar.setText("cadastrar");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        botaoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoCadastrarMouseClicked(evt);
            }
        });
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 120, 30));

        botaoVoltar.setBackground(new java.awt.Color(255, 71, 71));
        botaoVoltar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltar.setText("voltar");
        botaoVoltar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });
        jPanel2.add(botaoVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 296, 80, -1));

        tabelaServicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "nome do serviço", "descrição", "preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaServicosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaServicos);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 540, 120));

        BotaoAlterar.setBackground(new java.awt.Color(51, 215, 116));
        BotaoAlterar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotaoAlterar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoAlterar.setText("atualizar");
        BotaoAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoAlterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 120, 30));

        BotaoDeletar.setBackground(new java.awt.Color(51, 215, 116));
        BotaoDeletar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BotaoDeletar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoDeletar.setText("deletar");
        BotaoDeletar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        BotaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeletarActionPerformed(evt);
            }
        });
        jPanel2.add(BotaoDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 120, 30));

        btnLimpar.setBackground(new java.awt.Color(51, 215, 116));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar campos");
        btnLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        btnLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 120, 30));

        txtIdServico.setEditable(false);
        jPanel2.add(txtIdServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, -1));

        jPanel4.setBackground(new java.awt.Color(12, 196, 216));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Serviço:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(25, 25, 25))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 20));

        txtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecoActionPerformed(evt);
            }
        });
        jPanel2.add(txtPreco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 90, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel6.setText("* Utilizar ponto para os decimais");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 120, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        try {
            new paginaInicialGerente(nome, foto, acesso).setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(cadastroServico.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
      
      cadastrarServico();
      listarValores();
      limparCampos();
      
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoCadastrarMouseClicked
       
    }//GEN-LAST:event_botaoCadastrarMouseClicked

    
    
    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
      alterarServico();  
      listarValores();
      limparCampos();    
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    
    private void BotaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeletarActionPerformed
        excluirServicos();
        listarValores();
        limparCampos();
        
    }//GEN-LAST:event_BotaoDeletarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void tabelaServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaServicosMouseClicked
        carregarCampos();
    }//GEN-LAST:event_tabelaServicosMouseClicked

    private void txtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new cadastroServico().setVisible(true);
            }
        });
    }
    
    private void carregarCampos(){
        int setar = tabelaServicos.getSelectedRow();
        txtIdServico.setText(tabelaServicos.getModel().getValueAt(setar, 0).toString());
        txtNomeServico.setText(tabelaServicos.getModel().getValueAt(setar, 1).toString());
        txtDescricao.setText(tabelaServicos.getModel().getValueAt(setar, 2).toString());
        txtPreco.setText(tabelaServicos.getModel().getValueAt(setar, 3).toString());
        
    }
    
    
    
    private void limparCampos(){
        txtNomeServico.setText("");
        txtDescricao.setText("");
        txtPreco.setText("");
        txtIdServico.setText("");
    }
      
      
    
    private void cadastrarServico(){
      String servico, descricao;
      Double preco;
      
      servico = txtNomeServico.getText();
      descricao = txtDescricao.getText();
      preco = Double.valueOf(txtPreco.getText());
      
      Servicos objservico = new Servicos();
      objservico.setNome_servico(servico);
      objservico.setDescricao_servico(descricao);
      objservico.setPreco_servico(preco);
      
      
//      txtNomeServico.setText("");
//      txtDescricao.setText("");
//      txtPreco.setText("");
      
 
      ServicosDao objservicodao = new ServicosDao();
      objservicodao.cadastrarServico(objservico);
    }  
    
      
      
      
    private void alterarServico(){
        String nomeServico, descricao;
        double preco;
        int idServico;
        
        idServico = Integer.parseInt(txtIdServico.getText());
        nomeServico = txtNomeServico.getText();
        descricao = txtDescricao.getText();
        preco = Double.parseDouble(txtPreco.getText());
        
        Servicos objservico = new Servicos();
        objservico.setIdServico(idServico);
        objservico.setNome_servico(nomeServico);
        objservico.setDescricao_servico(descricao);
        objservico.setPreco_servico(preco);
        
        ServicosDao objservicodao = new ServicosDao();
        objservicodao.alterarServicos(objservico);
       
    }
    
    private void excluirServicos(){
        String nomeServico, descricao;
        double preco;
        int idServico;
        
        idServico = Integer.parseInt(txtIdServico.getText());
        nomeServico = txtNomeServico.getText();
        descricao = txtDescricao.getText();
        preco = Double.parseDouble(txtPreco.getText());
        
        Servicos objservico = new Servicos();
        objservico.setIdServico(idServico);
        objservico.setNome_servico(nomeServico);
        objservico.setDescricao_servico(descricao);
        objservico.setPreco_servico(preco);
        
        ServicosDao objservicodao = new ServicosDao();
        objservicodao.excluirServicos(objservico);
        
        
    }
    
    private void listarValores() {
        try {
            ServicosDao objservico = new ServicosDao();

            DefaultTableModel model = (DefaultTableModel) tabelaServicos.getModel();
            model.setNumRows(0);

            ArrayList<Servicos> lista = objservico.pesquisarServicos();

            for (int num = 0; num < lista.size(); num++) {
                model.addRow(new Object[]{
                    lista.get(num).getIdServico(),
                    lista.get(num).getNome_servico(),
                    lista.get(num).getDescricao_servico(),
                    lista.get(num).getPreco_servico()
                    
                });
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar valores view: " + erro);
        }
    }
    
   
    
    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoDeletar;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Panel panel1;
    private java.awt.Panel panel2;
    private java.awt.Panel panel3;
    private javax.swing.JTable tabelaServicos;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtIdServico;
    private javax.swing.JTextField txtNomeServico;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables
}




