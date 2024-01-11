package negocio;
import java.time.LocalDate;
public class Agendas {
    private LocalDate data;
    private EnumEstadoAgendamento situacao;
    private LocalDate data_situacao;

    private  User paciente;
    private Vacina vacina;

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
    public Agendas(LocalDate data) {
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
