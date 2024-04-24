package com.mycompany.projetoa3facul.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectaBD() {

        Connection conn = null;

        try {
            // URL de conexão com o PostgreSQL
            String url = "jdbc:postgresql://viaduct.proxy.rlwy.net:33147/railway";

            // Nome de usuário
            String user = "postgres";
            // Senha
            String password = "OdmqZrudygMxImgkEIFspTWelbpTBqFQ";

            // Estabelecendo a conexão
            conn = DriverManager.getConnection(url, user, password);

        } catch (SQLException erro) {
            // Exibindo mensagem de erro em caso de falha na conexão
            JOptionPane.showConfirmDialog(null, "ConexaoDAO" + erro.getMessage());
        }

        return conn;
    }

    // Método de teste para verificar a conexão com o banco de dados
    public static void main(String[] args) {
        ConexaoDAO conexaoDAO = new ConexaoDAO();
        Connection conn = conexaoDAO.conectaBD();

        if (conn != null) {
            System.out.println("Conexão estabelecida com sucesso!");
            // Aqui você pode realizar operações adicionais no banco de dados, se necessário
        } else {
            System.out.println("Falha ao estabelecer conexão com o banco de dados.");
        }
    }
}