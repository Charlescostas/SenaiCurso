package ExerSemana3.Main.domain;
import ExerSemana3.Main.interfaces.emprestimo;

public class LivroEletronico extends Livro implements emprestimo {
    private String formato_arq;
    private String tamanho_arq;
    private String platafroma_arq;

    public LivroEletronico(String ISBN, String titulo, String autor, String editora, Integer anoPublicacao,
                           String genero, String formato_arq, String tamanho_arq, String platafroma_arq) {
        super(ISBN, titulo, autor, editora, anoPublicacao, genero);
        this.formato_arq = formato_arq;
        this.tamanho_arq = tamanho_arq;
        this.platafroma_arq = platafroma_arq;
    }

    @Override
    public String toString() {
        return "LivroEletronico{" +
                "ISBN='" + getISBN() + '\'' +
                ", Titulo='" + getTitulo() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", Editora='" + getEditora() + '\'' +
                ", Ano Publicação=" + getAnoPublicacao() +
                ", Genero='" + getGenero() + '\'' +
                ", Formato do Arquivo='" + formato_arq + '\'' +
                ", Tamanho do Arquivo='" + tamanho_arq + '\'' +
                ", Platafroma do Arquivo='" + platafroma_arq + '\'' +
                '}';
    }
}
