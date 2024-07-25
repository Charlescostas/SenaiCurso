package br.com.futurodev.estudantes.service;

import br.com.futurodev.estudantes.model.BaseDeDados;
import br.com.futurodev.estudantes.model.Estudante;
import java.util.List;

public class EstudanteService {
    public List<Estudante> list() {
        return BaseDeDados.list();
    }

    public void create(Estudante estudante) throws Exception {
        if (BaseDeDados.search(estudante.getRegistro()) != null) {
            throw new Exception("Estudante já Cadastrado!!!");
        }

        BaseDeDados.adicionar(estudante);
    }
}
