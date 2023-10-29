package br.com.fiap.tech.api.jobopportunitybroker.service;

import br.com.fiap.tech.api.jobopportunitybroker.dto.VagaDTO;
import br.com.fiap.tech.api.jobopportunitybroker.entity.Candidato;
import br.com.fiap.tech.api.jobopportunitybroker.entity.Vaga;
import br.com.fiap.tech.api.jobopportunitybroker.repository.CandidatoRepository;
import br.com.fiap.tech.api.jobopportunitybroker.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class VagaService {
    @Autowired
    private VagaRepository vagaRepository;
    @Autowired
    private CandidatoRepository candidatoRepository;

    public String candidatarAVaga(Long vagaId, Candidato candidato) {
        Optional<Vaga> vagaOptional = vagaRepository.findById(vagaId);
        if (!vagaOptional.isPresent()) {
            return "Vaga não encontrada";
        }

        Optional<Candidato> candidatoOptional = candidatoRepository.findById(candidato.getId());
        if (!candidatoOptional.isPresent()) {
            return "Candidato não encontrado";
        }

        Vaga vaga = vagaOptional.get();
        Candidato candidatoCadastrado = candidatoOptional.get();
        vaga.adicionarCandidato(candidatoCadastrado); // Método a ser implementado na classe Vaga.

        vagaRepository.save(vaga);

        return "Candidato se candidatou com sucesso à vaga " + vaga.getId();
    }

    public List<Vaga> listarVagas() {
        return vagaRepository.findAll();
    }


    public Vaga criarVaga(Vaga vaga) {
        return vagaRepository.save(vaga);
    }

    public void delete(Long vagaId) {
        vagaRepository.deleteById(vagaId);
    }

}