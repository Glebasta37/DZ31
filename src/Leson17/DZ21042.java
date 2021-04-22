package Leson17;

import java.util.Arrays;

public class DZ21042 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 5, 4, 7, 8,8, 9, 7,4,9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i];
            int n=0;
            for (int j = 0; j < arr.length; j++) {
                                              if (s!=arr[j]) {
                                                  n++;
                                              }
                                  if  (n==arr.length-1) {
                                   System.out.println(arr[i]);
                                  break;}

                                          }}}}





