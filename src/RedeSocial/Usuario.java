package RedeSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nomeUsuario;
    private String senha;
    private String email;
    private Perfil perfil;
    private List<Postagem> postagens; // Lista de postagens do usuário

    public Usuario(String nomeUsuario, String senha, String email) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.email = email;
        this.perfil = new Perfil();
        this.postagens = new ArrayList<>(); // Inicializando a lista de postagens
    }

    // Getters e Setters

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha != null && senha.length() >= 6) {
            this.senha = senha;
        } else {
            throw new IllegalArgumentException("A senha deve ter pelo menos 6 caracteres.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public List<Postagem> getPostagens() {
        return postagens;
    }

    // Método para criar uma nova postagem
    public void criarPostagem(String conteudo) {
        Postagem novaPostagem = new Postagem(conteudo); // Cria uma nova postagem
        postagens.add(novaPostagem); // Adiciona a postagem à lista do usuário
        System.out.println("Postagem criada com sucesso: " + conteudo);
    }

    // Outros métodos
}
