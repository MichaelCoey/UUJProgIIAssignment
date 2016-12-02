package concertbooking;

    public class ConcertHall {
        
        //Concert Hall Atributes
        private Seat[][] seats;
        private int soldCount;
        private static final int TOTAL_SEATS = 90;
        
        //Set the Array Size to 9 rows and 10 columns and Seats sold to 0       
        public ConcertHall()
        {
            seats = new Seat[9][10];
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
        
        //To get the exact seat find its row and column value
        public Seat getSeat(int x, int y)
        {
            return seats[x][y];
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
        
        //Find out the updated amount of Seats Sold
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
        
        //Find out the updated amount of Seats Available
        public void removeSeats(int numSeats)
        {
            soldCount -= numSeats;
        } 
}
