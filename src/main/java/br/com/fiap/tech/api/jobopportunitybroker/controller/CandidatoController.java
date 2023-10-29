package br.com.fiap.tech.api.jobopportunitybroker.controller;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Candidato;
import br.com.fiap.tech.api.jobopportunitybroker.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidatos")
public class CandidatoController {
    @Autowired
    private CandidatoRepository candidatoRepository;

    @GetMapping
    public List<Candidato> listarCandidatos() {
        return candidatoRepository.findAll();
    }

    @PostMapping
    public Candidato criarCandidato(@RequestBody Candidato candidato) {
        return candidatoRepository.save(candidato);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        candidatoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
