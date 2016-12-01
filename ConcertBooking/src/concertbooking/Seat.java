package concertbooking;

/**
 *
 * @author george
 */
public abstract class Seat { 
    
    protected Boolean booked;
    protected Customer customer;
    
    public Seat() {
        booked = false;
        customer = null;
    }
        
    public void Bookseat(Customer c) {
        booked = true;
        customer = c;
    }
    
    public Boolean getBooked()
    {
        return booked;
    }
     
    public abstract int unBook();       
}      

