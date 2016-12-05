package concertbooking;


/**
 *
 * @author David, George, Michael, Pete 
 */
public class ConcertBooking {

    public static void main(String[] args)
    {
        // TODO code application logic here
        
//        FileStorage fileStorage = new FileStorage();
//        
//        ConcertHall concertHall = new ConcertHall();
//
//        Customer customer1 = new Customer("David", "02891272379", "david@fakeemail.com");
//        Customer customer2 = new Customer("Michael", "02891235454", "michael@coldmail.co.uk");
//        Customer customer3 = new Customer("Pedro", "07723437433", "pedro@muchomail.com");
//        Customer customer4 = new Customer("Big G", "02891345885", "george@moneymail.com");
//
//
//        concertHall.bookSeat(0, 0, customer1);
//        concertHall.bookSeat(3, 5, customer2);
//        concertHall.bookSeat(8, 1, customer3);
//        concertHall.bookSeat(8, 4, customer4);

        //seats[0][0].bookSeat(customer1);

        //seats[3][5].bookSeat(customer2);

        //seats[8][1].bookSeat(customer3);

        //seats[8][4].bookSeat(customer4);

        //concertHall.setSeats(seats);

        //fileStorage.saveSeats(concertHall);
        
        
        FileStorage fileStorage = new FileStorage();
        ConcertHall hall = fileStorage.loadSeats();
        
        for(int i=0; i<9; i++)
        {
            for(int j=0; j<10; j++)
            {
                Seat seat = hall.getSeat(i,j);
                String output = "Seat " + i + " " + j;
                
                if(seat.getBooked())
                {
                    output += ": Booked ";
                    Customer customer = seat.getCustomer();
                    output += customer.getName() + " " + customer.getPhone() + " " + customer.getEmail();               
                }
                else
                {
                    output += ": Not Booked ";
                }
                
                if(seat instanceof Gold)
                {
                    output+= "BackStage Pass Winner";
                }
                System.out.println(output);
            }
        }
        
        
        
    }
    
    
}
