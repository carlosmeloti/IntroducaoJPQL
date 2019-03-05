/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author QoS Dev
 */
@Entity
public class SerieDTO implements Serializable {

    @Id
    @Column(name="id")
    private String idSerie;
    @Column(name="nome")
    private String nome;
    @Column(name="descricao")
    private String descricao;

    public SerieDTO() {
    }

    public SerieDTO(String idSerie, String nome, String descricao) {
        this.idSerie = idSerie;
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(String idSerie) {
        this.idSerie = idSerie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "SerieDTO{" + "idSerie=" + idSerie + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
    
    
    
    
    
}
