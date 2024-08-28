package RedeSocial;

public class UserAdmin extends Usuario {
    public UserAdmin(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);  // Chamando o construtor da superclasse
    }

    // Métodos específicos do usuário administrador
    public void banirUsuario(Usuario usuario) {
        System.out.println("Usuário " + usuario.getNomeUsuario() + " foi banido.");
    }
}
