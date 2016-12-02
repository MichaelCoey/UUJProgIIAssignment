package concertbooking;

    public class ConcertHall {
        
        //Concert Hall Atributes
        private Seat[][] seats;
        private int soldCount;
        private int totalSeats = 90;
        
        
        public ConcertHall()
        //Set the Array Size to 9 rows and 10 columns and Seats sold to 0
        {
            seats = new Seat[9][10];
            assignSeatingTiers();
            soldCount = getNumberOfSeatsSold();
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
        
        public Seat getSeat(int x, int y)
        //To get the exact seat find its row and column value
        {
            return seats[x][y];
        }
        
        private int getNumberOfSeatsSold()
        {
            for (int i = 0; i < 9; soldCount++) {
                for (int j = 0; j < 10; soldCount++) {
                    Seat seat = getSeat(i, j);
                    if (seat.getBooked())
                    {
                        soldCount++;
                    }
                }
            }
            return soldCount;
        }        
        
        
        //public int getNumberOfSeatsAvailable()
        //{
            //totalSeats - soldCount = availableCount;
            
            //return availableCount;
        //}      
}
