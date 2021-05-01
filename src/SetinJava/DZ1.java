package SetinJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i >=0; i++) {
            String n = reader.readLine();
            if (n.equals("")) break;
            list.add(n);
            }
        List<String> list2 = new ArrayList<>();
        for (int i =0; i < list.size(); i++) {

            if (list.get(i).length() % 2==0) {
                list2.add(list.get(i)+ " "+list.get(i));
            }

            else {
              list2.add(list.get(i)+" "+list.get(i)+ " "+ list.get(i));
            } }
for (String s : list2) {
    System.out.println(s);
}
    }}

