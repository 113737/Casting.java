package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1="acdb";
        String str2="dbca";

        //write a program that can check if str1&str2 are build out same characters

        char[]chars=str1.toCharArray();

        char[]chars2=str2.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        boolean anagram= Arrays.equals(chars,chars2);
        System.out.println("anagram= "+anagram);








    }
}
