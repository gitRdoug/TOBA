/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import java.io.Serializable;

public class Account implements Serializable{
   
    public enum AccountType { CHECKING, SAVINGS }    
    
    private AccountType accountType;
    private User user;
    private double balance;
   
    public Account(User user, double balance, AccountType type ) {
        this.user = user;
        this.balance = balance;
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
