package br.com.fiap.tech.api.jobopportunitybroker.dto;

import java.util.List;
import java.util.Map;

public record RealizarTesteDto(
        Long testeId,
        Long candidatoId,
        List<String> respostas
) { }
