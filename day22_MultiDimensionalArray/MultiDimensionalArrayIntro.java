package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {
        String[] group1={"Jon","Joes","James"};
        String[] group2={"Jon","Joes","James"};
        String[] group3={"Jon","Joes","James"};

        String[][]groups= new String[3][];

        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.toString(groups));

        System.out.println(Arrays.deepToString(groups));

        System.out.println("--------------------------------");

          /*
            {1,2,3}
            {4,5,6,7}
            {8,9,10,11,12}
         */
//index of the elements:0 1 2   0 1 2 3   0 1 2 3 4     01
        int [][]arr2D={{1,2,3},{4,5,6,7},{8,9,1,11,12},{13}};
//index of arrays:       0       1             2         3
        System.out.println(Arrays.deepToString(arr2D));

        //{4,5,6,7}
        System.out.println(Arrays.toString(arr2D[1]));
        //11
        System.out.println(arr2D[2][3]);








    }


}
/*
String[] group1={"Jon","Joes","James"}
String[] group2={"Jon","Joes","James"}
String[] group3={"Jon","Joes","James"}
 */
