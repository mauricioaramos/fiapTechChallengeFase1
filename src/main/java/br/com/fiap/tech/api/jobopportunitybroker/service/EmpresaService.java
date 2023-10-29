package br.com.fiap.tech.api.jobopportunitybroker.service;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Empresa;
import br.com.fiap.tech.api.jobopportunitybroker.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
    @Autowired
    private EmpresaRepository empresaRepository;

    public List<Empresa> listarEmpresas() {
        return empresaRepository.findAll();
    }

    public Empresa criarEmpresa(Empresa empresa) {
        return empresaRepository.save(empresa);
    }
}
