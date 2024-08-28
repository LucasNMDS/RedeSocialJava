package RedeSocial;

import java.util.Date;

public class Postagem implements Curtidas {
    private String conteudo;
    private Date dataCriacao;
    private int curtidas;
    // Lista de comentários (associação)

    public Postagem(String conteudo) {
        this.conteudo = conteudo;
        this.dataCriacao = new Date(); // Data atual
        this.curtidas = 0;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    @Override
    public void curtir() {
        this.curtidas++;
    }

	public static void add(Postagem novaPostagem) {
		// TODO Auto-generated method stub
		
	}

    // Método para adicionar comentários
}

