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
public class Person {
    
    private Department department;
    
    // and for fix middleman
    public Department getDepartment() {
        return department;
    }
    
    public void setDepartment(Department arg) {
        department = arg;
    }
    
    public Person getManager() {
        return department.getManager();
    }
    
}
