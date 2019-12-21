package course.javaprogramming;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobile {
    private ArrayList<Contact> contacts;
    private Scanner scanner = new Scanner(System.in);


    public Mobile() {
        this.contacts = new ArrayList<Contact>();
    }

    public Mobile(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void menu(){
        int option = 0;
        System.out.println("\nOptions Menu:\n");
        System.out.println("1 --> To view List of contacts");
        System.out.println("2 --> To add a new contact");
        System.out.println("3 --> To edit a contact");
        System.out.println("4 --> To search for a contact");
        System.out.println("5 --> To remove a contact");
        System.out.println("6 --> Quit");
        option = scanner.nextInt();

        switch (option){
            case 1:
                viewContacts();
                break;
            case 2:
                addContact();
                break;
            case 3:
                editContact();
                break;
            case 4:
                searchContact();
                break;
            case 5:
                removeContact();
                break;
            default:
                System.out.println("Not an option");
                break;
        }


    }


    private void viewContacts(){
        System.out.println("Contacts:\n");
        isContactListEmpty();
        for (int i = 0; i < contacts.size() ; i++) {
            System.out.println( i + 1 + ".- "+ contacts.get(i).getName() + ":  "+ contacts.get(i).getMobileNumber());
        }
        System.out.println("\n");
        returnOption();
        menu();

    }

    private void returnOption(){
        //return to menu
        System.out.println("Press 1 to come back to the menu");
        int selection = scanner.nextInt();
        while (selection != 1){
            System.out.println("Wrong option, Try Again");
            selection = scanner.nextInt();
        }
        menu();
    }
    private void addContact(){
        contacts.add(new Contact("ALEX", 1254845));
        contacts.add(new Contact("ROBERTO", 1254845));
        contacts.add(new Contact("TEST", 1254845));
        scanner.nextLine();
        System.out.println("Name:\t");
        String name = scanner.nextLine().toUpperCase();

        //not empty
        if(contacts.isEmpty() || !isInTheList(name)){
            System.out.println("Number:");
            int number = scanner.nextInt();
            contacts.add(new Contact(name,number));
            System.out.println("\nNew Contact added");
            returnOption();
            menu();
        }
        System.out.println("Contact already exist");
        returnOption();




    }
    private void editContact(){
        //search for the contact to be remove
        isContactListEmpty();


        scanner.nextLine();
        System.out.println("Contact's name to be edited");
        String name = scanner.nextLine().toUpperCase();
        doesContactExist(name);
        //
        int contactIndex = searchByIndex(name);
        String oldName = contacts.get(contactIndex).getName();
        int oldNumber = contacts.get(contactIndex).getMobileNumber();
        System.out.println("Name: "+ oldName + " Number: " + oldNumber);
        //get new values
        System.out.println("New name");
        String newName = scanner.nextLine().toUpperCase();
        System.out.println("New number");
        int newNumber = scanner.nextInt();

        //update contact
        contacts.get(contactIndex).setName(newName);
        contacts.get(contactIndex).setMobileNumber(newNumber);
        //display new values
        System.out.println("Contact was updated");
        returnOption();
    }

    private void isContactListEmpty() {
        if(contacts.isEmpty()){
            System.out.println("No Contacts to show");
            returnOption();
        }
    }

    private void removeContact(){
        //search for the contact to be remove
        isContactListEmpty();

        scanner.nextLine();
        System.out.println("Contact Name to be removed");
        String contactToRemove = scanner.nextLine().toUpperCase();

        doesContactExist(contactToRemove);

        int contactIndex = searchByIndex(contactToRemove);
        System.out.println(contactToRemove + " was removed from the list");
        contacts.remove(contactIndex);
        returnOption();

        //check if exist
        //remove contact
    }
    private void searchContact(){
        scanner.nextLine();
        isContactListEmpty();

        System.out.println("Find Contact\nName:\t");
        String nameToFind = scanner.nextLine().toUpperCase();
        doesContactExist(nameToFind);

        int contactIndex = searchByIndex(nameToFind);
        String myName = contacts.get(contactIndex).getName();
        int myNumber = contacts.get(contactIndex).getMobileNumber();
        System.out.println("Name: "+ myName + " Number: " + myNumber +"\n");
        returnOption();
    }

    private void doesContactExist(String nameToFind) {
        if(!isInTheList(nameToFind)){
            System.out.println("does not exist");
            returnOption();
        }

    }

    private int searchByIndex(String name){
        for (int i = 0; i < contacts.size() ; i++) {
            String currentName = contacts.get(i).getName();
            if(currentName.equals(name)){
                return i;
            }
        }
        return -1;
    }

    private boolean isInTheList(String seekName){
        for (int i = 0; i < contacts.size() ; i++) {
            String currentName = contacts.get(i).getName();
            if( currentName == seekName || currentName.equals(seekName)){

                return true;
            }

        }
        //name not found
    return false;
    }

}
