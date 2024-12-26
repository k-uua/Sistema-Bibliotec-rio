import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import acesso.Usuario;
import acesso.Funcionalidade;

public class Principal {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario.registrarUsuario("Kauã", "Kaua12", "senha123", usuarios);
        Usuario usuario = autenticar(usuarios);
        if (usuario != null) {
            String[] funcionalidadesMenu = construirMenu(usuario);
            while (true) {
                int funcionalidadeSelecionada = selecionarFuncionalidade(funcionalidadesMenu);
                processarFuncionalidade(usuario, funcionalidadeSelecionada);
            }
        } else {
            System.out.println("Autenticação falhou!");
        }
    }

    public static Usuario autenticar(List<Usuario> usuarios) {
        String login = JOptionPane.showInputDialog("Digite seu login:");
        String senha = JOptionPane.showInputDialog("Digite sua senha:");
        return Usuario.obter(login, senha, usuarios); 
    }

    public static String[] construirMenu(Usuario usuario) {
        List<Funcionalidade> funcionalidades = usuario.getFuncionalidades();
        String[] menu = new String[funcionalidades.size()];
        for (int i = 0; i < funcionalidades.size(); i++) {
            menu[i] = funcionalidades.get(i).toString();
        }
        return menu;
    }

    public static int selecionarFuncionalidade(String[] funcionalidadesMenu) {
        //implementar menu com as funcionalidades cadastrar consumidor, remover consumidor, cadastrar reserva e sair
        return null;
    }

    public static void processarFuncionalidade(Usuario usuario, int funcionalidadeSelecionada) {
        // Implementar lógica para processar a funcionalidade selecionada
    }
}
