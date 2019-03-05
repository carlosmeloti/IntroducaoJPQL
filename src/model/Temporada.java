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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import model.Episodio;

/**
 *
 * @author QoS Dev
 */
@Entity
@Table(name="temporadas")
public class Temporada {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(nullable = false)
    private int numero;
    private String descricao;

    @ManyToOne
    private Serie serie;

    @OneToMany(mappedBy = "temporada", orphanRemoval = true)
    private List<Episodio> episodios;

    public Temporada() {
    }

    public Temporada(int numero, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public List<Episodio> getEpisodios() {
        return episodios;
    }

    public void setEpisodios(List<Episodio> episodios) {
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + id +
                ", numero=" + numero +
                ", descricao='" + descricao + '\'' +
                ", serie=" + serie.getNome() +
                "}\n";
    }
    
}
