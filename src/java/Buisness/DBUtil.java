/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
        private static final EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("userPU");
        
        public static EntityManagerFactory getEmFactory() {
            return emf;
        }
  
        
    
}
