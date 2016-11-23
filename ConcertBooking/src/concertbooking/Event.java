package concertbooking;


/**
 *
 * @author David
 */
public class Event {
    private String title;
    private String date;
    private int[] prices = new int[3];
    /**
     * **Ticket Prices in Pence**
     * prices[0]- Gold seats
     * prices[1]- Silver seats
     * prices[2]- Bronze seats
     */
    
    Event(String newTitle, String newDate, int[] newPrices)
    {
        title = newTitle;
        date = newDate;
        prices[0] = newPrices[0];
        prices[1] = newPrices[1];
        prices[2] = newPrices[2];
    }
    
    /*Title*/
    public String getTitle()
    {
        return title;
    }

    /*Date*/
    public String getDate()
    {
        return date;
    }
    
    /*Prices*/
    public int[] getPrices()
    {   
        return prices;
    }
    
}
