package SetinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
        }
        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));

    }}