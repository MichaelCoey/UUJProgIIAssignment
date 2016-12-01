package concertbooking;

/**
 *
 * @author graem
 */
public class Silver extends Seat {
    
    @Override
    public int unBook()
    {
        booked = false;
        customer = null;
        
        return 0;
    }
}
