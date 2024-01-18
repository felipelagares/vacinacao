package biblioteca;

import negocio.Alergia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlergiaDAO {

    private Connection conexao;
    public AlergiaDAO() {
        conexao = FabricaDeConexao.obterConexao();
    }

    public void incluir(Alergia a) {
        try {
            String sql = "INSERT INTO Alergia(id, name) VALUES (?, ?)";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, a.getId());
            instrucao.setString(2, a.getName());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
