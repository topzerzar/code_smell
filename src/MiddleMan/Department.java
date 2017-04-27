/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiddleMan;

/**
 *
 * @author weerapon
 */
public class Department {
    private String chargeCode;
    private Person manager;
    
    public Department(Person arg) {
        manager = arg;
    }
    
    public Person getManager() {
        return manager;
    }
}
