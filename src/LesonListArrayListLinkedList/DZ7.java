package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < list.size() + 1; i++) {
            String n = reader.readLine();
            list.add(n);

        if (list.size() ==5) {
            int max = 0;
            String max2 = "";
        for (int j = 0; j < list.size(); j++) {


            if (((list.get(j).length()) > max)) {
                max = list.get(j).length();
                max2 = list.get(j);

            }

        }
        System.out.println(max2);
        for (int j =0; i < list.size(); j++ ) {
            if (list.get(j).length() == max && max2.equals(list.get(j))==false) {
                System.out.println(list.get(j));
            }
        }
    }}}}
