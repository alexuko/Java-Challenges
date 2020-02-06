package course.javaprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Player alex = new Player("Alex", 50, 100);
        System.out.println(alex.toString());

        saveObject(alex);
        alex.setHitPoints(40);
        System.out.println(alex);
        alex.setWeapon("ak-47");
        alex.setStrength(100);
        saveObject(alex);
        loadObject(alex);
        System.out.println(alex);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Options:\n1.- Enter a String\n2.-Quit");

        while (!quit) {
            System.out.println("Choose and option:");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Enter a String");
                    String myString = sc.nextLine();
                    values.add(index, myString);
                    index++;
                    break;
                case 2:
                    quit = true;
                    break;
                default:
                    break;
            }//end of switch
        }//end of while loop
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");

        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}