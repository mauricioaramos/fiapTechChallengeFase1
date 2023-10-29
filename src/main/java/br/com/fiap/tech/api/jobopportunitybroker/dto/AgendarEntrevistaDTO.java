package br.com.fiap.tech.api.jobopportunitybroker.dto;

import java.time.LocalDateTime;

public record AgendarEntrevistaDTO(
        Long vagaId,      // ID da vaga para a qual a entrevista será agendada.
        Long candidatoId,  // ID do candidato que participará da entrevista.
        LocalDateTime dataEntrevista, // Data e hora da entrevista.
        String local,    // Local da entrevista.
        String descricao // Descrição da entrevista ou notas adicionais.
) {

}

