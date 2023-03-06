package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

     String firstName = " Kubra";
     String lastName = "Taskin";
     String fullName = firstName + " " + lastName;

     //The address is Ankara in Turkey.

        System.out.println("fullName of the person is "+  fullName);
        int age = 36;
        String jobTitle = "SDET";
        String companyName = "CYDEO";

        String address = "Ankara In Turkey";

        System.out.println("She lives in " + address);
// .... is years old.
        System.out.println(fullName + " is " + age + " years old.");
        //fullName is jobTitle, works at +CompanyName

        System.out.println(fullName + " is "+ jobTitle  + " works at " + companyName );


    }
}
 /*
        1. Create a class called FullName.java
2. Declare the following variables:
1. firstName
2. lastName
3. Use concatenation to print the full address
         */