/*
 * Douglas Jones - 2286699 - COP2806
 */
package Buisness;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author DouglasJones
 */

@Entity
public class User implements Serializable {
    
    // Define user Proerties.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String email;
    public String userName;
    public String password;
   
    
    // No argument constructor.
    public User() {
        userId = null;
        firstName = "";
        lastName = "";
        phone = "";
        address = "";
        city = "";
        state = "";
        zipCode = "";
        email = "";
        userName = "";
        password = "";
    }
    
    // Constructor
    public User(String firstName, String lastName, String phone, String address, 
            String city, String state, String zipCode, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.email = email;
        this.userName = lastName + zipCode;
        this.password = "welcome1";
    }
    
    // Get and set methods for User properties.
    public Long getUserId() {
        return userId;
    }
    
    public void setUserId(long userId) {
        this.userId = userId;
    }
    
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

}
