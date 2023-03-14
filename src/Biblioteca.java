import java.util.List;

public class Biblioteca {
    private Midia midias;
    private List<Playlist> playlists;
    private String usuario;

    public Biblioteca(Midia midias, List<Playlist> playlists, String usuario) {
        this.midias = midias;
        this.playlists = playlists;
        this.usuario = usuario;
    }

    public Midia getMidias() {
        return midias;
    }

    public void setMidias(Midia midias) {
        this.midias = midias;
    }


    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void tocar_playlist(){
        System.out.println("tocando playlist");
    }


}



