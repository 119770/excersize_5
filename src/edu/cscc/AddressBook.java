package edu.cscc;
import java.util.*;

// Gaige Wycuff, Killoran, Java

public class AddressBook {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        ContactInformation person1 = new ContactInformation("Gaige", "119770@swcsd.us");
        ContactInformation person2 = new ContactInformation("Sagar", "083401@swcsd.us");

        Map<String, String> address = new HashMap<>();

        address.put(person1.getName(), person1.getEmail());
        address.put(person2.getName(), person2.getEmail());
        System.out.println(address);

        searchFor(address);

    }

    public static void searchFor(Map<String, String> a) {

        while(true) {

            System.out.println("Who would you like to search for: ");
            String name = input.nextLine();

            if(name.equalsIgnoreCase("end")) {
                break;
            }
            a.get(name);

            System.out.println("The email of the contact is " + a.get(name));
            
        }
    }
}
