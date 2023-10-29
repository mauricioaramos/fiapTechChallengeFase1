package br.com.fiap.tech.api.jobopportunitybroker.repository;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Candidato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidatoRepository extends JpaRepository<Candidato, Long> {
}
