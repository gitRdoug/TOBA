/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import Buisness.DBUtil;
import Buisness.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.servlet.http.HttpServlet;

/**
 *
 * @author DouglasJones
 */
public class ReportsServlet extends HttpServlet {
    
    public static List<User> buildAdminReport() {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT i from toba.User i" + 
                        "WHERE i.isProcessed = 'n'";
        TypedQuery<User> q  = em.createQuery(qString, Buisness.User.class);
        
        List<User> users;
        try {
             users = q.getResultList();
             if (users == null || users.isEmpty())
                    users= null;
             
        } finally {
            em.close();
        }
        return users;
    }  

    
}
