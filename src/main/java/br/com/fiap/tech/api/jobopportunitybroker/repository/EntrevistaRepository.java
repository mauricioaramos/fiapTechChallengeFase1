package br.com.fiap.tech.api.jobopportunitybroker.repository;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Entrevista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface EntrevistaRepository extends JpaRepository<Entrevista, Long> {
    List<Entrevista> findByVagaId(Long vagaId); // Método para buscar entrevistas por ID da vaga
    List<Entrevista> findByCandidatoId(Long candidatoId); // Método para buscar entrevistas por ID do candidato
}
