package day11_SwitchScanner;

public class Grade2 {

    public static void main(String[] args) {
        char grade='A';
        String result ="";

        switch (grade){

            case 'A': case 'B': case 'C': case 'D':
                result="Passed";
                break;
            default:
                result="Failed";
        }
        System.out.println(result);

    }
}
/*
if the grade is a,b,c,d====>"Passed"
otherwise===> "Failed"
 */