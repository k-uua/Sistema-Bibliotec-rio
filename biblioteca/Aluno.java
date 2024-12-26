package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends acesso.Usuario {
    private int matricula;
    private List<Reserva> reservas;
    private List<LivroReservado> consumidores;

    public Aluno(String nome, String login, String senha, int matricula) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.reservas = new ArrayList<>();
        this.consumidores = new ArrayList<>();
    }

    public List<LivroReservado> getConsumidores() {
        return consumidores;
    }

    public void cadastrarReserva(List<String> titulosLivros, String data) {
        Reserva reserva = new Reserva(data, titulosLivros);
        reservas.add(reserva);
    }
}
