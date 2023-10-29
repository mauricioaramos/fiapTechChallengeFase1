package br.com.fiap.tech.api.jobopportunitybroker.service;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Entrevista;
import br.com.fiap.tech.api.jobopportunitybroker.repository.EntrevistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntrevistaService {
    @Autowired
    private EntrevistaRepository entrevistaRepository;

    public Entrevista agendarEntrevista(Entrevista entrevista) {
        return entrevistaRepository.save(entrevista);
    }

    public List<Entrevista> listarEntrevistasPorVaga(Long vagaId) {
       return entrevistaRepository.findByVagaId(vagaId);
    }

    public List<Entrevista> listarEntrevistasPorCandidato(Long candidatoId) {
        return entrevistaRepository.findByCandidatoId(candidatoId);
    }


}
