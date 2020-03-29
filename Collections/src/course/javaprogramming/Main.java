package course.javaprogramming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre olympia = new Theatre("Olympia",10,12);



        if (olympia.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat is already taken ");
        }
        if (olympia.reserveSeat("F01")){
            System.out.println("Please pay for F01");
        }else {
            System.out.println("Seat is already taken ");
        }
        if (olympia.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        }else {
            System.out.println("Seat is already taken ");
        }

        if (olympia.reserveSeat("A13")){
            System.out.println("Please pay for A13");
        }else {
            System.out.println("Seat is already taken ");
        }

        List<Theatre.Seat> seats = new ArrayList<>(olympia.getSeats());
        printSeats(seats);
        List<Theatre.Seat> revSeats = new ArrayList<>(seats);
        Collections.reverse(revSeats);
        printSeats(revSeats);
    }

    public static void printSeats(List<Theatre.Seat> seats){
        for (Theatre.Seat seat : seats) {
            System.out.print(seat.getSeatNumber() + " " + seat.getPrice() + ", " );

        }
        System.out.println();
        System.out.println("============================================= ");

    }
}
