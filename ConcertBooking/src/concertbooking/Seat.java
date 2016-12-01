package concertbooking;

/**
 *
 * @author george
 */
public abstract class Seat { 
    
    protected boolean booked;
    protected Customer customer;
    
    public Seat() {
        booked = false;
        customer = null;
    }
        
    public void Bookseat(Customer c) {
        booked = true;
        customer = c;
    }
     
    public abstract int unBook();       
}      

