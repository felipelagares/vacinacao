package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Agendas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate data;
    private EnumEstadoAgendamento situacao;
    private LocalDate data_situacao;

    private int pacienteId;
    private int vacinaId;

    public LocalDate getData() {
        return data;
    }

    public EnumEstadoAgendamento getSituacao() {
        return situacao;
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

    public int getId() {
        return id;
    }

    public Agendas(LocalDate data, int p, int v) {
        this.pacienteId = p;
        this.vacinaId = v;
        this.data = data;
        this.situacao = EnumEstadoAgendamento.AGENDADO;
        this.data_situacao = LocalDate.now();
    }

    public void cancelar() {
        this.situacao = EnumEstadoAgendamento.CANCELADO;
    }

    public void concluir() {
        this.situacao = EnumEstadoAgendamento.REALIZADO;
    }

    public enum EnumEstadoAgendamento {
        AGENDADO(1), REALIZADO(0), CANCELADO(-1);
        private int valor;

        EnumEstadoAgendamento(int valorOpcao) {
            valor = valorOpcao;
        }

        public int getValor() {
            return valor;
        }
    }
}
