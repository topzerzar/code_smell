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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Before
        Person top = new Person();
        Department softwareEng = new Department(top);
        Person manager = softwareEng.getManager();
        
        // After
        Person iam = new Person();
        Department softwareDesign = new Department(iam);
        Person managerDesign = iam.getDepartment().getManager();
    }
    
}
