/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Buisness.User;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DouglasJones
 */
public class ResetPasswordServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        String url = "/resetPassword.jsp";
        
        HttpSession session = request.getSession();
        String action = request.getParameter("action");
        User user = (User) session.getAttribute("user");
        String password = user.getPassword();
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/resetPassword.jsp"; 
        }
        
        else if (action.equals("reset")) {
            // get parameters from the request
           
            String currentPassword = request.getParameter("CurrentPassword");
            String newPassword = request.getParameter("NewPassword");
            String confirmNewPassword = request.getParameter("ConfirmNewPassword");
            
            String message;
            
            if (currentPassword == null || currentPassword.isEmpty() || 
                newPassword == null || newPassword.isEmpty() || 
                confirmNewPassword == null || confirmNewPassword.isEmpty()){ 
                
                message = "ALL FIELDS MUST COMPLETED!";
                url = "/resetPassword.jsp";
                }
            else {
           
                 if (currentPassword.equals(password)){
                
                    if (confirmNewPassword.equals(newPassword)) {
                        message = null;
                        url = "/account_activity.jsp";
                    
                        //Hash and salt password.
                        String salt = Buisness.PasswordUtil.getSalt();
                        user.setSalt(salt);
                        String hashedSaltedPassword = (newPassword + salt);
                        user.setPassword(hashedSaltedPassword);
                        session.setAttribute("user", user);
                        Buisness.UserDB.update(user);
                        }
                        
                    
                    else {
                          message = "Your new password submissions do not match. Please resubmit this form.";
                          url = "/resetPassword.jsp";
                        }
                 }
                
                else {
                        message = "Your current password does not match our records. Please resubmit this form.";
                     url = "/resetPassword.jsp";
                      }  
                 }
           
          
                    
            }
        getServletContext().getRequestDispatcher(url).forward(request,response); 
                
    }
    
            
 }   
        


