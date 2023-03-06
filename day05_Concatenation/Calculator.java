package day05_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber= 50;
        //100+50=150

        //100-50= 50

        //100*50= 5000
        double total = firstNumber + secondNumber;
        System.out.println("total = " + total);
        double extraction = firstNumber - secondNumber;
        System.out.println("extraction = " + extraction);
        double impact = firstNumber * secondNumber;
        System.out.println("impact = " + impact);

    }
}
