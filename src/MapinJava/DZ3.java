package MapinJava;

import Leson18.BaseObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
        int n = Integer.parseInt(reader.readLine());
        arr.add(n);
    }
       Collections.sort(arr);
        for (int i =5; i < arr.size(); i++) {
            System.out.print(" "+arr.get(i));
        }



    }
}
