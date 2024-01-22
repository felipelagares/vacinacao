package negocio;

import java.time.LocalDate;
import java.util.List;
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cpf;
    private String UF;
    private String sexo;

    @ManyToMany
    private List<Alergia> alergias;

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

    // Métodos para manipulação de alergias
    public List<Alergia> getAlergias() {
        return alergias;
    }

    public void setAlergias(List<Alergia> alergias) {
        this.alergias = alergias;
    }

    public void addAlergia(Alergia alergia) {
        this.alergias.add(alergia);
    }
}
