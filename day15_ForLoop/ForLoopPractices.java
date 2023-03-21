package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        //15 16 17 18 ....45

       /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);

        */
        for(int i = 15;i<=45; i++ ){//i: 15 16 17 18 ....45
            System.out.println(i+"\n ");
        }
        System.out.println("hello");

        System.out.println("--------------------------------------");

        for(int i=100; i>=50;i--){
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.println("--------------------------------------");
        // print all the even numbers between 1 ~ 55:  2, 4, 6, 8... 54

        for(int i = 2; i <= 54; i += 2 ){ //i: 2, 4, 6, 8, 10... 54
            System.out.print(i +" ");
        }

        /*
        Print:
            A~Z
            a~z
            Z~A
            z~a
         */

    }
}
