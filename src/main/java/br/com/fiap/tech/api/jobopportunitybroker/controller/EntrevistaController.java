package br.com.fiap.tech.api.jobopportunitybroker.controller;

import br.com.fiap.tech.api.jobopportunitybroker.dto.AgendarEntrevistaDTO;
import br.com.fiap.tech.api.jobopportunitybroker.entity.Entrevista;
import br.com.fiap.tech.api.jobopportunitybroker.service.EntrevistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/entrevistas")
public class EntrevistaController {
    @Autowired
    private EntrevistaService entrevistaService;

    @PostMapping("/agendar")
    public ResponseEntity<String> agendarEntrevista(@RequestBody AgendarEntrevistaDTO request) {
        // Use os campos de request para agendar a entrevista.
        Entrevista entrevista = new Entrevista();
        entrevista.getVaga().setId(request.vagaId());
        entrevista.getCandidato().setId(request.candidatoId());
        entrevista.setDataEntrevista(request.dataEntrevista());
        entrevista.setLocal(request.local());
        entrevista.setDescricao(request.descricao());

        entrevistaService.agendarEntrevista(entrevista);

        return ResponseEntity.ok("Entrevista agendada com sucesso.");
    }

    @GetMapping("/vaga/{vagaId}")
    public List<Entrevista> listarEntrevistasPorVaga(@PathVariable Long vagaId) {
        return entrevistaService.listarEntrevistasPorVaga(vagaId);

    }

    @GetMapping("/candidato/{candidatoId}")
    public List<Entrevista> listarEntrevistasPorCandidato(@PathVariable Long candidatoId) {
        return entrevistaService.listarEntrevistasPorCandidato(candidatoId);
    }


}