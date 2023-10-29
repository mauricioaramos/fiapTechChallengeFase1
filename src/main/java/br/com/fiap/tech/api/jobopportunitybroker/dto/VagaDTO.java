package br.com.fiap.tech.api.jobopportunitybroker.dto;

import jakarta.validation.constraints.NotBlank;

public record VagaDTO(
        @NotBlank(message = "O titulo não pode estar em branco.")
        String titulo,
        @NotBlank(message = "A descricao não pode estar em branco.")
        String descricao

) {
}
