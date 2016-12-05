package concertbooking;

import java.util.ArrayList;

    public class ConcertHall {
        
        //Concert Hall Atributes
        private Seat[][] seats;
        private int soldCount;
        private static final int TOTAL_SEATS = 90;
            
        public ConcertHall()
        {
            seats = new Seat[9][10];
            soldCount = 0;
            assignSeatingTiers();
            soldCount = calculateNumberOfSeatsSold();
        }
        
        private void assignSeatingTiers()
        {
            //Assign Gold seats
            for(int i=0; i<3; i++)
            {
                for(int j=0; j<10; j++)
                {
                    seats[i][j] = new Gold();
                }
            }

            //Assign Silver seats
            for(int i=3; i<6; i++)
            {
                for(int j=0; j<10; j++)
                {
                    seats[i][j] = new Silver();
                }
            }

            //Assign Bronze seats
            for(int i=6; i<9; i++)
            {
                for(int j=0; j<10; j++)
                {
                    seats[i][j] = new Bronze();
                }
            }
        }
        
        //Returns seat at given position
        public Seat getSeat(int x, int y)
        {
            return seats[x][y];
        }
        
        public void setSeat(int x, int y, Seat seat)
        {
            seats[x][y] = seat;
        }
        
        public void bookSeat(int x, int y, Customer customer)
        {
            seats[x][y].bookSeat(customer);
        }
        
        //Find out how many Seats are Sold
        private int calculateNumberOfSeatsSold()
        {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 10; j++) {
                    Seat seat = getSeat(i, j);
                    if (seat.getBooked())
                    {
                        soldCount++;
                    }
                }
            }
            return soldCount;
        }
        
        //Return the number of Seats Sold
        public int getNumberOfSeatsSold()
        {
            return soldCount;
        }
        
        //Update number of seats sold
        public void addSeats(int numSeats)
        {
            soldCount += numSeats;
        }   
         
        //Find out how many Seats are Available
        public int getNumberOfSeatsAvailable()
        {
            int availableCount = TOTAL_SEATS - soldCount;
            
            return availableCount;
        } 
        
        //Update number of seats sold
        public void removeSeats(int numSeats)
        {
            soldCount -= numSeats;
        }
        
        //Search Method to find the Seat Numbers that are Booked
        public Seat searchSeatNumber(String searchItem)
        {
            boolean found = false;
            int rowNumber = 0;
            
            char[] array = { 'a', 'b', 'c', 'd', 'e', 'f','g', 'h', 'i' };
            
            while (!found && rowNumber < 9)
            {
                if (searchItem.toLowerCase().charAt(0) == array[rowNumber])
                {
                    found = true;
                }
                else
                {
                    rowNumber++;
                }
            }
            int seatNumber = Integer.valueOf(searchItem.substring(1));
            return seats[rowNumber][seatNumber];
        }
        
         public ArrayList<Seat> searchByName(String customerName)
        {
             ArrayList<Seat> findseat = new ArrayList<Seat>();
         for (int i = 0; i < 9; i++)
         {
                     for (int j = 0; j < 10; j++)  
                     {
                         Seat seat = getSeat(i, j);
             Customer customer = seat.getCustomer();
                         if (customerName.equals (customer.getName()))
                                 {
                                     findseat.add(seat); 
                                 }
                     }
                     
                 }
                 return findseat;
        }
}
