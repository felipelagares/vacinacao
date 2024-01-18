package negocio;

import java.time.LocalDate;
import java.util.List;

public class User {

    private int id;
    private String nome;
    private String cpf;
    private String UF;
    private String sexo;
    private List<Integer> alergias;

    public int getId() {
        return id;
    }

    public User(String cpf, String nome, int id, String uf, String sexo) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.UF = uf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUF() {
        return UF;
    }

    public String getNome() {
        return nome;
    }

    public List getAlergias() {
        return alergias;
    }

    public void addAlergia(String alergia) {
        Alergia a = new Alergia(0, alergia);
        this.alergias.add(a.getId());
    }
}
