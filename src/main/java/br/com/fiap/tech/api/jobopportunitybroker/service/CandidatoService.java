package br.com.fiap.tech.api.jobopportunitybroker.service;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Candidato;
import br.com.fiap.tech.api.jobopportunitybroker.repository.CandidatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatoService {
    @Autowired
    private CandidatoRepository candidatoRepository;

    public List<Candidato> listarCandidatos() {
        return candidatoRepository.findAll();
    }

    public Candidato criarCandidato(Candidato candidato) {
        return candidatoRepository.save(candidato);
    }
}
