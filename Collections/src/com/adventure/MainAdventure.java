package com.adventure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainAdventure {

    private static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        locations.put(5,new Location(5,"You are at road "));
        locations.put(8,new Location(8,"You are at the Forest "));
        locations.put(4,new Location(4,"You are at the Hill "));
        locations.put(6,new Location(6,"You are at the Building "));
        locations.put(2,new Location(2,"You are at the Valley "));
        locations.put(0,new Location(0,"Exit "));

        locations.get(5).addExit("N",8);
        locations.get(5).addExit("S",2);
        locations.get(5).addExit("E",6);
        locations.get(5).addExit("W",4);


        locations.get(8).addExit("S",5);
        locations.get(8).addExit("W",4);


        locations.get(4).addExit("N",8);

        locations.get(2).addExit("W",4);
        locations.get(2).addExit("N",5);

        locations.get(6).addExit("W",5);

        Map<String, String> vocabulary = new HashMap<>();
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("QUIT", "Q");


        int loc = 5;
        while (true){
            System.out.println(locations.get(loc).getDescription());
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
