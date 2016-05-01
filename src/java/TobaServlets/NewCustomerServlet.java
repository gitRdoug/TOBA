/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Buisness.Account;
import Buisness.User;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DouglasJones
 */
public class NewCustomerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        
        String url = "/newCustomer.jsp";
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/newCustomer.jsp"; 
        }
        
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = request.getParameter("FirstName");
            String lastName = request.getParameter("LastName");
            String phone = request.getParameter("Phone");
            String address = request.getParameter("Address");
            String city = request.getParameter("City");
            String state = request.getParameter("State");
            String zipCode = request.getParameter("ZipCode");
            String email = request.getParameter("Email");
            
           
            HttpSession session = request.getSession();
            // Create string object for the message.
            String message;
            // validate the parameters
           
            
            if (firstName == null || firstName.isEmpty() || 
                lastName == null || lastName.isEmpty() || 
                phone == null || phone.isEmpty() ||    
                address == null || address.isEmpty() ||  
                city == null || city.isEmpty() ||     
                state == null || state.isEmpty() ||    
                zipCode == null || zipCode.isEmpty() ||     
                email == null || email.isEmpty()) {
                
                // set message 
                message = "ALL FIELDS MUST COMPLETED!";
                url = "/newCustomer.jsp";
            
            }
            else {
                // Create a User object with the validated input provided.
                User user = new User(firstName, lastName, phone, address, city, state, zipCode, email);
                // Create new accounts for the user
                Account checking = new Account(user, 0.00, Account.AccountType.CHECKING);
                
                Account savings = new Account(user, 25.00, Account.AccountType.SAVINGS);
                // set message to null.
                message = null;
                url = "/success.jsp";
                // Store the User object and Accounts to the database.
                Buisness.UserDB.insert(user);
                
                // Ive not been able to clear up 
                // java.lang.IllegalStateException: 
                // Exception Description: No transaction is currently active
                
                // So Ive commented out my code to move forward. 
                
                //Buisness.AccountDB.insert(checking);
                //Buisness.AccountDB.insert(savings);
                
                //Set session user attribute
                session.setAttribute("user", user);
                session.setAttribute("checking", checking);
                session.setAttribute("savings", savings);
               
                
                
                
               
            }
            // Set  message attribute
            request.setAttribute("message", message);
           
        }
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request,response);
    }

}