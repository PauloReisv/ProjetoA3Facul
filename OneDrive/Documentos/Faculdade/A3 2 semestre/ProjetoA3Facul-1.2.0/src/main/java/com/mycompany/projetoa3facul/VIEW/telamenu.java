/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoa3facul.VIEW;

/**
 *
 * @author Admin
 */
public class telamenu extends javax.swing.JFrame {

    /**
     * Creates new form telamenu
     */
    public telamenu() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMeuPerfil = new javax.swing.JMenu();
        menuItemMinhaConta = new javax.swing.JMenuItem();
        menuItemMinhasInformacoes = new javax.swing.JMenuItem();
        menuItemHistorico = new javax.swing.JMenuItem();
        menuItemSair = new javax.swing.JMenuItem();
        menuCriarEventos = new javax.swing.JMenu();
        menuAcessarEventos = new javax.swing.JMenu();
        menuItemAntigos = new javax.swing.JMenuItem();
        menuItemHoje = new javax.swing.JMenuItem();
        menuItemNovos = new javax.swing.JMenuItem();
        menuItemNovidades = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MenuEspaco = new javax.swing.JMenu();
        MenuAjuda = new javax.swing.JMenu();
        menuItemAjuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1080, 400));
        setMinimumSize(new java.awt.Dimension(1080, 400));
        setPreferredSize(new java.awt.Dimension(1080, 580));

        jScrollPane1.setBackground(new java.awt.Color(222, 222, 222));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(222, 222, 222));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 560));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 560));

        jLabel25.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Eventos mais acessados atualmente");

        jLabel26.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Eventos mais acessados atualmente");

        jLabel27.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Eventos mais acessados atualmente");

        jLabel28.setText("jLabel28");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(0, 566, Short.MAX_VALUE))
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(222, 222, 222));
        jMenuBar1.setMaximumSize(new java.awt.Dimension(70, 32769));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 21));

        menuMeuPerfil.setBackground(new java.awt.Color(222, 222, 222));
        menuMeuPerfil.setForeground(new java.awt.Color(0, 0, 0));
        menuMeuPerfil.setText("Meu Perfil");

        menuItemMinhaConta.setBackground(new java.awt.Color(222, 222, 222));
        menuItemMinhaConta.setForeground(new java.awt.Color(0, 0, 0));
        menuItemMinhaConta.setText("Minha Conta");
        menuMeuPerfil.add(menuItemMinhaConta);

        menuItemMinhasInformacoes.setBackground(new java.awt.Color(222, 222, 222));
        menuItemMinhasInformacoes.setForeground(new java.awt.Color(0, 0, 0));
        menuItemMinhasInformacoes.setText("Minhas Infomações");
        menuItemMinhasInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemMinhasInformacoesActionPerformed(evt);
            }
        });
        menuMeuPerfil.add(menuItemMinhasInformacoes);

        menuItemHistorico.setBackground(new java.awt.Color(222, 222, 222));
        menuItemHistorico.setForeground(new java.awt.Color(0, 0, 0));
        menuItemHistorico.setText("Histórico");
        menuItemHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHistoricoActionPerformed(evt);
            }
        });
        menuMeuPerfil.add(menuItemHistorico);

        menuItemSair.setText("Sair");
        menuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSairActionPerformed(evt);
            }
        });
        menuMeuPerfil.add(menuItemSair);

        jMenuBar1.add(menuMeuPerfil);

        menuCriarEventos.setBackground(new java.awt.Color(222, 222, 222));
        menuCriarEventos.setForeground(new java.awt.Color(0, 0, 0));
        menuCriarEventos.setText("Eventos");

        menuAcessarEventos.setBackground(new java.awt.Color(222, 222, 222));
        menuAcessarEventos.setForeground(new java.awt.Color(0, 0, 0));
        menuAcessarEventos.setText("Eventos");

        menuItemAntigos.setBackground(new java.awt.Color(222, 222, 222));
        menuItemAntigos.setForeground(new java.awt.Color(0, 0, 0));
        menuItemAntigos.setText("Antigos");
        menuItemAntigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAntigosActionPerformed(evt);
            }
        });
        menuAcessarEventos.add(menuItemAntigos);

        menuItemHoje.setBackground(new java.awt.Color(222, 222, 222));
        menuItemHoje.setForeground(new java.awt.Color(0, 0, 0));
        menuItemHoje.setText("Hoje");
        menuItemHoje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHojeActionPerformed(evt);
            }
        });
        menuAcessarEventos.add(menuItemHoje);

        menuItemNovos.setBackground(new java.awt.Color(222, 222, 222));
        menuItemNovos.setForeground(new java.awt.Color(0, 0, 0));
        menuItemNovos.setText("Novos");
        menuItemNovos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNovosActionPerformed(evt);
            }
        });
        menuAcessarEventos.add(menuItemNovos);

        menuCriarEventos.add(menuAcessarEventos);

        menuItemNovidades.setBackground(new java.awt.Color(222, 222, 222));
        menuItemNovidades.setForeground(new java.awt.Color(0, 0, 0));
        menuItemNovidades.setText("Novidades");
        menuCriarEventos.add(menuItemNovidades);

        jMenuItem1.setBackground(new java.awt.Color(222, 222, 222));
        jMenuItem1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuItem1.setText("Criar Eventos");
        menuCriarEventos.add(jMenuItem1);

        jMenuBar1.add(menuCriarEventos);

        MenuEspaco.setBackground(new java.awt.Color(222, 222, 222));
        MenuEspaco.setForeground(new java.awt.Color(0, 0, 0));
        MenuEspaco.setText("                                                                                                                                                                                                                                                                                ");
        jMenuBar1.add(MenuEspaco);

        MenuAjuda.setBackground(new java.awt.Color(222, 222, 222));
        MenuAjuda.setForeground(new java.awt.Color(0, 0, 0));
        MenuAjuda.setText("Ajuda");
        MenuAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAjudaActionPerformed(evt);
            }
        });

        menuItemAjuda.setBackground(new java.awt.Color(222, 222, 222));
        menuItemAjuda.setForeground(new java.awt.Color(0, 0, 0));
        menuItemAjuda.setText("Ajuda");
        menuItemAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAjudaActionPerformed(evt);
            }
        });
        MenuAjuda.add(menuItemAjuda);

        jMenuBar1.add(MenuAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAntigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAntigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAntigosActionPerformed

    private void menuItemHojeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHojeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemHojeActionPerformed

    private void menuItemNovosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNovosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemNovosActionPerformed

    private void menuItemHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemHistoricoActionPerformed

    private void menuItemMinhasInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemMinhasInformacoesActionPerformed
        
        MinhaInformacoes info = new MinhaInformacoes();      
        info.setVisible(true);
                
                
        dispose();
    }//GEN-LAST:event_menuItemMinhasInformacoesActionPerformed

    private void menuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSairActionPerformed
        TelaGrafica tela = new TelaGrafica();
        tela.setVisible(true);
        
        
        dispose();
    }//GEN-LAST:event_menuItemSairActionPerformed

    private void MenuAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAjudaActionPerformed

    }//GEN-LAST:event_MenuAjudaActionPerformed

    private void menuItemAjudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAjudaActionPerformed
        Ajuda ajuda = new Ajuda();
        ajuda.setVisible(true);
        

        dispose();    }//GEN-LAST:event_menuItemAjudaActionPerformed

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
            java.util.logging.Logger.getLogger(telamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telamenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telamenu().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuEspaco;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menuAcessarEventos;
    private javax.swing.JMenu menuCriarEventos;
    private javax.swing.JMenuItem menuItemAjuda;
    private javax.swing.JMenuItem menuItemAntigos;
    private javax.swing.JMenuItem menuItemHistorico;
    private javax.swing.JMenuItem menuItemHoje;
    private javax.swing.JMenuItem menuItemMinhaConta;
    private javax.swing.JMenuItem menuItemMinhasInformacoes;
    private javax.swing.JMenuItem menuItemNovidades;
    private javax.swing.JMenuItem menuItemNovos;
    private javax.swing.JMenuItem menuItemSair;
    private javax.swing.JMenu menuMeuPerfil;
    // End of variables declaration//GEN-END:variables
}
