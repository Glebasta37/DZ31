package MapinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("RAZMER");
        int n = Integer.parseInt(reader.readLine());
               min(arr(n));
    }
    public static List<Integer> arr(int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> array = new ArrayList<>();
        System.out.println("mass");
        for (int i = 0; i <= n; i++) {
            int t = Integer.parseInt(reader.readLine());
            array.add(t);}
                    return array; }


    public static  void  min(List <Integer> array) {
        int a =  array.get(1);
        for (int i =0; i<array.size(); i++) {
            if (a>array.get(i)) {
                a = array.get(i);

            }

        }
        System.out.println(a);




        }

}
