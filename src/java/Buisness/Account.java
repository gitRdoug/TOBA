/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account implements Serializable{
   
    public enum AccountType { CHECKING, SAVINGS }    
    
    private AccountType accountType;
    
    @Id
    private User user;
    
    private double balance;
    
    //No Arg Construstor
    public Account() {
    }
   
    public Account(User user, double balance, AccountType accountType ) {
        this.user = user;
        this.balance = balance;
        this.accountType = accountType;
    }
    
    public AccountType getAccountType() {
        return accountType;
        
    }
    
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;   
    }
    
    public double credit(double balance, double credit) {
        balance = balance + credit;
        return balance;
    }
    
    public double debit(double balance, double debit) {
        balance = balance - debit;
        return balance;
    } 
}
