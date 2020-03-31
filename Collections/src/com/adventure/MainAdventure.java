package com.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainAdventure {

    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Integer> temp = new HashMap<>();
        locations.put(0,new Location(0,"Exit ", null ));

        temp = new HashMap<>();
        temp.put("N",8);
        temp.put("S",2);
        temp.put("E",6);
        temp.put("W",4);
        locations.put(5,new Location(5,"You are at road ", temp ));

        temp = new HashMap<>();
        temp.put("S",5);
        temp.put("W",4);
        locations.put(8,new Location(8,"You are at the Forest ", temp ));

        temp = new HashMap<>();
        temp.put("N",8);
        locations.put(4,new Location(4,"You are at the Hill ", temp ));

        temp = new HashMap<>();
        temp.put("W",4);
        temp.put("N",5);
        locations.put(2,new Location(2,"You are at the Valley ", temp ));

        temp = new HashMap<>();
        temp.put("W",5);
        locations.put(6,new Location(6,"You are at the Building ", temp ));

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("QUIT", "Q");


        int loc = 5;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            temp.remove("S");
            if(loc == 0) {
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are: ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = sc.nextLine().toUpperCase();
            if (direction.length() > 1){
                //split input into array of words
                String[] words = direction.split(" ");
                for (String word : words) {
                    //check if vocabulary contains the word
                    if (vocabulary.containsKey(word)){
                        direction = vocabulary.get(word);
                        break;
                    }
                }
            }


            if(exits.containsKey(direction)){
                loc = exits.get(direction);
            }else {
                System.out.println("You cannot go in that direction");
            }


        }



    }
}
