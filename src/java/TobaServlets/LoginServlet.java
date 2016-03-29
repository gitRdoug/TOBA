/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DouglasJones
 */
public class LoginServlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        
        String url = "/login.html";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/login.html"; 
        }
        
        else if (action.equals("login")) {
            // get parameters from the request
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            // validate parameters
            if (username.equals("jsmith@toba.com") && password.equals("letmein")) {
                url = "/account_activity.html";
            }
            else {
                url = "/login_failure.html";
            }
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }
   
}
