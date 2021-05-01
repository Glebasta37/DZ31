package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ8 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i >=0; i++) {
            String n = reader.readLine();
            list.add(n);

            if (list.size() ==5) {
                                int min = list.get(0).length();
                String min2 = list.get(0);
                for (int j = 0; j < list.size(); j++) {
                    if (((list.get(j).length()) < min)) {
                        min = list.get(j).length();
                        min2 = list.get(j);
                                            }

                }
                System.out.println(min2);

                for (int j =0; j < list.size(); j++ ) {
                    if (list.get(j).length() == min && min2.equals(list.get(j))==false) {
                        System.out.println(list.get(j));
                    }
                }break;
            }}}}

