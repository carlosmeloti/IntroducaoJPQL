/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import model.Serie;
import model.Temporada;

/**
 *
 * @author QoS Dev
 */
public class TemporadaDAO {
    
     public void persist(long serieId, Temporada temporada) {
        EntityManager em = JPAUtil.getEntityManager();
        Serie serie;

        em.getTransaction().begin();
        serie = em.getReference(Serie.class, serieId);
        serie.getTemporadas().add(temporada);
        temporada.setSerie(serie);
        em.persist(temporada);
        em.getTransaction().commit();
    }

    public void remove(Temporada temporada) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.remove(temporada);
        em.getTransaction().commit();
    }

    public void update(Temporada temporada) {
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        em.merge(temporada);
        em.getTransaction().commit();
    }

    public List<Temporada> list() {
        EntityManager em = JPAUtil.getEntityManager();

        return em.createQuery("SELECT t FROM Temporada t", Temporada.class)
                .getResultList();
    }

    public Temporada get(long id) {
        EntityManager em = JPAUtil.getEntityManager();
        return em.getReference(Temporada.class, id);
    }
}
