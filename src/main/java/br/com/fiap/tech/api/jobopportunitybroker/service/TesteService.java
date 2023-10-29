package br.com.fiap.tech.api.jobopportunitybroker.service;

import br.com.fiap.tech.api.jobopportunitybroker.entity.Teste;
import br.com.fiap.tech.api.jobopportunitybroker.repository.TesteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class TesteService {
    @Autowired
    private TesteRepository testeRepository;

    public Teste realizarTeste(Long testeId, Long candidatoId,List<String> respostas) {

        Optional<Teste> teste = Optional.of(testeRepository.findById(testeId).orElseThrow());
        Teste testeResposta = new Teste();
        if(teste.isPresent()){
            testeResposta.setId(teste.get().getId());
            testeResposta.setQuestoesRespondidas(respostas);
            return testeRepository.save(testeResposta) ;
        }

        return testeResposta;
    }

    public List<Teste> listarTestesDisponiveis() {
       return  testeRepository.findAll();
    }

    public Optional<Teste> findTestById(Long testeId) {

        return testeRepository.findById(testeId);
    }

}
