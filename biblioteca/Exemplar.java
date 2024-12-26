package biblioteca;
public class Exemplar {
    private static int contador = 0;
    private int id;

    public Exemplar() {
        this.id = ++contador;
    }

    public int getId() {
        return id;
    }
}
