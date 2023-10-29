package br.com.fiap.tech.api.jobopportunitybroker.repository;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Teste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TesteRepository extends JpaRepository<Teste, Long> {
}