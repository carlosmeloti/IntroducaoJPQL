/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author QoS Dev
 */
@Entity
@Table(name="episodios")
public class Episodio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Column(nullable = false)
    private int numero;

    @Column(length = 30, nullable = false)
    private String titulo;

    private String descricao;

    @ManyToOne
    private Temporada temporada;

    public Episodio() {
    }

    public Episodio(int numero, String titulo, String descricao) {
        this.numero = numero;
        this.titulo = titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Temporada getTemporada() {
        return temporada;
    }

    public void setTemporada(Temporada temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "número=" + numero +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", temporada=" + temporada.getNumero() +
                ", série=" + temporada.getSerie().getNome() +
                "}\n";
    }
    
}
