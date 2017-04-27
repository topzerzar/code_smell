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
public class Manager extends Employee {
    String grade;
    
    Manager(String id, String name, String grade) {
        super(id, name);
        this.grade = grade;
    }
    
    public String getId() {
        return id;
    }
}
