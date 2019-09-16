package course.javaprogramming;

public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction =  direction.toLowerCase();
    }

    public String getDirection() {
        return direction;
    }
}
