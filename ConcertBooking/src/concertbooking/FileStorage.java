package concertbooking;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author David
 */
public class FileStorage {
    
    public void newEvent(Event event)
    {
        String fileName = "event.txt";
        try(FileWriter writer = new FileWriter(fileName);)
        {
            writer.write(event.getTitle());

            writer.write("\n" + event.getDate());

            int[] prices = event.getPrices();


            writer.write("\n" + prices[0]);
            writer.write("\n" + prices[1]);
            writer.write("\n" + prices[2]);
        }
        catch (IOException ex)
        {
            Logger.getLogger(FileStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    
    public void saveSeats(ConcertHall hall)
    {
        String fileName = "seats.txt";
        try(FileWriter writer = new FileWriter(fileName);)
        {
            for(int i=0; i<9; i++)
            {
                for(int j=0; j<10; j++)
                {
                    //Retrieve current seat
                    Seat seat = hall.getSeat(i,j);
                    
                    String line;
                    //Retrieve customer owning seat
                    
                    if(seat.getBooked())
                    {
                        Customer customer = seat.getCustomer();
                        line = "1,";
                        line += customer.getName() + ",";
                        line += customer.getPhone() + ",";
                        line += customer.getEmail();
                    }
                    else
                    {
                        line = "0";
                    }
                    
                    writer.write(line);
                }
            }
        }
        catch(IOException ex)
        {
            Logger.getLogger(FileStorage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
//    public ConcertHall loadSeats()
//    {
//        ConcertHall hall = new ConcertHall();
//        String seatsFile = "seats.txt";
//        
//        try(Scanner input = new Scanner(new File(seatsFile)))
//        {
//            
//        }
//        catch(FileNotFoundException ex)
//        {
//            System.err.println("Error opening file.");
//            System.exit(1);
//        }
//    }
    
}
