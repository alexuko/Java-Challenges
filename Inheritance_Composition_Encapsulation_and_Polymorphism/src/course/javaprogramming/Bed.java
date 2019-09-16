package course.javaprogramming;

import javax.swing.text.Style;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int length;
    private int width;
    private int mattress;
    private boolean hasBedSet;

    public Bed(String style, int pillows, int height, int length, int width, boolean hasBedSet) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.length = length;
        this.width = width;
        this.mattress = 1;
        this.hasBedSet = hasBedSet;
    }

    public void make(){
        if(hasBedSet == false) System.out.println("no bed set, It cannot be made");
        else
            System.out.println("making bed");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getMattress() {
        return mattress;
    }

    public boolean isHasBedSet() {
        return hasBedSet;
    }
}
