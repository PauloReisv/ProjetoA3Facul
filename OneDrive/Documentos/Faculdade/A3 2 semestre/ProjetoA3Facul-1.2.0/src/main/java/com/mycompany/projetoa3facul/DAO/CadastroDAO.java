package com.mycompany.projetoa3facul.DAO;

import com.mycompany.projetoa3facul.DTO.CadastroDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroDAO {

    Connection conn;
    PreparedStatement pstm;

    public void cadastrarpessoa(CadastroDTO objcadasCadastroDTO) {

        String sql = "insert into oni (nome_usuario, senha_usuario) values (?, ?)";

        conn = new ConexaoDAO().conectaBD();

        try {
            
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, objcadasCadastroDTO.getNome_funcionario());
            pstm.setString(2, objcadasCadastroDTO.getSenha_funcionario());
            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {

            JOptionPane.showConfirmDialog(null, "CadastroDAO" + erro);

        }

    }

}
