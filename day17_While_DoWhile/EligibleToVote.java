package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);


        System.out.println("Enter your age");
        int age = scr.nextInt();

        while (!(age>=1 && age<=120)) {
            System.err.println("Invalid entry, Please re-enter.");
            System.err.println("Enter your age: ");
            age = scr.nextInt();
        }
            System.out.println("Are you a US citizen? yes/ no");
            String answer= scr.next().toLowerCase();

            while (!(answer.equals("yes")||answer.equals("no"))){
                System.err.println("Invalid entry, please re-enter");
                System.err.println("Are you US citizen?ye/no");
                answer=scr.next().toLowerCase().toLowerCase();
            }
            if( age>=18 &&answer.equals("yes")){
                System.out.println("You are eligible to vote.");
            }else{
                System.out.println("you are not eligible to vote");
            }
        }

    }

