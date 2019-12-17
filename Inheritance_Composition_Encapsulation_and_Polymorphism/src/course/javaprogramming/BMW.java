package course.javaprogramming;

public class BMW extends Car{

    public BMW(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "BMW-- Start Engine";
    }

    @Override
    public String accelerate() {
        return "BMW-- accelerate";
    }

    @Override
    public String brake() {
        return "BMW-- brake";
    }
}