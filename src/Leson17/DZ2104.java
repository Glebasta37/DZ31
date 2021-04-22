package Leson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DZ2104 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int [] arr = new int [n-1];
        for (int i = 0; i <arr.length; i++) {
            int t = Integer.parseInt(reader.readLine());
            arr[i]=t;}
            Arrays.sort(arr);
                for (int i = 0; i <arr.length; i++) {
                    System.out.print(arr[i]);}
                for (int i = 0; i <arr.length-1; i++) {
                    System.out.println();
            if (arr[i+1]-arr[i] != 1) {
                int y = arr[i+1] -1;
                System.out.println(y);

            } else System.out.println(arr[arr.length-1]+1);

            {


        }}

    }
}
