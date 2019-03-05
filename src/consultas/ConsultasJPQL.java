/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import DAO.JPAUtil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TemporalType;
import model.Episodio;
import model.SelectTeste;
import model.Serie;
import model.SerieDTO;
import org.hibernate.Session;
import org.hibernate.sql.Select;
import org.hibernate.transform.Transformers;

/**
 *
 * @author QoS Dev
 */
public class ConsultasJPQL {
    
    //Lista todas as series cadastradas no banco
    public List<Serie> ListarTodasAsSeries(){
        EntityManager em = JPAUtil.getEntityManager();
        String queryJPQL = "SELECT s FROM Serie s";
        
        return em.createQuery(queryJPQL, Serie.class)
                .getResultList();
    }
    
    // Lista de maneira estática as series criadas no ano de 2008
    public List<Serie> seriesCriadasAno2008(){
        EntityManager em = JPAUtil.getEntityManager();
        String queryJPQL = "SELECT s FROM Serie s WHERE s.anoCriacao = 2008";
        
        return em.createQuery(queryJPQL, Serie.class).getResultList();
    }
    
    // Lista de maneira dinâmica as series criadas no ano inserido pelo usuario
    public List<Serie> getSeriesCriadasNoAno(int ano){
        EntityManager em = JPAUtil.getEntityManager();
        String queryJPQL = "SELECT s FROM Serie s WHERE s.anoCriacao = :anoDesejado";
        return em.createQuery(queryJPQL, Serie.class)
                .setParameter("anoDesejado", ano)
                .getResultList();
    }
    
    //Consulta por nome. Caso o nome possua a substring informada pelo usuario
    public List<Serie> listarSeriesCujoNomeContenha(String nome) {
        EntityManager em = JPAUtil.getEntityManager();
        
        String queryJPQL = "SELECT s FROM Serie s WHERE s.nome LIKE :nome";
        
        return em.createQuery(queryJPQL, Serie.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
        
    }
    //Consulta por nome e ano.
      
    
        public Serie listarSeriesPorAnoENome(String nome, int ano){
        EntityManager em = JPAUtil.getEntityManager();
        String queryJPQL = "SELECT s FROM Serie s WHERE s.nome LIKE :nome AND s.anoCriacao = :anoDesejado";
        
        return em.createQuery(queryJPQL, Serie.class)
                .setParameter("nome", nome)
                .setParameter("anoDesejado", ano)
                .getSingleResult();
    }
        
      public List<Episodio> listarEpisodiosDaSerie(String nome) {

        EntityManager em = JPAUtil.getEntityManager();

        String queryJpql = "SELECT e FROM Episodio e WHERE e.temporada.serie.nome LIKE :nome";

            return em.createQuery(queryJpql, Episodio.class)
             .setParameter("nome", nome)
             .getResultList();
          }
      public List<Serie>  recuperarSeriesComNumeroMinimoDeTemporadas(int temporadas) {
        EntityManager em = JPAUtil.getEntityManager();
        String queryJpql = "SELECT s FROM Serie s JOIN s.temporadas t WHERE t.numero = :qtdTemporadas";

        return em.createQuery(queryJpql, Serie.class)
         .setParameter("qtdTemporadas", temporadas)
         .getResultList();
    }
      
        
      public List<SelectTeste> buscaNomeSerie(String nome){
             
          EntityManager em = JPAUtil.getEntityManager();
          StringBuilder sql = new StringBuilder();
            sql.append("SELECT nome       ");
            sql.append("  from series                        ");
            sql.append(" s where s.nome like :nome   ");

           Query q = em.createNativeQuery(sql.toString(),SelectTeste.class)
                   .setParameter("nome", nome);
           
            return q.getResultList();
     }
      
      public SerieDTO buscaNomeSerieETemporada(String nome, String descricao){
             
          EntityManager em = JPAUtil.getEntityManager();
          StringBuilder sql = new StringBuilder();
            sql.append("SELECT       ");
            sql.append("  series.id,                        ");
            sql.append(" series.nome,   ");
            sql.append(" temporadas.descricao   ");
            sql.append(" FROM   ");
            sql.append(" series series, temporadas temporadas   ");
            sql.append(" WHERE   ");
            sql.append(" series.nome like :nome AND temporadas.descricao like :descricao   ");
           Query q = em.createNativeQuery(sql.toString(),SerieDTO.class)
                   .setParameter("nome", nome)
                   .setParameter("descricao", descricao);
           
            return (SerieDTO) q.getSingleResult();
     }

        
        
     
    
}
