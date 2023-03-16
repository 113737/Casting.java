package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber = input.next();

        input.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();


        System.out.println("Enter your state: ");
        String state = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.nextLine();

        input.close();




    }
}
/*
1.Enter your full name(nextLine)
2.Enter your building number (next())
3.Enter your Street name(nextLine)
4.Enter your city name(nextLİne)
5.Enter your state (next)
6.Enter your zip code(next)

Display the shipping address
 */