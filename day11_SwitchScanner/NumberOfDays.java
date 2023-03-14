package day11_SwitchScanner;

public class NumberOfDays {

    public static void main(String[] args) {

        int number=10;

        if (number>=1 && number<=12){//number:1~12
            switch (number){
                case 2:
                    System.out.println("28");
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30");
                    break;
                default://
                    System.out.println("31 days");
            }

        }else {
            System.out.println("Invalid NUmber");
        }
    }
}
