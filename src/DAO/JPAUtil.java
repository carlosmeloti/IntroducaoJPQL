/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.SessionFactory;

/**
 *
 * @author QoS Dev
 */
public class JPAUtil {
    
    private static EntityManagerFactory emf;


    public static EntityManager getEntityManager() {
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("IntroducaoJPQLPU");
        }
        return emf.createEntityManager();
    }
    
    
}
