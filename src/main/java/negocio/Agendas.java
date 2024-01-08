package negocio;
import java.time.LocalDate;
public class Agendas {
    private LocalDate data;
    private String situacao;
    private LocalDate data_situacao;

    public Agendas(LocalDate data, LocalDate dataSituacao) {
        this.data = data;
        this.situacao = "Agendado";
        this.data_situacao = dataSituacao;
    }
}
