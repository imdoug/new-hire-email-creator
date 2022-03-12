package me.dougmoreira;

import java.util.Locale;
import java.util.Scanner;

public class Email {

//    VARIABLES
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;
    private int DefaultpasswordLength = 10;
    private String companySufix = "dmconsulting.com";

    //    METHODS

    //    Constructor to receive the first and last name

    public Email(String firstName, String lastName){
//        this keyword refers to the class variable
        this.firstName = firstName;
        this.lastName = lastName;
//        CALL METHOD TO ASK FOR THE DEPARTMENT - RETURN THE DEPARTMENT
        this.department = setDepartment();
//        CALL METHODTHAT RETURNS A RANDOM PASSWORD
        this.password = randomPassword(DefaultpasswordLength);
        System.out.println("Your password is: " + this.password);
//        COMBINE ELEMENTS TO GENERATE EMAIL
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySufix;

    }

    //    Ask for department
    private String setDepartment(){
        System.out.print("New worker: " + firstName + "." + "\nEnter the department code: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for None \n Enter Department code :");
        Scanner in = new Scanner(System.in);
        int deparmentChoice = in.nextInt();
        if(deparmentChoice == 1) { return "sales"; }
        else if(deparmentChoice == 2) { return "dev"; }
        else if(deparmentChoice == 3) { return "acct"; }
        else { return ""; }
    }

    //    generate random password
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVXWYZ1023456789!@#$%&";
        char[] password = new char[length];
        for(int i=0; i < length; i++){
            int randomValue = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(randomValue);
        }
        return new String(password);
    }

    //    set the mailbox capacity
    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }

    //    set alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;
    }

    //    Change the  password
    public void changedPassword(String password){
        this.password = password;
    }
//    GET METHODS
    public int getMailBoxCapacity() { return mailBoxCapacity; }
    public String getAlternateEmail() { return alternateEmail;}
    public String getPassword() { return password; }

    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " +  lastName +
                "\nCOMPANY EMAIL " + email +
                "\nMAILBOX CAPACITY " + mailBoxCapacity + "mb";
    }

}
