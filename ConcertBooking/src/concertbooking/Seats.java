/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

/**
 *
 * @author george
 */
public class Seats {
    
    private boolean Booked;
    private Customer customer;
        
    public void Bookseat(Customer c) {
        Booked = false;
        customer = null;
    }
     
    public abstract Unbook() {
        
    }
}      

