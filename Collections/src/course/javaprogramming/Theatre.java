package course.javaprogramming;

import java.util.*;

public class Theatre {
    private  final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNumber = 1; seatNumber <= seatsPerRow ; seatNumber++) {
                double price = 12.00;
                if(row < 'D'  && (seatNumber > 4 && seatNumber < 9)){
                    price = 20.00;
                }else if (row > 'F' || (seatNumber < 4 || seatNumber > 9 )){
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d",seatNumber),price);
                seats.add(seat);

            }

        }
    }

    public String getTheaterName(){
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber,0);
        int foundSeat = Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        }else {
            System.out.println("there is no seat No. " + seatNumber);
            return false;
        }
    }

    public Collection<Seat> getSeats(){
        return seats;
    }


    //Seat inner Class
    public  class Seat implements Comparable<Seat>{

        private final String seatNumber;
        private double price;
        private boolean reserved = false;

        public Seat(String seatNumber, double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public boolean reserve(){
            //if false
            if(!this.reserved){
                this.reserved = true;
                System.out.println("seat " + this.seatNumber + " reserved");
                return true;
            }else {
                return false;
            }
        }

        public boolean cancel(){
            if (this.reserved){
                this.reserved =false;
                System.out.println("Reservation of seat " + this.seatNumber + " cancelled");
                return true;
            }else {
                return false;
            }
        }

        public String getSeatNumber() {
            return this.seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

    }
}
