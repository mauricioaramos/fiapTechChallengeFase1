package br.com.fiap.tech.api.jobopportunitybroker.controller;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Candidato;
import br.com.fiap.tech.api.jobopportunitybroker.entity.Vaga;
import br.com.fiap.tech.api.jobopportunitybroker.service.VagaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vagas")
public class VagaController {
    @Autowired
    private VagaService vagaService;

    @GetMapping
    public ResponseEntity<List<Vaga>> listarVagas() {
        return ResponseEntity.ok(vagaService.listarVagas());
    }

    @PostMapping
    public Vaga criarVaga(@RequestBody Vaga vaga) {
        return vagaService.criarVaga(vaga);
    }

    @PostMapping("/{vagaId}/candidatar")
    public ResponseEntity<String> candidatarAVaga(@PathVariable Long vagaId, @RequestBody Candidato candidato) {
        String resultado = vagaService.candidatarAVaga(vagaId, candidato);
        if (resultado.startsWith("Candidato se candidatou com sucesso")) {
            return ResponseEntity.ok(resultado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resultado);
        }
    }

    @DeleteMapping("/{vagaId}")
    public ResponseEntity<Void> delete(@PathVariable Long vagaId) {
        vagaService.delete(vagaId);
        return ResponseEntity.noContent().build();
    }
}
