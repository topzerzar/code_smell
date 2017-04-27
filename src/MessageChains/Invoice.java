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
public class Invoice {
    
    Customer customer;
    
    Invoice() {
        customer = new Customer();
    }
    
    public String checkCustomerInTH() {
        if(customer.getLocal().equals("Thailand")) {
            return "Sawadee";
        }
        return "Hello";
    }  
}
