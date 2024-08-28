package RedeSocial;

public class Perfil {
    private String biografia;
    private String fotoDePerfil;
    private String localizacao;

    public Perfil() {
        this.biografia = "";
        this.fotoDePerfil = "";
        this.localizacao = "";
    }

    public Perfil(String biografia, String fotoDePerfil, String localizacao) {
        this.biografia = biografia;
        this.fotoDePerfil = fotoDePerfil;
        this.localizacao = localizacao;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFotoDePerfil() {
        return fotoDePerfil;
    }

    public void setFotoDePerfil(String fotoDePerfil) {
        this.fotoDePerfil = fotoDePerfil;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return "Perfil{" +
                "biografia='" + biografia + '\'' +
                ", fotoDePerfil='" + fotoDePerfil + '\'' +
                ", localizacao='" + localizacao + '\'' +
                '}';
    }
}

