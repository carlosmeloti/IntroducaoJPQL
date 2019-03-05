/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author QoS Dev
 */
@Entity
@Table(name="series")
public class Serie {
   
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(length = 25, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int anoCriacao;

    private String descricao;

    @OneToMany(mappedBy = "serie", orphanRemoval = true)
    private List<Temporada> temporadas;

    public Serie() {
    }

    public Serie(String nome, int anoCriacao, String descricao) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", ano de criação='" + anoCriacao + '\'' +
                "}\n";
    }
    
}
