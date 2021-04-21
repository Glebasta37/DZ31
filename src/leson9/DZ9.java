package leson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DZ9 {
    public static void main(String[] args) throws IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("vvedite 3 chisla");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        compare(a,b);

    }

       public static void compare (int a, int b) {
int t =Math.abs(5-a);
int y = Math.abs(5-b);

           if (a<b && t<y) {

               System.out.println( a );}

           else if (a>b && t > y) {
               System.out.println(b);}

           else if (a>b && t < y) {
               System.out.println(a);}
           else if (a<b && t > y) {
               System.out.println(b);}
           else if (a == b) {
               System.out.println("sosisuka");}


            }
        }




