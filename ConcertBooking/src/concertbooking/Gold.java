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
public class Gold extends Seat{
    
    private Boolean backStagePass;
    

    private Boolean RandomDraw() 
    {
        int num = (int)(Math.random() * 10) + 1;
        if (num == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
   
    
    private Boolean getBackStagePass()
    {
        return backStagePass;
    }
    
    public int unBook()
    {
        booked = false;
        customer = null;
        
        return 0;
    }
}
