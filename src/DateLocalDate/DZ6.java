package DateLocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
       List <Cat2> cats= new ArrayList<>();
        for ( int i = 0; i < cats.size()+1;i++) {
            String name = reader.readLine();
            if (name.equals(""))  break;
                int age = Integer.parseInt(reader.readLine());
                int ves = Integer.parseInt(reader.readLine());
                int dlina =  Integer.parseInt(reader.readLine());
            Cat2 cat = new Cat2(name,age,ves,dlina);
            cats.add(cat);}
        for (Cat2 s: cats) {
            System.out.println(s);








            }
        }



    }

