package br.com.fiap.tech.api.jobopportunitybroker.repository;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
