package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Reserva {
    private String data;
    private List<Livro> livros;

    public Reserva(String data, List<String> tituloLivros) {
        this.data = data;
        this.livros = carregarLivros(tituloLivros);
    }

    public String getData() {
        return data;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    private List<Livro> carregarLivros(List<String> tituloLivros) {
        List<Livro> livros = new ArrayList<>();
        for (String titulo : tituloLivros) {
            livros.add(new Livro(titulo));
        }
        return livros;
    }
}
