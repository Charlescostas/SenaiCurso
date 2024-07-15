package ExerSemana3.Main.interfaces;

import ExerSemana3.Main.domain.Livro;

public interface livroInterface {
    void adicionarLivro(Livro livro);
    Livro buscarLivro(String ISBN);
    String listarLivros();
    void excluirLivro(String ISBN);
}
