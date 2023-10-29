package br.com.fiap.tech.api.jobopportunitybroker.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Entrevista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataEntrevista;
    private String local;
    private String descricao;

    @ManyToOne
    private Vaga vaga;

    @ManyToOne
    private Candidato candidato;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDataEntrevista() {
        return dataEntrevista;
    }

    public void setDataEntrevista(LocalDateTime dataEntrevista) {
        this.dataEntrevista = dataEntrevista;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Vaga getVaga() {
        return vaga;
    }

    public void setVaga(Vaga vaga) {
        this.vaga = vaga;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
