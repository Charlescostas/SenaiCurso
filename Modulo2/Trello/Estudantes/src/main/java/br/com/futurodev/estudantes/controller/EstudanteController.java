package br.com.futurodev.estudantes.controller;

import br.com.futurodev.estudantes.model.Estudante;
import br.com.futurodev.estudantes.service.EstudanteService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudante")
public class EstudanteController {
    private final EstudanteService estudanteService;

    public EstudanteController(EstudanteService estudanteService) {
        this.estudanteService = estudanteService;
    }

    @PostMapping
    public ResponseEntity<Estudante> create(@RequestBody @Valid Estudante estudante) throws Exception {
        this.estudanteService.create(estudante);
        return ResponseEntity.ok(estudante);
    }
}
