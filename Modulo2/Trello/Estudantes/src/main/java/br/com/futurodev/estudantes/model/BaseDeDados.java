package br.com.futurodev.estudantes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseDeDados {
    private static List<Estudante> listaEstudantes = new ArrayList<>();

    public BaseDeDados() {
    }

    public static void adicionar(Estudante estudante){
        BaseDeDados.listaEstudantes.add(estudante);
    }

    public static void delete(Integer id) {
        BaseDeDados.listaEstudantes.removeIf(task -> task.getRegistro().equals(id));
    }

    public static List<Estudante> list() {
        return BaseDeDados.listaEstudantes;
    }

    public static Estudante search(Integer id) {
        Optional<Estudante> optionalTarefa = BaseDeDados.listaEstudantes.stream()
                .filter(estudante -> estudante.getRegistro().equals(id)).findFirst();
        return optionalTarefa.orElse(null);
    }
}
