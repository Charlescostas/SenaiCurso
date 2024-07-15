package ExerSemana3.Main.domain;
import java.util.HashMap;
import java.util.Map;

import ExerSemana3.Main.interfaces.*;

public class Biblioteca implements livroInterface{
    private final Map<String, Livro> listaLivros;

    public Biblioteca(){
        listaLivros = new HashMap<>();
    }

    public void adicionarLivro(Livro livro){
        if(livro != null && !listaLivros.containsKey(livro.getISBN())){
            listaLivros.put(livro.getISBN(), livro);
        }
    }

    public Livro buscarLivro(String ISBN){
        return listaLivros.get(ISBN);
    }
    public void excluirLivro(String ISBN){
        listaLivros.remove(ISBN);
    }

    public String listarLivros(){
        StringBuilder text = new StringBuilder();
        for(Livro livro : listaLivros.values()){
            text.append(livro.toString()).append("\n");
        }
        return text.toString();
    }
}
