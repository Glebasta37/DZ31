package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i< list.size()+1;i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
            if (list.size() > 4) {
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
            }
        }


    }
}
