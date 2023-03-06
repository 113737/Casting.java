package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {
        System.out.println(10+20);//30 Addition
        System.out.println(100-50);//50 Subtraction
        System.out.println("12"+1);//121
        System.out.println(10*6);//60 multiplication
        System.out.println(100/3);//33
        System.out.println(10.0/4);//2.5

        int a = 100;
        double b = a/6; // 16.0
        System.out.println(b);

        double c = a/6d; //16.66666 d or .0 or write (double) a/6
        System.out.println(c);

        System.out.println(100D);


    }
}
/*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division

            integer / integer ===> integer
            decimal / integer ===> decimal
            integer / decimal ===> decimal
            decimal / decimal ===> decimal
        in math:
            10/4 = 2.5
        in java:
            10/4 = 2
            10.5/4= 2.5
    %: Remainder

 */