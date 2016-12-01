package concertbooking;

    public class ConcertHall {
        
        private Seat[][] seats;
        private int soldCount;
        
        
        public ConcertHall()
        {
            seats = new Seat[9][10];
            soldCount = 0;
        }
        
        public Seat getSeat(int x, int y)
        {
            return seats[x][y];
        }
        
        public int getNumberOfSeatsAvailable()
        {
            for (int i=0; i<9; i++) {
                for (int j=0; j<10; j++) {
                Seat seat = getSeat(i, j);
                    if (seat.getBooked())
                    {
                        soldCount++;
                    }
                }
            }
            return 0;
        }      
        public int getNumberOfSeatsSold()
        {
            for (int i=0; i<9; i--) {
                for (int j=0; j<10; j--) {
                Seat seat = getSeat(i, j);
                    if (seat.getBooked())
                    {
                        soldCount--;
                    }
                }
            }
            return 0;
        }
}
