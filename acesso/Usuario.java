package acesso;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    String nome;
    String login;
    String senha;
    List<Funcionalidade> funcionalidades;
    
    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.senha = senha;
        this.login = login;
        this.funcionalidades = new ArrayList<>();
    }

    public List<Funcionalidade> getFuncionalidades() {
        return funcionalidades;
    }

    public void adicionarFuncionalidade(Funcionalidade funcionalidade) {
        funcionalidades.add(funcionalidade);
    }

    public <T> List<T> listar(Class<T> instanciaClasse) {
        List<T> lista = new ArrayList<>();
        if (instanciaClasse == Funcionalidade.class) {
            for (Funcionalidade funcionalidade : funcionalidades) {
                lista.add(instanciaClasse.cast(funcionalidade));
            }
        }
        return lista;
    }


    public String getNome() {
        return nome;
    }

    public String sair(){
        return nome + "saiu";
    }

    public static Usuario obter(String login, String senha,  List<Usuario> usuarios){
        for(Usuario usuario : usuarios){
            if(usuario.login.equals(login) && usuario.senha.equals(senha)){
            return usuario;
            }
        }
        return null;
    }

    public static void registrarUsuario(String nome, String login, String senha, List<Usuario> usuarios){
        for(Usuario usuario : usuarios){
            if(usuario.login.equals(login)){
                System.out.println("O login ja existe");
                return;
            }
        }
        usuarios.add(new Usuario(nome, login, senha));
        System.out.println("Usuario cadastrado!");
    }
    
}
