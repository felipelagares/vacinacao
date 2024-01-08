package negocio;

import java.util.List;

public class User {
    private String cpf;
    private String UF;
    private String sexo;
    private List<Alergia> alergias;


    public User(String cpf, String uf, String sexo) {
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

    public List getAlergias() {
        return alergias;
    }

    public void addAlergia(String alergia) {
        Alergia a = new Alergia();
        a.setName(alergia);
        this.alergias.add(a);
    }
}
