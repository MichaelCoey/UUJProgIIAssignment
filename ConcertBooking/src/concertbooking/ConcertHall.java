/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concertbooking;

    public class ConcertHall {
        
        private Seat[][] seats = new Seat[9][10];
        
        
        public Seat getSeat(int x, int y)
        {
            return seats[x][y];
        }
}
