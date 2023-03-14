public class Artista {
    private String nome;
    private String dataNascimento;
    private String premiacoes;
    private String genero;

    public Artista(String nome, String dataNascimento, String genero, String premiacoes){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.premiacoes = premiacoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPremiacoes() {
        return premiacoes;
    }

    public void setPremiacoes(String premiacoes) {
        this.premiacoes = premiacoes;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


}

class Ator extends Artista{
    private String formacao;


    public Ator(String nome, String dataNascimento, String genero, String premiacoes, String formacao) {
        super(nome, dataNascimento, genero, premiacoes);

        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

}


class Musico extends Artista{
    String atuacao;

    public Musico(String nome, String atuacao, String dataNascimento, String genero, String premiacoes){
        super(nome, dataNascimento, genero, premiacoes);
        this.atuacao = atuacao;
    }
    public String getAtuacao() {
        return atuacao;
    }

    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

}


