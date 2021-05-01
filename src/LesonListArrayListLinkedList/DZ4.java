package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < list.size() + 1; i++) {
            int n = Integer.parseInt(reader.readLine());
            if (n % 2 != 0) {
                list.add(0,n);
            } else {
                list.add(n);
            }
            if (list.size() > 7) {

                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));
                }
            }
        }
    }}

