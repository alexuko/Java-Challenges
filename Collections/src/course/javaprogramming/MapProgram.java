package course.javaprogramming;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<Integer,String> lectures = new HashMap<>();
        lectures.put(1,"Maths");
        lectures.put(2,"Java");
        lectures.put(3,"Python");
        lectures.put(4,"Hacking");
        lectures.put(4,"Hacking 2");

        System.out.println(lectures.get(4));
        System.out.println(lectures.containsKey(0));

        System.out.println("========================");
        lectures.remove(2, "Java");
        lectures.remove(" ");
        for (int key : lectures.keySet()) {
            System.out.println(key + ": " + lectures.get(key));

        }
    }
}
