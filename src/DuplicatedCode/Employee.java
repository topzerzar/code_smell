/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicatedCode;

/**
 *
 * @author weerapon
 */
public class Employee {
    String name, id;
    
    Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    Employee(String id, String name, String grade) {
        this.id = id;
        this.name = name;
    }
    
}
