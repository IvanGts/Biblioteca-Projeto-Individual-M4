import static java.lang.Integer.*;

public class Filme extends Midia{   //class filme com extenção para midia
    private int duracaoMinutos;
    private String tipo;
    private String diretor;
    private String produtor;
    private String[] elenco;    //vetor de elenco
    private Ator[] atores;      //vetor de atores


    public Filme(String titulo, int ano, String genero, int duracaoMinutos, String diretor) {
        super(titulo, ano, genero);     //parte do extends trazendo dados do filme para essa classe

        this.duracaoMinutos = duracaoMinutos;
        this.setTipo();
        this.diretor = diretor;
        this.produtor = produtor;
        this.elenco = elenco;
    }

    public Filme(String titulo, int ano, String genero, int duracaoMinutos, String tipo, String diretor, String produtor, String[] elenco, Ator[] atores) {
        super(titulo, ano, genero);

        this.duracaoMinutos = duracaoMinutos;
        this.tipo = tipo;
        this.diretor = diretor;
        this.produtor = produtor;
        this.elenco = elenco;
        this.atores = atores;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Ator[] getAtores() {
        return atores;
    }

    public void setAtores(Ator[] atores) {
        this.atores = atores;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getProdutor() {
        return produtor;
    }

    public void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        if (duracaoMinutos > 90){
            System.out.println(this.tipo = "Longa duração");
        }else{
            System.out.println(this.tipo = "Curta duração");
        }
    }



}
