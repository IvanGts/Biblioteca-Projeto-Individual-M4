import java.util.ArrayList;
import java.util.List;

public class Musica extends Midia{
    private String duracao;
    private String artista;
    private Double nota;

    Musica(String titulo, String artista, String duracao, Double nota, int ano, String genero){
        super(titulo, ano, genero);
        this.duracao = duracao;
        this.artista = artista;
        this.nota = nota;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota >= 1 || nota <=5){ //regra ao setar a nota, deve ser entre 1 e 5
            this.nota = nota;
        }else{
            System.out.println("Nota deve ser entre 1 e 5");
        }
    }

    public void imprime_musicas(List<Musica> musicas){  //

        List<Musica> listaMusica = new ArrayList<>();
        for (int i=0; i <= listaMusica.stream().count(); i++){
            System.out.println("Musicas" + listaMusica.get(i).getTitulo());
        }
    }


}
