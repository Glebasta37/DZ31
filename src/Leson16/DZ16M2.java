package Leson16;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;

public class DZ16M2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

num2(array());


    }

    public static int [] array() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
           int n = Integer.parseInt(reader.readLine());
                       arr[i] = n;
        }
        return arr;

    }
        public static void  num (int [] arr) {
    int [] num = new int [arr.length/2];
            for (int i = 0; i < arr.length/2;i++) {
                num[i] = arr[i];
                int got = num[i];
            }}

    public static void  num2 (int [] arr) {
        int [] num2 = new int [arr.length];
        for (int i = arr.length/2 ; i < arr.length;i++) {
            num2[i] = arr[i];
            int res = num2[i];
            System.out.println(res);
           ;}}}











