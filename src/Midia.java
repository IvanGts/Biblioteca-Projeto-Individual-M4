import java.util.List;

public class Midia {        //class midia
    private String titulo;
    private int ano;
    private String genero;
    private List<Musica> musica;    //array de musicas para adicionar as musicas

    private List<Filme> filme;      //array de filmes para adicionar os filmes
    private String artista;
    private Playlist midiaAtual;

    public Midia(String titulo, int ano, String genero) {
        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.musica = musica;
        this.filme = filme;
    }

    public Midia(String titulo, int ano, String genero, String artista){
        this.titulo = titulo;
        this.artista = artista;
        this.ano = ano;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<Musica> getMusica() {
        return musica;
    }

    public void setMusica(List<Musica> musica) {
        this.musica = musica;
    }

    public List<Filme> getFilme() {
        return filme;
    }

    public void setFilme(List<Filme> filme) {
        this.filme = filme;
    }

}







