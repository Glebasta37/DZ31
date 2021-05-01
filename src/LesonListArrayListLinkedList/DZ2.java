package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ2 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i< list.size()+1;i++) {
           String n = reader.readLine();
            list.add(n);

            if (list.size() > 4) {
                System.out.println(list.size());
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
            }
        }
    }
}
