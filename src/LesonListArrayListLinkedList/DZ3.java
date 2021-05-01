package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        List <Integer> list = new ArrayList<>();
        for (int i = 0; i< list.size()+1;i++) {
            String n =reader.readLine();

            if (n.equals("")) {
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(list.get(j));}}
                else {
                    list.add(Integer.parseInt(n));}


                }
            }
        }



