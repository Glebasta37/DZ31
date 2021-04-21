package Leson15;

import java.util.Arrays;

public class MainLeson15 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];


      //for (int i = 0; i <arr.length; i++) {
         // for (int j=0; j <arr[i].length; j++){
           //     System.out.print(arr[i][j]);}
         //   System.out.println();


        int[] array = new int[10];


        for (int i = 0; i <array.length; i++) {
            array[i]=9-i;}

            Arrays.sort(array);
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

        }


}
