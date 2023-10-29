package br.com.fiap.tech.api.jobopportunitybroker.entity;

import jakarta.persistence.*;

import java.util.List;
import java.util.Map;

@Entity
public class Teste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;


    private List<String> questoesRespondidas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public List<String> getQuestoesRespondidas() {
        return questoesRespondidas;
    }

    public void setQuestoesRespondidas(List<String> questoesRespondidas) {
        this.questoesRespondidas = questoesRespondidas;
    }
}


