package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaDeConexao {
    public static String usuario = "root";
    public static String senha = "admin";
    public static String textoDeConexao = "jdbc:mariadb://localhost:3306/vacinacao";


    public static Connection obterConexao() {
        try {
            return DriverManager.getConnection(textoDeConexao, usuario, senha);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}