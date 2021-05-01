package DateLocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i =0; i <=5; i++ ) {
            String n = reader.readLine();
            list.add(n);

        }


       list.add(0,list.get(list.size()-1));
        list.remove(list.size()-1);
    for (String s: list) {
        System.out.println(s);
    }
    }}
