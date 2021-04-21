package leson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leson9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("vvedi imy");

        int age1 = Integer.parseInt(reader.readLine());
        int age2 = Integer.parseInt(reader.readLine());


        if (age1 < age2) {
            System.out.println(age1);
        } else {
            System.out.println("age2");
        }

    }
}