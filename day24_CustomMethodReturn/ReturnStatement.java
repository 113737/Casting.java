package day24_CustomMethodReturn;

public class ReturnStatement {
    public static void main(String[] args) {
        nameOfDay(11);
    }
    
    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        if (number<1 || number>7){
            System.out.println("Invalid");
            return;
        }
        if (number==1){
            System.out.println("Monday");
        } else if (number==2) {
            System.out.println("Tuesday");
        }else if(number == 3){
            System.out.println("Wednesday");
        }else if(number == 4){
            System.out.println("Thursday");
        }else if(number == 5){
            System.out.println("Friday");
        }else if(number == 6){
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }




    }
}
