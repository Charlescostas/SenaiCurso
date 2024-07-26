package br.com.futurodev.estudantes.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BaseDeDados {
    private static List<Estudante> listaEstudantes = new ArrayList<>();

    public BaseDeDados() {
    }

    public static List<Estudante> list() {
        return BaseDeDados.listaEstudantes;
    }

    public static Estudante search(Long id) {
        Optional<Estudante> optionalTarefa = BaseDeDados.listaEstudantes.stream()
                .filter(estudante -> estudante.getRegistro().equals(id)).findFirst();
        return optionalTarefa.orElse(null);
    }

    public static void adicionar(Estudante estudante){
        BaseDeDados.listaEstudantes.add(estudante);
    }


    public static Estudante update(Long id, Estudante estudante) throws Exception {
        Estudante estudanteToUpdate = BaseDeDados.search(id);
        if (estudanteToUpdate != null) {
            estudanteToUpdate.setEmail(estudante.getEmail() != null ? estudante.getEmail() : estudanteToUpdate.getEmail());
            estudanteToUpdate.setNome(estudante.getNome() != null ? estudante.getNome() : estudanteToUpdate.getNome());
            return estudanteToUpdate;
        }

        throw new Exception("O Estudante não foi encontrado");
    }

    public static Estudante buscar(Long id, Estudante estudante) throws Exception {
        Estudante estudanteToUpdate = BaseDeDados.search(id);
        if (estudanteToUpdate != null) {
            return estudanteToUpdate;
        }

        throw new Exception("O Estudante não foi encontrado");
    }


    public static void delete(Long id) {
        BaseDeDados.listaEstudantes.removeIf(estudante -> estudante.getRegistro().equals(id));
    }
}
