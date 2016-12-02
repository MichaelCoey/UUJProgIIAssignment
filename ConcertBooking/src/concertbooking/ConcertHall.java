package concertbooking;

    public class ConcertHall {
        
        //Concert Hall Atributes
        private Seat[][] seats;
        private int soldCount;
        private int availableCount;
        private int totalSeats = 90;
        
        
        public ConcertHall()
        //Set the Array Size to 9 rows and 10 columns and Seats sold to 0
        {
            seats = new Seat[9][10];
            soldCount = 0;
        }
        
        public Seat getSeat(int x, int y)
        //To get the exact seat find its row and column value
        {
            return seats[x][y];
        }
        
        public int getNumberOfSeatsSold()
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
