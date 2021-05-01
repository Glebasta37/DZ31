package EqualsandHashCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> arr = new HashMap<>();
        for (int i=0; i <5; i++) {
            String n = reader.readLine();
            String m = reader.readLine();
            arr.put(n,m);
        }
        System.out.println("введите имя ");
        String y = reader.readLine();
        name(arr,y);
        System.out.println("введите фамилию");
        String q = reader.readLine();
       lastname(arr,q);
    }

    public static void name(Map<String, String> arr, String name) {
        int t = 0;
        for (Map.Entry<String, String> entry : arr.entrySet()) {
            if (entry.getValue().equals(name)) {
                t +=1;
        }        }
        System.out.println(t);
        }
    public static void lastname(Map<String, String> arr, String lastname) {
        int o = 0;
        for (Map.Entry<String, String> entry : arr.entrySet()) {
            if (entry.getKey().equals(lastname)) {
                o +=1;
            }        }
        System.out.println(o);

    } }

