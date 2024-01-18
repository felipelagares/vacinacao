package negocio;
import java.time.LocalDate;
@Entity
public class Agendas {

    private int id;
    private LocalDate data;
    private EnumEstadoAgendamento situacao;
    private LocalDate data_situacao;

    private  int pacienteId;

    public LocalDate getData() {
        return data;
    }

    public int getSituacao() {
        return situacao.getValor();
    }

    public LocalDate getData_situacao() {
        return data_situacao;
    }

    public int getPacienteId() {
        return pacienteId;
    }

    public int getVacinaId() {
        return vacinaId;
    }

    private int vacinaId;

    public int getId() {
        return id;
    }

    public enum EnumEstadoAgendamento{
        AGENDADO(1), REALIZADO(0), CANCELADO(-1);
        private int valor;
        EnumEstadoAgendamento(int valorOpcao) {
            valor = valorOpcao;
        }

        public int getValor(){
            return valor;
        }
    }
    public Agendas(LocalDate data, int p, int v) {
        this.pacienteId = p;
        this.vacinaId = v;
        this.data = data;
        this.situacao = EnumEstadoAgendamento.AGENDADO;
        this.data_situacao = LocalDate.now();
    }
    public void cancelar(){
        this.situacao = EnumEstadoAgendamento.CANCELADO;
    }
    public  void concluir(){
        this.situacao = EnumEstadoAgendamento.REALIZADO;
    }
}
