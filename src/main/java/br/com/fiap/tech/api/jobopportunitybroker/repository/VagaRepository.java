package br.com.fiap.tech.api.jobopportunitybroker.repository;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Long> {
}
