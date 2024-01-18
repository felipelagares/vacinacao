package biblioteca;

import negocio.User;
import negocio.Vacina;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VacinaDAO {
    private Connection conexao;

    public VacinaDAO() {
        conexao = FabricaDeConexao.obterConexao();
    }

    public void incluir(Vacina c) {
        try {
            String sql = "INSERT INTO User(id, doses, periodicidade, intervalo, UF) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, c.getId());
            instrucao.setInt(2, c.getDoses());
            instrucao.setInt(3, c.getPeriodicidade());
            instrucao.setInt(4, c.getIntervalo());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
