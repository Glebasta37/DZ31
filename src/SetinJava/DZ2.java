package SetinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i =0; i <=4; i++ ) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
    }
        for (int i = list.size()-1; i>=0; i--) {
            System.out.println(list.get(i));
        }
}}
