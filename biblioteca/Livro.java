package biblioteca;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private static Map<Livro, List<Exemplar>> biblioteca = criarBiblioteca();

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public static Livro obterLivro(String titulo) {
        for (Livro livro : biblioteca.keySet()) {
            if (livro.getTitulo().equals(titulo)) {
                return livro;
            }
        }
        return null;
    }

    public static Exemplar obterExemplar(Livro livro) {
        List<Exemplar> exemplares = biblioteca.get(livro);
        if (exemplares != null && !exemplares.isEmpty()) {
            return exemplares.get(0); // Retorna o primeiro exemplar disponível
        }
        return null;
    }

    public static List<String> listar() {
        List<String> lista = new ArrayList<>();
        for (Livro livro : biblioteca.keySet()) {
            lista.add(livro.getTitulo());
        }
        return lista;
    }

    private static Map<Livro, List<Exemplar>> criarBiblioteca() {
        Map<Livro, List<Exemplar>> biblioteca = new HashMap<>();
        biblioteca.put(new Livro("Livro A", "Autor A", "Editora A"), criarListaExemplares(5));
        biblioteca.put(new Livro("Livro B", "Autor B", "Editora B"), criarListaExemplares(3));
        return biblioteca;
    }

    private static List<Exemplar> criarListaExemplares(int quantidade) {
        List<Exemplar> exemplares = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            exemplares.add(new Exemplar());
        }
        return exemplares;
    }
}
