package me.dougmoreira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // DUMMY DATA FOR TESTING
        //  Email em1 = new Email("Douglas", "Moreira");

//      creating user dynamically
            String firstName;
            String lastName;
        //      Getting first Name
        System.out.print("First Name: ");
        Scanner in = new Scanner(System.in);
        firstName = ((in.next()));
        //        Getting Last Name
        System.out.print("Last Name: ");
        Scanner l = new Scanner(System.in);
        lastName = (l.next());

        Email em1 = new Email(firstName, lastName);
        System.out.println(em1.showInfo());
    }
}
