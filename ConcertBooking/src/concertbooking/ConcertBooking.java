package concertbooking;


/**
 *
 * @author David, George, Michael, Pete 
 */
public class ConcertBooking {

    public static void main(String[] args)
    {
        // TODO code application logic here
        
        FileStorage fileStorage = new FileStorage();
        
        ConcertHall concertHall = new ConcertHall();
        
        Customer customer1 = new Customer("David", "02891272379", "david@fakeemail.com");
        Customer customer2 = new Customer("Michael", "02891235454", "michael@coldmail.co.uk");
        Customer customer3 = new Customer("Pedro", "07723437433", "pedro@muchomail.com");
        Customer customer4 = new Customer("Big G", "02891345885", "george@moneymail.com");

        Seat[][] seats = new Seat[9][10];
        
        
//concertHall.seats[3][5].bookSeat(customer1);

        seats[0][4] = new Bronze();
        seats[0][4].bookSeat(customer1);

        seats[3][5] = new Bronze();
        seats[3][5].bookSeat(customer2);
        
        seats[9][1].bookSeat(customer3);
        
        seats[6][4].bookSeat(customer4);
        
        concertHall.seats = seats;
        fileStorage.saveSeats(concertHall);
    }
}
