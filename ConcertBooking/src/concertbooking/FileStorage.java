package concertbooking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class FileStorage {
    
    public void newEvent(Event event)
    {
        //Save to event file
    }
    
    public Event loadSavedEvent()
    {
        Event event = null;
        String eventFile = "event.txt";
        try(Scanner input = new Scanner(new File(eventFile)))
        {
            String title = input.nextLine();
            String date = input.nextLine();
            int prices[] = new int[3];
            try
            {  
                prices[0] = Integer.parseInt(input.nextLine());
                prices[1] = Integer.parseInt(input.nextLine());
                prices[2] = Integer.parseInt(input.nextLine());
            }
            catch(NumberFormatException nfe)
            {
                System.err.println("Number is incorrect format");
                System.exit(1);
            }
            
            event = new Event(title, date, prices);
        }
        catch(FileNotFoundException ex)
        {
            System.err.println("Error opening file.");
            System.exit(1);
        }
               
        return event;
    }
}
