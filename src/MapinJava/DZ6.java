package MapinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class DZ6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map <String, String> arr = new HashMap<>();
        for (int i=0; i <3; i++){
        String n = reader.readLine();
        String m = reader.readLine();
        arr.put(n,m);}
        printznach(arr);
    }

    public static void printznach (Map <String, String> arr) {
        for (Map.Entry<String, String> entry : arr.entrySet()) {
            System.out.println(entry.getValue());
        }
    }
}
