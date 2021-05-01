package DateLocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ5 {

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            String n = reader.readLine();
            list.add(n);

        }
        doble(list);

    }
    public static  void doble(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i)+ " " + list.get(i));
        }

    }
}