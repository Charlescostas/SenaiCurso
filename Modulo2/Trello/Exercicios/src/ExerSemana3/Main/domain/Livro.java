package ExerSemana3.Main.domain;

import java.util.UUID;

public class Livro {
    private final String ISBN;
    private String titulo;
    private String autor;
    private String editora;
    private Integer anoPublicacao;
    private String genero;

    public Livro(){
        this.ISBN = UUID.randomUUID().toString();
    }

    public Livro(String ISBN, String titulo, String autor, String editora, Integer anoPublicacao, String genero) {
        this.ISBN = UUID.randomUUID().toString();
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", genero='" + genero + '\'' +
                '}';
    }
}
