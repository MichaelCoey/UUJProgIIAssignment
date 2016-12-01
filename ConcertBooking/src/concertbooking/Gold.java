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
    
    @Override
    public int unBook()
    {
        booked = false;
        customer = null;
        
        return 0;
    }
}
