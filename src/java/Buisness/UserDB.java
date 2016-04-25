/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UserDB {
    
    public static void insert(User user) {
        
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("user");
        
        EntityManager em = emf.createEntityManager();
        
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(user);
            trans.commit();
        } catch( Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
        
    }
}
