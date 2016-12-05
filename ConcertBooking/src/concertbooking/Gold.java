package concertbooking;

public class Gold extends Seat{
    
    private Boolean backStagePass;
    
    public Gold()
    {
        backStagePass = randomDraw();
    }
    
    private Boolean randomDraw() 
    {
        int num = (int)(Math.random() * 10) + 1;
        return num == 1;
    }
   
    
    public Boolean getBackStagePass()
    {
        return backStagePass;
    }
    
    public void setBackStagePass(Boolean backStageFromFile)
    {
        backStagePass = backStageFromFile;
    }
    
    @Override
    public int unBook()
    {
        booked = false;
        customer = null;
        
        return 0;
    }
}
