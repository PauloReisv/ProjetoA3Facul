package com.mycompany.projetoa3facul.DAO;

import com.mycompany.projetoa3facul.DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    Connection conn;

    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuarioDTO) {

        conn = new ConexaoDAO().conectaBD();

        try {
            String sql = "SELECT * FROM oni WHERE nome_usuario = ? AND senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objUsuarioDTO.getNome_usuario());
            pstm.setString(2, objUsuarioDTO.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            // Exibindo mensagem de erro em caso de falha na consulta
            JOptionPane.showConfirmDialog(null, "UsuarioDAO" + erro);
            return null;
        }
    }
}