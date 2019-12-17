package course.javaprogramming;


public class Main {

    public static void main(String[] args) {
        Car car = new Car("base car", 4);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        BMW bmw = new BMW("350",5);
        System.out.println(bmw.startEngine());
        System.out.println(bmw.accelerate());
        System.out.println(bmw.brake());
        System.out.println(bmw.getName());

        Audi audi = new Audi("A6",6);
        System.out.println(audi.startEngine());
        System.out.println(audi.accelerate());
        System.out.println(audi.brake());
        System.out.println(audi.getName());


    }
}

/*
        // Room challenge
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

    // printer challenge
    Toner toner = new Toner(true,10);
    Printer printer = new Printer(toner,false);
        System.out.println("initial page count: " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(15);
        System.out.println("pages printed were: " + pagesPrinted + " and toner level is: " + printer.getToner().getTonerLevel());
        printer.getToner().addToner(50);
        pagesPrinted = printer.printPages(52);
        System.out.println("pages printed were: " + pagesPrinted + " and toner level is: " + printer.getToner().getTonerLevel());

    */
