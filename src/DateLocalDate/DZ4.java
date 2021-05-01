package DateLocalDate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ4 {
    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            List<String> list = new ArrayList<>();
            for (int i = 0; i <= 2; i++) {
                String n = reader.readLine();
                list.add(n);

            } fix(list);
    }
    public static  void fix(List list) {



        for (int i =0; i < list.size(); i++) {
            String n = (String) list.get(i);

            if (n.indexOf("л")>=0 && n.indexOf("р")>=0) {
                System.out.println(list.get(i));

            }
            else if ((n.indexOf("л")>=0)) {
                System.out.println(list.get(i));
                System.out.println(list.get(i));
            }
else if ((n.indexOf("р")>=0)) {
    list.remove(i);}
    else {
                System.out.println(list.get(i));

            }

            }


    }

}