package day08_IfStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int number= 5;
        boolean month28Days=number ==2;
        boolean month30Days=number== 4||number==6||number==9||number==11;
        boolean month31Days=number==1||number==3||number==5||number==7|number==8||number==10||number==12;
        if(month28Days){
            System.out.println("28 Days");
        }
        if(month30Days){
            System.out.println("30 Days");
        }
        if(month31Days){
            System.out.println(" 31 Days");
        }

    }}

/*
3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */