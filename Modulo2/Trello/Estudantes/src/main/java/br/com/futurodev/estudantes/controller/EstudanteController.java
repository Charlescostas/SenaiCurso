package br.com.futurodev.estudantes.controller;

import br.com.futurodev.estudantes.model.Estudante;
import br.com.futurodev.estudantes.service.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService){
        this.estudanteService = estudanteService;
    }

    @GetMapping
    public ResponseEntity<List<Estudante>> list() {
        List<Estudante> estudantes = this.estudanteService.list();
        return estudantes.isEmpty() ? ResponseEntity.noContent().build() :
                ResponseEntity.ok(estudantes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> listid(@PathVariable("id") Long id) {
        Estudante estudante = this.estudanteService.listId(id);
        return estudante == null ? ResponseEntity.notFound().build() :
                ResponseEntity.ok(estudante);
    }

    @PostMapping
    public ResponseEntity<Estudante> create(@RequestBody @Valid Estudante estudante) throws Exception {
        this.estudanteService.create(estudante);
        return ResponseEntity.ok(estudante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        this.estudanteService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
