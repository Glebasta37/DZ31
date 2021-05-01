package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int i = 0; i <=list.size()+1;i++) {
            int n = Integer.parseInt(reader.readLine());
                            list.add(n);
        if (list.size()==10){

                               for (int j = 0; j < list.size(); j++) {
                                   if (list.get(j) % 2 == 0) {
                                       list2.add(list.get(j));} else {
                                       list3.add(list.get(j));
                                   }
                               }




                for (int j = 0; j < list2.size(); j++) {
                    System.out.print(list2.get(j)+" ");}
        System.out.println();
        for (int j = 0; j < list3.size(); j++) {
            System.out.print(list3.get(j)+" ");

                }
            }}}}