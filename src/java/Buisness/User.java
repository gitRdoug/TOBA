/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import TobaServlets.NewCustomerServlet;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DouglasJones
 */

@Entity
public class User implements Serializable {
    
    // Define user Proerties.
    
     @Id
    private String userName;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    private String password;
    private String salt;
    
   
   

   // No arg construstor
    public User () {
    }
    
    // Constructor
    public User(String firstName, String lastName, String phone, String address, 
            String city, String state, String zipCode, String email, String password) throws NoSuchAlgorithmException {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.salt = PasswordUtil.getSalt();
        this.password = PasswordUtil.hashPassword(password + this.salt);
        this.userName = lastName + firstName + phone;
        
    }

   
    
    // Get and set methods for User properties.
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getphone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
     public String getState() {
        return state;
    }
    
    public void setState(String state) {
        this.state = state ;
    }
    
     public String getZipCode() {
        return zipCode;
    }
    
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    
     public String getEmail() {
        return email;
    }
    
    public void setEmail(String email ) {
        this.email = email ;
        
    }
    
     public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
     public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
     public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
