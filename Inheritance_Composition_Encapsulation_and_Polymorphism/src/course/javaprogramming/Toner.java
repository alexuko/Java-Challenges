package course.javaprogramming;

import java.util.logging.Level;

public class Toner {
    private boolean isColor;
    private int tonerLevel;

    public Toner(boolean isColor, int tonerLevel) {
        this.isColor = isColor;
        if(tonerLevel > 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        }else{
            this.tonerLevel = -1;
        }

    }

    public boolean isColor() {
        return isColor;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int addToner(int amount){
        if(amount > 0 && amount <= 100){
            if(tonerLevel + amount > 100){
                System.out.println("cannot add: " + amount + " of toner, Out of range. Toner level is:" + tonerLevel);
                return -1;
            }else {
                tonerLevel += amount;
                System.out.println( amount + " of toner was added, now level is: " + tonerLevel);
            }
        }else {
            System.out.println("cannot add: " + amount + " of toner, Out of range. Toner level is:" + tonerLevel);
            return -1;
        }
        return tonerLevel;
    }

    public int usedToner(int print){
        if(print > tonerLevel){
            return -1;
        }else{
            tonerLevel -= print;
        }
        return tonerLevel;
    }
}
