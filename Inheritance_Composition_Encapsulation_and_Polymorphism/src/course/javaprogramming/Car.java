package course.javaprogramming;

public class Car{
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine(){
        return "Car-- Start Engine";
    }
    public String accelerate(){
        return "Car-- accelerate";
    }
    public String brake(){
        return "Car-- brake";
    }
}
