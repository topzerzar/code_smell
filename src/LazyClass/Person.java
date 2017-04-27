/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LazyClass;

/**
 *
 * @author weerapon
 */
public class Person {
    
    private String firstname;
    private String lastname;
    private TelephoneNumber telephone;
    private int telephoneNumber;
    
    Person() {
        telephone = new TelephoneNumber();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public TelephoneNumber getTelephone() {
        return telephone;
    }

    public void setTelephone(TelephoneNumber telephone) {
        this.telephone = telephone;
    }

    /**
     * @return the telephoneNumber
     */
    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * @param telephoneNumber the telephoneNumber to set
     */
    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }
    
}
