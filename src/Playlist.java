import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Playlist {
    private String ordemdeExecucao;
    private int midiaAtual;
    public Midia[] midias;
    public Midia todasAsMidias;


    public Playlist(String ordemdeExecucao, int midiaAtual, Midia[] midias) {
        this.ordemdeExecucao = ordemdeExecucao;
        this.midiaAtual = midiaAtual;
        this.midias = midias;
    }

    public Playlist(Midia todasAsMidias, String ordemdeExecucao){
        this.todasAsMidias = todasAsMidias;
        this.ordemdeExecucao = ordemdeExecucao;
    }
    public String getOrdemdeExecucao() {
        return ordemdeExecucao;
    }

    public void setOrdemdeExecucao(String ordemdeExecucao) {
        this.ordemdeExecucao = ordemdeExecucao;
    }

    public int getMidiaAtual() {
        return midiaAtual;
    }

    public void setMidiaAtual(int midiaAtual) {
        this.midiaAtual = midiaAtual;
    }


    public Midia[] getMidias() {
        return midias;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }
    public void tocar_musica() {     // este método retorna a midia atual
        System.out.println("Tocando midia: " + getMidias()[midiaAtual].getTitulo() + ", " +
                "Ano: " + getMidias()[midiaAtual].getAno());
    }

    public void prox_midia(Midia[] musicas) {
        int contMus = (int) musicas.length; // 3

        if (midiaAtual < contMus) {
            System.out.println("Tocando proxima midia: " + musicas[midiaAtual].getTitulo()) ;
            midiaAtual++;
        } else {
            midiaAtual = 0;
            System.out.println("Tocando proxima midia: " + musicas[midiaAtual].getTitulo());
            midiaAtual++;
        }

    }

    public void midia_anterior(Midia[] musicas) {

        int contMus = (int) musicas.length;

        if (0 < midiaAtual) {
            System.out.println("Tocando midia anterior: " + musicas[midiaAtual].getTitulo());
            midiaAtual--;
        } else {
            midiaAtual = contMus-1;
            System.out.println("Tocando midia anterior: " + musicas[midiaAtual].getTitulo());
            midiaAtual--;
        }
    }

    public void misturando_midias(List<Musica> musicas) {
        List<Integer> numerosUsadosGerados = new ArrayList<>();
        Random gerador = new Random();
        System.out.println("Gerando lista aleatória...");

        for (int i = 1; i <= musicas.stream().count(); i++) {
            // int numeroTmp = gerador.nextInt();
            int musicaGerada = gerador.nextInt((int) (musicas.stream().count()));
            System.out.println("Tocando música aleatória: " + musicas.get(musicaGerada).getTitulo());

        }
        System.out.println("Fim da lista aleatória!");
    }
}


