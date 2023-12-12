
package GUI;

import System.App;
import System.DatabaseHandler;
import java.sql.ResultSet;
import java.awt.Desktop;
import javax.swing.JOptionPane;
import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class CadastroDeAPP extends javax.swing.JFrame {

private ArrayList<App> listaDeApps = new ArrayList<>();
    private final Principal principal;

    public CadastroDeAPP(Principal principal) {
        initComponents();
        carregarDados(); // Carregar dados ao iniciar
        atualizarTabela(null);
         this.principal = principal;
    }

    private CadastroDeAPP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jvNome = new javax.swing.JTextField();
        jvDescricao = new javax.swing.JTextField();
        jvLink = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jvLogo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jvListagem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de App");
        setResizable(false);

        jLabel1.setText("NOME:");

        jLabel2.setText("DESCRIÇÃO:");

        jLabel3.setText("LINK:");

        jvNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvNomeActionPerformed(evt);
            }
        });

        jvLink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvLinkActionPerformed(evt);
            }
        });

        jLabel4.setText("LINK DA LOGO:");

        jvLogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jvLogoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jvNome, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jvDescricao)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jvLink, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(jvLogo))
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jvLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jvNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jvDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jvLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jvListagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Descrição", "Link"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jvListagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jvListagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jvListagem);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE))
        );

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Excluir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
//--------------------------------------------------
    //PARTE DO LINK CLICK
    private javax.swing.JEditorPane jvLinkClicavel;

       private void exibirLinkClicavel() {
        String link = jvLink.getText().trim();
        jvLinkClicavel.setContentType("text/html");
        jvLinkClicavel.setEditable(false);
        jvLinkClicavel.setText("<html><a href=\"" + link + "\">" + link + "</a></html>");
        jvLinkClicavel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkClicado(evt);
            }
        });
    }

    private void linkClicado(java.awt.event.MouseEvent evt) {
        try {
            Desktop.getDesktop().browse(new URI(jvLink.getText()));
        } catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
     
    
   //------------------------------------------ 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // Adicionar um novo aplicativo à lista
    String novoNome = jvNome.getText().trim();
    String novaDescricao = jvDescricao.getText().trim();
    String novoLink = jvLink.getText().trim();
    String novoLogoLink = jvLogo.getText().trim(); // Novo campo para o link da logo

    if (novoNome.isEmpty() || novaDescricao.isEmpty() || novoLink.isEmpty() || novoLogoLink.isEmpty()) {
        JOptionPane.showMessageDialog(
                this,
                "Por favor, preencha todos os campos para adicionar um novo aplicativo.",
                "Erro ao Adicionar",
                JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar se o nome, o site e o link da logo já existem na lista
    int resultadoVerificacao = appJaExiste(novoNome, novoLink, novoLogoLink);
    if (resultadoVerificacao == 1) {
        JOptionPane.showMessageDialog(
                this,
                "Já existe um aplicativo com o mesmo nome!",
                "Erro ao Adicionar",
                JOptionPane.ERROR_MESSAGE);
    } else if (resultadoVerificacao == 2) {
        JOptionPane.showMessageDialog(
                this,
                "Já existe um aplicativo com o mesmo Link!",
                "Erro ao Adicionar",
                JOptionPane.ERROR_MESSAGE);
    } else if (resultadoVerificacao == 3) {
        JOptionPane.showMessageDialog(
                this,
                "Já existe um aplicativo com o mesmo Link da Logo!",
                "Erro ao Adicionar",
                JOptionPane.ERROR_MESSAGE);
    } else {
        App novoApp = new App(novoNome, novaDescricao, novoLink, novoLogoLink);
        listaDeApps.add(novoApp);
        salvarDados();
        atualizarTabela(null);

        // Exibir o link clicável no Principal
        principal.exibirLinkClicavel(novoLink);

        // Limpar os campos de digitação
        jvNome.setText("");
        jvDescricao.setText("");
        jvLink.setText("");
        jvLogo.setText("");

        // Fechar a janela de CadastroDeAPP
        dispose();
    }
}

private int appJaExiste(String novoNome, String novoLink, String novoLinkLogo) {
    for (App app : listaDeApps) {
        // Comparar os nomes, links e links da logo desconsiderando maiúsculas e minúsculas
        if (app.getNome().equalsIgnoreCase(novoNome)) {
            return 1; // Apenas o nome já existe
        }

        if (app.getLink().equalsIgnoreCase(novoLink)) {
            return 2; // Apenas o link já existe
        }

        if (app.getLinkLogo().equalsIgnoreCase(novoLinkLogo)) {
            return 3; // Apenas o link da logo já existe
        }
    }

    return 0; // Nome, link e link da logo são únicos
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    // Remover o aplicativo selecionado da lista
    int selectedRow = jvListagem.getSelectedRow();
    if (selectedRow != -1) {
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja excluir este APP?",
                "Confirmação de Exclusão",
                JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            App rm = listaDeApps.get(selectedRow);
            listaDeApps.remove(selectedRow);
            salvarDados(); // Salvar dados após remover
            atualizarTabela(rm.getNome());
            
        // Limpar os campos de digitação
        jvNome.setText("");
        jvDescricao.setText("");
        jvLink.setText("");
        }
    }else {
        JOptionPane.showMessageDialog(null, "Selecione um APP para excluir!");
  } 
    }//GEN-LAST:event_jButton2ActionPerformed
   
    
    private void jvListagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jvListagemMouseClicked
        // TODO add your handling code here:
        if(jvListagem.getSelectedRow() != -1){
            jvNome.setText(jvListagem.getValueAt(jvListagem.getSelectedRow(), 0).toString());
            jvDescricao.setText(jvListagem.getValueAt(jvListagem.getSelectedRow(), 1).toString());
            jvLink.setText(jvListagem.getValueAt(jvListagem.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_jvListagemMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String nome = jvListagem.getValueAt(jvListagem.getSelectedRow(), 0).toString();
        if(jvListagem.getSelectedRow() != -1){
            jvListagem.setValueAt(jvNome.getText(), jvListagem.getSelectedRow(), 0);
            jvListagem.setValueAt(jvDescricao.getText(), jvListagem.getSelectedRow(), 1);
            jvListagem.setValueAt(jvLink.getText(), jvListagem.getSelectedRow(), 2);
        }
        DatabaseHandler.connect();
        DatabaseHandler.executeQuery("UPDATE services SET name=\'" + jvNome.getText()
                        + "\', brief=\'" + jvDescricao.getText()
                        + "\', href=\'" + jvLink.getText() + "\' WHERE name=\'"
                        + nome + "\';");
        DatabaseHandler.disconnect();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jvLinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvLinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvLinkActionPerformed

    private void jvLogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvLogoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvLogoActionPerformed

    private void jvNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jvNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jvNomeActionPerformed

    //----------------
        private void salvarDados() {
        try {
            DatabaseHandler.connect();
            for (App app : listaDeApps) {
                String nome = app.getNome();
                String desc = app.getDescricao();
                String link = app.getLink();
                DatabaseHandler.executeQuery("INSERT IGNORE INTO services(name, brief, href) "
                        + "VALUES (\'" + nome + "\', \'" + desc + "\', "
                        + "\'" + link + "\');");
            }
            DatabaseHandler.disconnect();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
        
        private void carregarDados() {
        try {
            DatabaseHandler.connect();
            listaDeApps = DatabaseHandler.executeQuery("SELECT * FROM services");
            DatabaseHandler.disconnect();
        } catch (Throwable e) {
            // Se não conseguir carregar os dados, apenas continue com uma lista vazia
            e.printStackTrace();
            listaDeApps = new ArrayList<>();
        }
    } 

    private void atualizarTabela(String s) {
        DefaultTableModel tbListagem = (DefaultTableModel) jvListagem.getModel();
        tbListagem.setRowCount(0); // Limpar a tabela antes de adicionar novamente

        for (App app : listaDeApps) {
            Object[] dados = {app.getNome(), app.getDescricao(), app.getLink()};
            tbListagem.addRow(dados);
        }
        if (s != null){
            DatabaseHandler.connect();
            DatabaseHandler.executeQuery("DELETE FROM services WHERE name=\'" + s + "\';");
            DatabaseHandler.disconnect();
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
   //----------------------------------------------------------------------------------
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeAPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeAPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jvDescricao;
    private javax.swing.JTextField jvLink;
    private javax.swing.JTable jvListagem;
    private javax.swing.JTextField jvLogo;
    private javax.swing.JTextField jvNome;
    // End of variables declaration//GEN-END:variables
}
