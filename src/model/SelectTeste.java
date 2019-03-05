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
public class SelectTeste implements Serializable {
    
    @Id
    @Column(name="nome")
    private String nome;

    public SelectTeste() {
    }
    
    

    public SelectTeste(String nome) {
        this.nome = nome;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "SelectTeste{" + "nome=" + nome + '}';
    }
    
    
    
    
    
}
