package DateLocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i =0; i <=5; i++ ) {
            String n = reader.readLine();
            list.add(n);
        }

        list.remove(2);
        for (int i = list.size()-1; i >=0;i--) {
            System.out.println(list.get(i));
        }

        }
}
