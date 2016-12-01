/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
