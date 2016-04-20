/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import Beans.User;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DouglasJones
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        
        String url = "/login.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/login.jsp"; 
        }
        
        else if (action.equals("login")) {
            // get parameters from the request
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
         
            // Get the session user object.
            HttpSession session = request.getSession();
            User user = (User) session.getAttribute("user");;
            //check for user attribute.
            if (user == null || user.equals("")) {
                user = new User();
                // validate credentials
                 url = validateCredentials(username, password, user);
            }
            
            else{
            // validate credentials
            url = validateCredentials(username, password, user);
            }
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }
    
    public static String validateCredentials(String username, String password, User user) {
            String url;
            if (username.equals("jsmith@toba.com") && password.equals("letmein") ||
                username.equals(user.userName) && password.equals(user.password)) {
                url = "/account_activity.jsp";
            }
            else {
                url = "/login_failure.jsp";
            }
        return url;
    }
    
    
   
}
