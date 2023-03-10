package day10_NestedIf;

public class GrapeReport2 {
    public static void main(String[] args) {


        int s = 135; //s

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if (s >= 90) { //false:  s < 90
                System.out.println("Excellent");
            } else if (s >= 80) { // false: s < 80
                System.out.println("Great");
            } else if (s >= 70) { // false: s < 70
                System.out.println("Good");
            } else if (s >= 60) {// false: s < 60
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }

        } else { // if the s is NOT valid
            System.out.println("Invalid Score");
        }

        System.out.println("-------------------------------------------");


    }
}
