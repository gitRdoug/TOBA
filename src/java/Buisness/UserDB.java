/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserDB {
    
    public static void insert(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        // get transaction
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
    
    public static void update(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(user);
            trans.commit();
        } catch( Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
        
    }
    
    
}
