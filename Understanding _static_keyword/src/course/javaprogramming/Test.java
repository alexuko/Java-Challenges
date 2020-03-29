package course.javaprogramming;

public class Test {
    private final int myInt;

    public Test(int myInt) {
        this.myInt = myInt;
    }
    public Test(){
        this.myInt = 50;
    }

    public void getValue(){
        System.out.println("value is: "  +  myInt);
    }
}
