/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projetoa3facul.VIEW;

import com.mycompany.projetoa3facul.DAO.CadastroDAO;
import com.mycompany.projetoa3facul.DTO.CadastroDTO;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class telacadastro extends javax.swing.JFrame {

    /**
     * Creates new form telacadastro
     */
    public telacadastro() {
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

        jFrame1 = new javax.swing.JFrame();
        jButtoncadastrar1 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        emailcadastrar1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        senhacadastrar6 = new javax.swing.JPasswordField();
        labelCPF1 = new javax.swing.JLabel();
        senhacadastrar7 = new javax.swing.JPasswordField();
        senhacadastrar8 = new javax.swing.JPasswordField();
        senhacadastrar9 = new javax.swing.JPasswordField();
        senhacadastrar10 = new javax.swing.JPasswordField();
        senhacadastrar11 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        labelSexo = new javax.swing.JLabel();
        labelIdade = new javax.swing.JLabel();
        textFieldCadastrarCPF = new javax.swing.JPasswordField();
        labelNome = new javax.swing.JLabel();
        jButtoncadastrar = new javax.swing.JButton();
        textFieldCadastrarRG = new javax.swing.JPasswordField();
        jScrollPane5 = new javax.swing.JScrollPane();
        textFieldCadastrarNome = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        emailcadastrar = new javax.swing.JTextPane();
        textFieldCadastrarEmail = new javax.swing.JPasswordField();
        textFieldCadastrarSexo = new javax.swing.JPasswordField();
        labelIdade1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFieldCadastrarIdade = new javax.swing.JPasswordField();
        textFieldCadastrarPalavraChave = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        senhacadastrar = new javax.swing.JPasswordField();
        labelRG = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelCPF = new javax.swing.JLabel();
        buttonVoltar = new javax.swing.JButton();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtoncadastrar1.setText("SALVAR");
        jButtoncadastrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncadastrar1ActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(emailcadastrar1);

        jLabel3.setText("EMAIL");

        jLabel4.setText("SENHA");

        senhacadastrar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar6ActionPerformed(evt);
            }
        });

        labelCPF1.setText("CPF");

        senhacadastrar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar7ActionPerformed(evt);
            }
        });

        senhacadastrar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar8ActionPerformed(evt);
            }
        });

        senhacadastrar9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar9ActionPerformed(evt);
            }
        });

        senhacadastrar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar10ActionPerformed(evt);
            }
        });

        senhacadastrar11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrar11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(jButtoncadastrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(senhacadastrar6)
                    .addGroup(jFrame1Layout.createSequentialGroup()
                        .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(labelCPF1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(senhacadastrar7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhacadastrar8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhacadastrar11)
                    .addComponent(senhacadastrar10)
                    .addComponent(senhacadastrar9))
                .addContainerGap())
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhacadastrar6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCPF1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhacadastrar7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(senhacadastrar8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(senhacadastrar9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(senhacadastrar10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhacadastrar11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtoncadastrar1)
                .addGap(36, 36, 36))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        labelSexo.setBackground(new java.awt.Color(222, 222, 222));
        labelSexo.setForeground(new java.awt.Color(0, 0, 0));
        labelSexo.setText("Sexo");

        labelIdade.setBackground(new java.awt.Color(222, 222, 222));
        labelIdade.setForeground(new java.awt.Color(0, 0, 0));
        labelIdade.setText("Idade");

        textFieldCadastrarCPF.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarCPF.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarCPFActionPerformed(evt);
            }
        });

        labelNome.setBackground(new java.awt.Color(222, 222, 222));
        labelNome.setForeground(new java.awt.Color(0, 0, 0));
        labelNome.setText("Email");

        jButtoncadastrar.setBackground(new java.awt.Color(222, 222, 222));
        jButtoncadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtoncadastrar.setText("SALVAR");
        jButtoncadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncadastrarActionPerformed(evt);
            }
        });

        textFieldCadastrarRG.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarRG.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarRG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarRGActionPerformed(evt);
            }
        });

        textFieldCadastrarNome.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarNome.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(textFieldCadastrarNome);

        emailcadastrar.setBackground(new java.awt.Color(222, 222, 222));
        emailcadastrar.setForeground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(emailcadastrar);

        textFieldCadastrarEmail.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarEmail.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarEmailActionPerformed(evt);
            }
        });

        textFieldCadastrarSexo.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarSexo.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarSexoActionPerformed(evt);
            }
        });

        labelIdade1.setBackground(new java.awt.Color(222, 222, 222));
        labelIdade1.setForeground(new java.awt.Color(0, 0, 0));
        labelIdade1.setText("Palavra Chave");

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        textFieldCadastrarIdade.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarIdade.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarIdadeActionPerformed(evt);
            }
        });

        textFieldCadastrarPalavraChave.setBackground(new java.awt.Color(222, 222, 222));
        textFieldCadastrarPalavraChave.setForeground(new java.awt.Color(0, 0, 0));
        textFieldCadastrarPalavraChave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCadastrarPalavraChaveActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(222, 222, 222));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Senha");

        senhacadastrar.setBackground(new java.awt.Color(222, 222, 222));
        senhacadastrar.setForeground(new java.awt.Color(0, 0, 0));
        senhacadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhacadastrarActionPerformed(evt);
            }
        });

        labelRG.setBackground(new java.awt.Color(222, 222, 222));
        labelRG.setForeground(new java.awt.Color(0, 0, 0));
        labelRG.setText("RG");

        labelEmail.setBackground(new java.awt.Color(222, 222, 222));
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");

        labelCPF.setBackground(new java.awt.Color(222, 222, 222));
        labelCPF.setForeground(new java.awt.Color(0, 0, 0));
        labelCPF.setText("CPF");

        buttonVoltar.setBackground(new java.awt.Color(222, 222, 222));
        buttonVoltar.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        buttonVoltar.setForeground(new java.awt.Color(0, 0, 0));
        buttonVoltar.setText("Voltar");
        buttonVoltar.setPreferredSize(new java.awt.Dimension(76, 27));
        buttonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtoncadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(senhacadastrar)
                            .addComponent(textFieldCadastrarCPF, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCadastrarRG, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textFieldCadastrarIdade)
                            .addComponent(textFieldCadastrarSexo)
                            .addComponent(textFieldCadastrarEmail)
                            .addComponent(textFieldCadastrarPalavraChave)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(labelCPF)
                                    .addComponent(labelRG)
                                    .addComponent(labelEmail)
                                    .addComponent(labelSexo)
                                    .addComponent(labelIdade)
                                    .addComponent(labelNome)
                                    .addComponent(labelIdade1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane5))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhacadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCPF)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(labelRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarRG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSexo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIdade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelIdade1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldCadastrarPalavraChave, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtoncadastrar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncadastrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncadastrar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtoncadastrar1ActionPerformed

    private void senhacadastrar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar6ActionPerformed

    private void senhacadastrar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar7ActionPerformed

    private void senhacadastrar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar8ActionPerformed

    private void senhacadastrar9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar9ActionPerformed

    private void senhacadastrar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar10ActionPerformed

    private void senhacadastrar11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrar11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrar11ActionPerformed

    private void senhacadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhacadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhacadastrarActionPerformed

    private void textFieldCadastrarPalavraChaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarPalavraChaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarPalavraChaveActionPerformed

    private void textFieldCadastrarIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarIdadeActionPerformed

    private void textFieldCadastrarSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarSexoActionPerformed

    private void textFieldCadastrarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarEmailActionPerformed

    private void textFieldCadastrarRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarRGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarRGActionPerformed

    private void jButtoncadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncadastrarActionPerformed

        String nome, senha;

        nome = emailcadastrar.getText();

        senha = senhacadastrar.getText();

        CadastroDTO objcadastrodto = new CadastroDTO();
        objcadastrodto.setNome_funcionario(nome);
        objcadastrodto.setSenha_funcionario(senha);

        CadastroDAO objcadastrodao = new CadastroDAO();
        objcadastrodao.cadastrarpessoa(objcadastrodto);

        TelaGrafica grafica = new TelaGrafica();
        grafica.setVisible(true);

        dispose();

    }//GEN-LAST:event_jButtoncadastrarActionPerformed

    private void textFieldCadastrarCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCadastrarCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCadastrarCPFActionPerformed

    private void buttonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarActionPerformed
        TelaGrafica tela = new TelaGrafica();
        tela.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_buttonVoltarActionPerformed
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
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telacadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telacadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonVoltar;
    private javax.swing.JTextPane emailcadastrar;
    private javax.swing.JTextPane emailcadastrar1;
    private javax.swing.JButton jButtoncadastrar;
    private javax.swing.JButton jButtoncadastrar1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelCPF;
    private javax.swing.JLabel labelCPF1;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelIdade;
    private javax.swing.JLabel labelIdade1;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelRG;
    private javax.swing.JLabel labelSexo;
    private javax.swing.JPasswordField senhacadastrar;
    private javax.swing.JPasswordField senhacadastrar10;
    private javax.swing.JPasswordField senhacadastrar11;
    private javax.swing.JPasswordField senhacadastrar6;
    private javax.swing.JPasswordField senhacadastrar7;
    private javax.swing.JPasswordField senhacadastrar8;
    private javax.swing.JPasswordField senhacadastrar9;
    private javax.swing.JPasswordField textFieldCadastrarCPF;
    private javax.swing.JPasswordField textFieldCadastrarEmail;
    private javax.swing.JPasswordField textFieldCadastrarIdade;
    private javax.swing.JTextPane textFieldCadastrarNome;
    private javax.swing.JPasswordField textFieldCadastrarPalavraChave;
    private javax.swing.JPasswordField textFieldCadastrarRG;
    private javax.swing.JPasswordField textFieldCadastrarSexo;
    // End of variables declaration//GEN-END:variables
}
