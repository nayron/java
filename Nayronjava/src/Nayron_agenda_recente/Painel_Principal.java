/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nayron_agenda_recente;

import java.awt.Dialog;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nayron
 */
public class Painel_Principal extends javax.swing.JFrame {

    DefaultTableModel tmContato = new DefaultTableModel(null, new String[]{"Id", "Nome", "Endereço", "Telefone", "E-mail", "Sexo"});
    List<Contato> contatos;
    ListSelectionModel lsmContato;

    /**
     * Creates new form Painel_Principal
     */
    public Painel_Principal() throws ClassNotFoundException, SQLException {
        initComponents();
        DesabilitaDados();
        preenchercomUsusario();
        this.setResizable(false);
        this.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        Dimension d = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((int) d.getWidth() / 2 - (this.getWidth() / 2), (int) d.getHeight() / 2 - (this.getHeight() / 2));
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
        jTPesquisar = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTID = new javax.swing.JTextField();
        jTnome = new javax.swing.JTextField();
        jTEndereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTTelefone = new javax.swing.JTextField();
        jTEmail = new javax.swing.JTextField();
        jTSexo = new javax.swing.JTextField();
        Novo = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Salvar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabela = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela");

        jPanel1.setBackground(new java.awt.Color(255, 51, 102));

        jTPesquisar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Contato"));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel3.setText("Endereço:");

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel5.setText("E-mail:");

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel6.setText("Sexo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jTnome)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addComponent(jTTelefone))
                    .addComponent(jTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jTID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jTEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jTSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        Novo.setBackground(new java.awt.Color(0, 255, 102));
        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Alterar.setBackground(new java.awt.Color(0, 255, 102));
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Excluir.setBackground(new java.awt.Color(0, 255, 102));
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Salvar.setBackground(new java.awt.Color(0, 255, 102));
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        Sair.setBackground(new java.awt.Color(0, 255, 102));
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        jTTabela.setBackground(new java.awt.Color(102, 153, 255));
        jTTabela.setModel(tmContato);
        jTTabela.setSelectionMode(ListSelectionM­odel.SINGLE_SELECTION);
        lsmContato = jTTabela.getSelectionModel();
        lsmContato.addListSelectionListener(new ListSelectionListener() { 
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()){ 
                    JTTabelaLinhaSelecionada(jTTabela); 
                } 
            }
        });
        jScrollPane1.setViewportView(jTTabela);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel7.setText("Contatos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBPesquisar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(239, 239, 239)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {Alterar, Excluir, Novo, Sair, Salvar});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo)
                    .addComponent(Alterar)
                    .addComponent(Excluir)
                    .addComponent(Salvar)
                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {Alterar, Excluir, Novo, Sair, Salvar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        habilitaDados();
        jTEmail.setText("");
        jTEndereco.setText("");
        jTID.setText("");
        jTPesquisar.setText("");
        jTSexo.setText("");
        jTTelefone.setText("");
        jTnome.setText("");


    }//GEN-LAST:event_NovoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        if (VerificaDados()) {
            try {
                Cadastro();
                listarContatos();
                DesabilitaDados();
                listarContatos();
                JOptionPane.showMessageDialog(rootPane, "Adicionado com sucesso!");
            } catch (    ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Painel_Principal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        try {
            listarContatos();
            DesabilitaDados();
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Problemas com o campo de pesquisar" + ex);
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        try {
            Excluircontato();
             listarContatos();
             DesabilitaDados();
        } catch (ClassNotFoundException | SQLException ex) {
               JOptionPane.showMessageDialog(null, "Problemas com botão excluir");
        }

    }//GEN-LAST:event_ExcluirActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        try {
            alteraContatos();
             listarContatos();
             DesabilitaDados();
             listarContatos();
            mostrarPesquisa(contatos);
            JOptionPane.showMessageDialog(rootPane, "Contato alterado com sucesso!");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Painel_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AlterarActionPerformed
    public void Excluircontato() throws ClassNotFoundException, SQLException {
        int resp = JOptionPane.showConfirmDialog(this, "Deseja realmente excluir esse contato?",
                "confirmação", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_NO_OPTION) {

            ContatoDao dao = new ContatoDao();
            dao.remove(contatos.get(jTTabela.getSelectedRow()));
          
            JOptionPane.showMessageDialog(null, "Contato excluido com sucesso");

        }
    }

    public void listarContatos() throws ClassNotFoundException, SQLException {
        ContatoDao dao = new ContatoDao();
        contatos = dao.getLista("%" + jTPesquisar.getText() + "%");
        mostrarPesquisa(contatos);
    }

    public void Cadastro() {
        try {
            Contato c = new Contato();
            c.setNome(jTnome.getText());
            c.setEmail(jTEmail.getText());
            c.setEndereco(jTEndereco.getText());
            c.setSexo(jTSexo.getText());
            c.setTelefone(jTTelefone.getText());
            ContatoDao cDao = new ContatoDao();
            cDao.Adicionar(c);
            DesabilitaDados();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Painel_Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /* public boolean VerificaDados() {
        if (!jTnome.getText().equals("") && !jTEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cadatro aceito com sucesso!!");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor preencha o Nome e Endereco");
            return false;
        }
    }*/
    public boolean VerificaDados() {
        if (jTnome.getText().equals("") && jTEndereco.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Por favor preencha o campo Nome e Endereço");
           
        } 
        return true;
    }
    public void DesabilitaDados() {
        jTID.setEditable(false);
        jTEmail.setEditable(false);
        jTEndereco.setEditable(false);
        jTSexo.setEditable(false);
        jTTelefone.setEditable(false);
        jTnome.setEditable(false);

    }

    public void habilitaDados() {

        jTEmail.setEditable(true);
        jTEndereco.setEditable(true);
        jTSexo.setEditable(true);
        jTTelefone.setEditable(true);
        jTnome.setEditable(true);

    }

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
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Painel_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Painel_Principal().setVisible(true);

                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Painel_Principal.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(Painel_Principal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextField jTEndereco;
    private javax.swing.JTextField jTID;
    private javax.swing.JTextField jTPesquisar;
    private javax.swing.JTextField jTSexo;
    private javax.swing.JTable jTTabela;
    private javax.swing.JTextField jTTelefone;
    private javax.swing.JTextField jTnome;
    // End of variables declaration//GEN-END:variables

    private List<Contato> Jogadores;

    private void preenchercomUsusario() throws ClassNotFoundException, SQLException {
        ContatoDao jdao = new ContatoDao();

        Jogadores = jdao.getListas();

        String vetor[] = new String[Jogadores.size()];
        int i = 0;

        for (Contato j : Jogadores) {
            vetor[i] = j.getNome();
            i++;

        }
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(vetor));

    }

    private void mostrarPesquisa(List<Contato> contatos) {
        while (tmContato.getRowCount() > 0) {
            tmContato.removeRow(0);

        }
        if (contatos.size() == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum Contato foi encontrado no Banco");

        } else {
            String[] linha = new String[]{null, null, null, null, null, null};
            for (int i = 0; i < contatos.size(); i++) {
                tmContato.addRow(linha);
                tmContato.setValueAt(contatos.get(i).getId(), i, 0);
                tmContato.setValueAt(contatos.get(i).getNome(), i, 1);
                tmContato.setValueAt(contatos.get(i).getEndereco(), i, 2);
                tmContato.setValueAt(contatos.get(i).getTelefone(), i, 3);
                tmContato.setValueAt(contatos.get(i).getEmail(), i, 4);
                tmContato.setValueAt(contatos.get(i).getSexo(), i, 5);
            }
        }
    }

    private void JTTabelaLinhaSelecionada(JTable tabela) {
        if (jTTabela.getSelectedRow() != -1) {
            habilitaDados();
            jTID.setText(String.valueOf(contatos.get(tabela.getSelectedRow()).getId()));
            jTnome.setText(contatos.get(tabela.getSelectedRow()).getNome());
            jTTelefone.setText(contatos.get(tabela.getSelectedRow()).getTelefone());
            jTSexo.setText(contatos.get(tabela.getSelectedRow()).getSexo());
            jTEndereco.setText(contatos.get(tabela.getSelectedRow()).getEndereco());
            jTEmail.setText(contatos.get(tabela.getSelectedRow()).getEmail());
        } else {
            jTID.setText("");
            jTnome.setText("");
            jTTelefone.setText("");
            jTSexo.setText("");
            jTEndereco.setText("");
            jTEmail.setText("");
        }
    }

    private void alteraContatos() throws ClassNotFoundException, SQLException {
    if(jTTabela.getSelectedRow()!= -1){
        if(VerificaDados()){
            Contato c1 = new Contato();
            ContatoDao dao = new ContatoDao();
            c1.setId(Integer.parseInt(jTID.getText()));
            c1.setEmail(jTEmail.getText());
            c1.setSexo(jTSexo.getText());
            c1.setNome(jTnome.getText());
            c1.setEndereco(jTEndereco.getText());
            c1.setTelefone(jTTelefone.getText());
            dao.Altera(c1);
            
        }
        
    }
    }

}
