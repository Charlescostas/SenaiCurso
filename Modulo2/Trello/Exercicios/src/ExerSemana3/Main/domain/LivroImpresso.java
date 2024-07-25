package ExerSemana3.Main.domain;
import ExerSemana3.Main.interfaces.emprestimo;

import java.util.Date;

public class LivroImpresso extends Livro implements emprestimo{
    private Integer numero_paginas;
    private String tipo_capa;

    public LivroImpresso(String ISBN, String titulo, String autor, String editora, Integer anoPublicacao,
                         String genero, Integer numero_paginas, String tipo_capa) {
        super(ISBN, titulo, autor, editora, anoPublicacao, genero);
        this.numero_paginas = numero_paginas;
        this.tipo_capa = tipo_capa;
    }

    @Override
    public String toString() {
        return "LivroImpresso{" +
                "ISBN='" + getISBN() + '\'' +
                "ISBN='" + getISBN() + '\'' +
                ", Titulo='" + getTitulo() + '\'' +
                ", Autor='" + getAutor() + '\'' +
                ", Editora='" + getEditora() + '\'' +
                ", Ano Publicação=" + getAnoPublicacao() +
                ", Genero='" + getGenero() + '\'' +
                ", Numero de Paginas=" + numero_paginas +
                ", Tipo da Capa='" + tipo_capa + '\'' +
                '}';
    }
}
