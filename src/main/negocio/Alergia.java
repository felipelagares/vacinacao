package negocio;
@Entity
public class Alergia {

    private int id;
    private String name;

    public Alergia(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
