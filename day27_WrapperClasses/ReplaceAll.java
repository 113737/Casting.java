package day27_WrapperClasses;

import java.util.Arrays;

public class ReplaceAll {
    public static void main(String[] args) {
        int[] arr = {10, 10, 20, 30, 40, 30, 30, 30};
        //            0   1   2   3   4   5   6   7

        arr = replaceAll(arr, 30, 300);

        System.out.println(Arrays.toString(arr));
    }
    public static int[]replaceAll(int[]array, int oldValue,int newValue){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==oldValue){
                array[i]=newValue;
            }
        }
        return array;
    }
}
