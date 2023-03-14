import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {


        System.out.println("Toda Midia Em Todo Lugar");

        Musica msc1 = new Musica("Girls Just Want To Have Fun", "Cindy Lauper", "3:24", 4.2, 1984, "Pop");
        Musica msc2 = new Musica("Da ponte pra cá", "Racionais MC's", "8:48", 4.5, 2002, "Rap");
        Musica msc3 = new Musica("Vida Loja, Parte 1", "Racionais MC's", "5:4", 4.9, 1994, "Rap");

        List<Musica> listaMusica = new ArrayList<>();
        listaMusica.add(msc1);
        listaMusica.add(msc2);
        listaMusica.add(msc3);

        System.out.println("Musicas: " + msc1.getTitulo() + " , " + msc2.getTitulo() + " , " + msc3.getTitulo());

        Filme film1 = new Filme("Trocando as bolas", 1983, "Comédia", 130, "John Landis");
        Filme film2 = new Filme("O Paciente Inglês", 1983, "Drama", 162, "Anthony Minghella");
        Filme film3 = new Filme("Trama Fantasma", 2017, "Romance", 150, "John Landis");

        System.out.println("Filmes: "+ film1.getTitulo() + ", " + film2.getTitulo() + ", "+ film3.getTitulo());

        List<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(film1);
        listaFilmes.add(film2);
        listaFilmes.add(film3);



        Musico at1 = new Musico("Cind Lauper", "Vocalista", "22/06/1953", "Femino", "Grammy Award: Artista Revelação");
        Musico at2 = new Musico("Racionais MC's", "Grupo musical", "1988", "Masculino", "Premio Escolha de Audiencia Internacional para MTV");


        Ator ator1 = new Ator("Eddie Murphy", "10/01/1961", "Masculino",  "Oscar", "Artes cênicas");
        Ator ator2 = new Ator("Ralph Fiennes", "16/04/1989", "Masculino",  "Oscar", "Artes cênicas");
        Ator ator3 = new Ator("Daniel Day-Lewis", "18/07/1982", "Masculino",  "Oscar", "Artes cênicas");


        String todasAsMidias = listaFilmes.toString() + listaMusica.toString();

        Playlist playlist = new Playlist("Aleatória", 0, new Midia[3]);
        playlist.getMidias()[0] = listaMusica.get(0);
        playlist.getMidias()[1] = listaMusica.get(1);
        playlist.getMidias()[2] = listaMusica.get(2);


        List<Playlist> playlists = new ArrayList<>();

        playlist.tocar_musica();

        playlists.add(playlist);


        Biblioteca biblioteca = new Biblioteca(playlist.todasAsMidias, playlists, "Henrique");

        System.out.println("Usuário: " + biblioteca.getUsuario() + ", " +
                "Todas as midias: " + msc1.getTitulo() + " ,"
                + msc2.getTitulo() + ", " + msc3.getTitulo() + " ,"
                + film1.getTitulo() + " ," + film2.getTitulo() + " ,"+ film3.getTitulo());



        playlist.prox_midia(playlist.getMidias());
        playlist.prox_midia(playlist.getMidias());
        playlist.prox_midia(playlist.getMidias());
        playlist.prox_midia(playlist.getMidias());

        playlist.midia_anterior(playlist.getMidias());
        playlist.midia_anterior(playlist.getMidias());
        playlist.midia_anterior(playlist.getMidias());
        playlist.midia_anterior(playlist.getMidias());
    }
}

