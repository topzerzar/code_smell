/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MessageChains;

/**
 *
 * @author weerapon
 */
public class Customer {
    
    private Address adress;
    
    public Address getAdress() {
        return adress;
    }
    
    public String getLocal() {
        return adress.getLocal();
    }
}
