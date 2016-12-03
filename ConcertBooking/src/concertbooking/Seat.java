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
        
    public void bookSeat(Customer newCustomer) {
        booked = true;
        customer = newCustomer;
    }
    
    public Boolean getBooked()
    {
        return booked;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
     
    public abstract int unBook();       
}      

