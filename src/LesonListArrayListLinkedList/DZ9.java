package LesonListArrayListLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ9 {
    public static void main(String[] args) throws IOException {
        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();
        for (int i = 0; i>=0;i++) {
            int n = Integer.parseInt(reader.readLine());
            list.add(n);
            if (list.size() == 6) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j)%2==0 && list.get(j)%3==0){
                        list2.add(list.get(j));
                        list3.add(list.get(j));
                    }

                    else if (list.get(j) % 2 == 0) {
                                                list2.add(list.get(j));
                    } else if (list.get(j) % 3 == 0) {
                        list3.add(list.get(j));
                    } else {
                        list4.add(list.get(j));
                    }

                }break;
            }}




        println(list2);
        println(list3);
        println(list4);
    }



public static void println ( List T) {
        for (int i = 0; i<T.size(); i++) {
            System.out.print(T.get(i));

        }
    System.out.println();
}

}










