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
public class Seat { 
    
    private boolean booked;
    private Customer customer;
    
    public Seat() {
        booked = false;
        customer = null;
    }
        
    public void Bookseat(Customer c) {
        booked = true;
        customer = c;
    }
     
    public abstract Unbook();       
}      

