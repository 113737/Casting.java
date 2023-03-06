package day03_EscapeSequences;// package name of the class

public class Println_VS_Print2 {

    public static void main(String[] args) {//main method

        System.out.println("Knock Knock");// first it prints knock knock, then it appends a new line
        System.out.println("Who is this?");

        System.out.println("This is Java");
        System.out.println("--------------------");
        System.out.print("Knock Knock");// prints knock knock, does not append new line
        System.out.print("Who is This?");
        System.out.println();
        System.out.println("-----------------");
        System.out.println("Hello everyone? How are you all today? Today we learn Escape Sequences, and next week we will learn Variables.");

        System.out.println("---------------------");
        System.out.print("Hello everyone? How are you all today?");
        System.out.print("Today we learn Escape Sequences, and next week we will learn Variables.");

    }// single line comment goes here


}
