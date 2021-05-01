package MapinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DZ5 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> arr= new HashMap<>();
        for (int i=0; i<3; i++) {
            String n = reader.readLine();
            String m = reader.readLine();
            arr.put(n,m);
        }
        printmas(arr);
    }
    public static void printmas (HashMap<String, String> arr) {
        for (Map.Entry<String, String> entry : arr.entrySet()) {
            System.out.println(entry.getKey());
        }

        }

    }


