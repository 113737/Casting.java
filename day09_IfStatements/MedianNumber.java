package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;

        boolean aCouldBeMedianNumber =(b<a && a<c)||(c<a && a<b);
        boolean bCouldBeMedianNumber =(c<b && b<a)||(a<b && b<c);
        boolean cCouldBeMedianNumber =(b<c && c<a)||(a<c && c<b);// !aCouldBeMedianNumber && bCouldBeMedianNumber

        if(aCouldBeMedianNumber){
            System.out.println(a + " is the median number.");
        }
        if(bCouldBeMedianNumber){
            System.out.println(b + " is the median number");
        }
        if(cCouldBeMedianNumber){
            System.out.println(c + " is the median number");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */