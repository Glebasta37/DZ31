package MapinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DZ7 {
    public static void main(String[] args) throws IOException {
        Set <Integer> arr = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i<5; i++) {
            int n = Integer.parseInt(reader.readLine());
            arr.add(n);
        }
        rem(arr);
    }
    public static void rem (Set <Integer> arr) {
        Iterator <Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            if (s >10) {
                iterator.remove();}
            else {
                System.out.println(s);

        }}
    }
}
