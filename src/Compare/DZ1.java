package Compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DZ1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String n = reader.readLine();
            list.add(n);


        }
        String alf = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] alfovit = alf.toCharArray();
        for (int i = 0; i < list.size(); i++) {
            char[] ttt = list.get(i).toCharArray();
            for (int j = 0; j < ttt.length; j++) {
                list2.add(ttt[j]);
            }
        }
        for (int i = 0; i < alfovit.length; i++) {
            int u = 0;
            for (int j = 0; j < list2.size(); j++) {
                if (alfovit[i] == list2.get(j)) {
                    u++;
                }
            }
            if (u > 0) {
                System.out.println(alfovit[i] + " kolvo" + u);
            }

        }
    }}










