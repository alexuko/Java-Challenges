package course.javaprogramming;

public class Main {

    public static void main(String[] args) {
        Wall w1 = new Wall("north");
        Wall w2 = new Wall("East");
        Wall w3 = new Wall("SOUTH");
        Wall w4 = new Wall("north");
        Ceiling ceiling = new Ceiling(2.5,"white");
        Bed bed = new Bed("modern",2, 25,200,90,true);
        Lamp lamp = new Lamp("moon", true,false);

        Bedroom myBedroom = new Bedroom("Alex", w1,w2,w3,w4, ceiling,bed,lamp);
        myBedroom.getLamp().turnOn();
        myBedroom.makeBed();
    }
}
