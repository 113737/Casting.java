package day01_JavaIntro;

import day24_CustomMethodReturn.ReturnMethodIntro;
import day24_CustomMethodReturn.ReturnMethodPractice4;

public class Test {

    public static void main(String[] args) {
        String str="aaaaaaaaaabbbbbbbbbbbbbbbb";
        ReturnMethodPractice4.removeDuplicates(str);
        System.out.println(str);

        String name="Java Programming";

        String reverseName= ReturnMethodIntro.reverse(name);

        System.out.println(reverseName);
    }





}
