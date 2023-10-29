package br.com.fiap.tech.api.jobopportunitybroker.controller;

import br.com.fiap.tech.api.jobopportunitybroker.dto.RealizarTesteDto;
import br.com.fiap.tech.api.jobopportunitybroker.entity.Teste;
import br.com.fiap.tech.api.jobopportunitybroker.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/testes")
public class TesteController {
    @Autowired
    private TesteService testeService;

    @GetMapping("/{testeId}")
    public Optional<Teste> getTeste(@PathVariable Long testeId) {
        return testeService.findTestById(testeId);
    }

    @PostMapping("/realizar")
    public ResponseEntity<String> realizarTeste(@RequestBody RealizarTesteDto request) {
        // Use os campos de request para permitir que o candidato realize o teste.
        Long testeId = request.testeId();
        Long candidatoId = request.candidatoId();
        List<String> respostas = request.respostas();

        // Chame o serviço para permitir que o candidato realize o teste.
        Teste teste = testeService.realizarTeste(testeId, candidatoId, respostas);

        return ResponseEntity.ok("Teste realizado com sucesso.");
    }


}
