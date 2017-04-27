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
public class Address {
    private Country country;

    public Country getCountry() {
        return country;
    } 
    
    public String getLocal() {
        return country.getLocal();
    }
}
