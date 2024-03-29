package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "ABCDE1234567890) (*&^%$#@!";
        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') { // if the character is between 'A' to 'Z' then it's letter
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {// if the character is between 'a' to 'z' then it's letter
                letters += ch;
            } else { // if the character is neither digit nor letter, then it's special character
                if (ch != ' ') { // if the special character is not a space
                    specialChars += ch;
                }
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }
}