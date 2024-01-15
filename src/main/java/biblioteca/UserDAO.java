package biblioteca;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import negocio.User;
public class UserDAO {

    private Connection conexao;

    public UserDAO() {
        conexao = FabricaDeConexao.obterConexao();
    }

    public void incluir(User c) {
        try {
            String sql = "INSERT INTO User(id, nome, sexo, cpf, UF) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, c.getId());
            instrucao.setString(2, c.getNome());
            instrucao.setString(3, c.getSexo());
            instrucao.setString(4, c.getCpf());
            instrucao.setString(5, c.getUF());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(User c) {
        try {
            String sql = "DELETE FROM User WHERE id = ?";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, c.getId());
            instrucao.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User getUser(int id) {
        try {
            String sql = "SELECT * FROM User WHERE id = ?";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            instrucao.setInt(1, id);
            ResultSet rs = instrucao.executeQuery();

            if (rs.next()) {
                User candidato = new User(
                        rs.getString("cpf"),
                        rs.getString("nome"),
                        rs.getInt("id"),
                        rs.getString("UF"),
                        rs.getString("sexo")
                );
                return candidato;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public List<User> getUsers() {
        List<User> listaUsuarios = new ArrayList<User>();
        try {
            String sql = "SELECT * FROM candidato";
            PreparedStatement instrucao = this.conexao.prepareStatement(sql);
            ResultSet rs = instrucao.executeQuery();

            while (rs.next()) {
                User cand = new User(
                        rs.getString("cpf"),
                        rs.getString("nome"),
                        rs.getInt("id"),
                        rs.getString("UF"),
                        rs.getString("sexo")
                );
                listaUsuarios.add(cand);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaUsuarios;
    }



}

