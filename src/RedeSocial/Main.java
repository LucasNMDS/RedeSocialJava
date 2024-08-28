package RedeSocial;

public class Main {
    public static void main(String[] args) {
        // Criando um usuário comum
        Usuario usuario = new Usuario("johndoe", "password123", "johndoe@example.com");
        usuario.getPerfil().setBiografia("Avid hiker and photographer");
        usuario.getPerfil().setLocalizacao("New York, USA");

        // Exibindo informações do usuário
        System.out.println("Informações do Usuário:");
        System.out.println("Nome de Usuário: " + usuario.getNomeUsuario());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Perfil: " + usuario.getPerfil());

        // Criando uma postagem
        usuario.criarPostagem("Explorando as montanhas hoje! #aventura");

        // Criando um usuário premium
        UserPremium userPremium = new UserPremium("janedoe", "securepass", "janedoe@example.com");
        userPremium.getPerfil().setBiografia("Chef profissional e amante de viagens.");
        userPremium.getPerfil().setLocalizacao("Los Angeles, USA");

        // Exibindo informações do usuário premium
        System.out.println("\nInformações do Usuário Premium:");
        System.out.println("Nome de Usuário: " + userPremium.getNomeUsuario());
        System.out.println("Email: " + userPremium.getEmail());
        System.out.println("Perfil: " + userPremium.getPerfil());

        // Criando uma postagem em destaque
        userPremium.criarPostagemEmDestaque("Receita especial de bolo de chocolate!");

        // Criando um usuário administrador
        UserAdmin usuarioAdmin = new UserAdmin("adminuser", "adminpass", "admin@example.com");

        // Administrador banindo um usuário (simulação)
        usuarioAdmin.banirUsuario(usuario);

        // Testando funcionalidade de curtir uma postagem
        Postagem postagem = new Postagem("Adorei essa paisagem!");
        postagem.curtir();
        postagem.curtir(); // Mais uma curtida

        System.out.println("\nPostagem: " + postagem.getConteudo());
        System.out.println("Curtidas: " + postagem.getCurtidas());
        
        // Criando mais postagens para o usuário comum
        usuario.criarPostagem("Primeira postagem na rede social!");
        usuario.criarPostagem("Explorando as montanhas hoje! #aventura");

        // Exibindo as postagens do usuário
        System.out.println("\nPostagens de " + usuario.getNomeUsuario() + ":");
        for (Postagem postagem1 : usuario.getPostagens()) {
            System.out.println(postagem1.getConteudo() + " - Curtidas: " + postagem1.getCurtidas());
        }
    }
}
