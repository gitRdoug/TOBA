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
public class NewCustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        
        String url = "/new_customer.html";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/new_customer.html"; 
        }
        
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("FirstName");
            String lastName = request.getParameter("LastName");
            String phone = request.getParameter("Phone");
            String address = request.getParameter("Address");
            String city = request.getParameter("City");
            String state = request.getParameter("State");
            String zipCode = request.getParameter("ZipCose");
            String email = request.getParameter("Email");
           
            // validate the parameters
            String message;
            if (firstName == null || firstName.isEmpty() || 
                lastName == null || lastName.isEmpty() || 
                phone == null || phone.isEmpty() ||    
                address == null || address.isEmpty() ||  
                city == null || city.isEmpty() ||     
                state == null || state.isEmpty() ||    
                zipCode == null || zipCode.isEmpty() ||     
                email == null || email.isEmpty()) {
                
                message = "ALL FIELDS MUST COMPLETED!";
                url = "/new_customer.jsp";
            
            }
            else {
                message =  "";
                url = "/account_activity.html";
            }
            request.setAttribute("message", message);
           
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }

}