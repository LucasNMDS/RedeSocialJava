package RedeSocial;

public class UserPremium extends Usuario {
    public UserPremium(String nomeUsuario, String senha, String email) {
        super(nomeUsuario, senha, email);
    }

    public void criarPostagemEmDestaque(String conteudo) {
        Postagem postagemDestaque = new Postagem(conteudo);
        // Implementar lógica de destaque
    }
}
