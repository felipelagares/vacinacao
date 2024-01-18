package biblioteca;

import negocio.Agendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgendaDAO {
    private Connection conexao;

    public AgendaDAO() {
        conexao = FabricaDeConexao.obterConexao();
    }

    public void incluir(Agendas a) {
        try {
            String sql = "INSERT INTO User(id, data, situacao, data_situacao, paciente_id, vacina_id) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, a.getId());
            instrucao.setDate(2, a.getData());
            instrucao.setInt(3, a.getSituacao());
            instrucao.setDate(4, a.getData_situacao());
            instrucao.setInt(5, a.getPacienteId());
            instrucao.setInt(6, a.getVacinaId());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
