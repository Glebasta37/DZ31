package SetinJava;

import DateLocalDate.Cat2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        List<String> list= new ArrayList<>();
        for ( int i = 0; i < list.size()+1;i++) {
            String n = reader.readLine();
            if (n.equals("end"))  break;
    list.add(n);

    } for ( String s : list) {
            System.out.println(s);
        }
}}
