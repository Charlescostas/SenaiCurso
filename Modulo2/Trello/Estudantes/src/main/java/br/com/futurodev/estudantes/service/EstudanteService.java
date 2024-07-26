package br.com.futurodev.estudantes.service;

import br.com.futurodev.estudantes.model.BaseDeDados;
import br.com.futurodev.estudantes.model.Estudante;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudanteService {
    public List<Estudante> list() {
        return BaseDeDados.list();
    }

    public Estudante listId(Long id){
        return BaseDeDados.search(id);
    }

    public void create(Estudante estudante) throws Exception {
        if (BaseDeDados.search(estudante.getRegistro()) != null) {
            throw new Exception("Estudante já Cadastrado!!!");
        }
        BaseDeDados.adicionar(estudante);
    }

    public void delete(Long id) {
        BaseDeDados.delete(id);
    }
}
