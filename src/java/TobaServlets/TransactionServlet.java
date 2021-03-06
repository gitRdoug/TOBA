/*
 * Douglas Jones - 2286699 - COP2806
 */
package TobaServlets;

import Buisness.Account;
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
public class TransactionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                          throws ServletException, IOException {
        String url = null;
        
       
        
        // get current action
        String action = request.getParameter("action");
        
        if (action == null) {
            action = "invalid"; 
        }
        
        //  perform action and set URL to appropriate page
        if (action.equals("invalid")) {
            url = "/transaction.jsp"; 
        }
        
        if (action.equals("toSavings") || action.equals("toChecking")) {
            
            double transferAmount = Double.parseDouble(request.getParameter("amount"));
            // get Session and the account attributes
            HttpSession session = request.getSession();
            
            Account checking = (Account) session.getAttribute("checking");
            Account savings = (Account) session.getAttribute("savings");
            
            // Create string object for the message.
            String message = null;
            
            
            if (transferAmount <= 0) {
                message = "Please enter an amount to tranfer.";
                url = "/transaction.jsp";
            }
            
            else {
                if (action.equals("toSavings")) {
                    checking.debit(transferAmount); 
                    savings.credit(transferAmount);
                }
                else if(action.equals("toChecking")) {
                    checking.credit(transferAmount); 
                    savings.debit(transferAmount);
                }
                //Update the seesion attributes
                session.setAttribute("checking", checking);
                session.setAttribute("savings", savings);
                // Save the acount changes to the db
                Buisness.AccountDB.update(checking);
                Buisness.AccountDB.update(savings);
                message = "Your funds have been Transfered";
                url = "/account_activity.jsp";
                
                
            }
             // Set  message attribute
            request.setAttribute("message", message);
           
        
        }
        getServletContext().getRequestDispatcher(url).forward(request,response);
    } 
}
