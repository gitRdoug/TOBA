/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class AccountDB {
    
    public static void insert(Account account) {
        
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        // get transaction
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(account);
            trans.commit();
        } catch( Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
        
    }
    
    public static void update(Account account) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        // get transaction
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.merge(account);
            trans.commit();
        } catch( Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
        
    }
   
}
