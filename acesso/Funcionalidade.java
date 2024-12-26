package acesso;
public class Funcionalidade {
    private String sigla;


    public Funcionalidade(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }
    public enum TipoFuncionalidade {
        CAD_CONS, REM_CONS, CAD_RESE;
    }
}
