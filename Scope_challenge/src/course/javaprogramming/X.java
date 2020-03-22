package course.javaprogramming;

import java.util.Scanner;

public class X {
    int x;

    public X(Scanner x) {
        System.out.println("pick a number:");
        this.x = x.nextInt();
    }

    public void x(){
        for (int x = 0; x <= 12 ; x++) {
            System.out.println( this.x + " * " + x + " = " + (this.x * x));
        }
    }
}
