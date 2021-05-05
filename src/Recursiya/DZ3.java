package Recursiya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List <String> vvod = new ArrayList<>();
        Map <String,Integer> vyvod =new HashMap<>();
        for (int i = 0; i<5;i++) {
            String p = reader.readLine();
            vvod.add(p);
        }
        for (int i =0; i<vvod.size(); i++) {
            String y = vvod.get(i);
            int u =0;
            for (int j =0; j<vvod.size();j++){

                if (y.equals(vvod.get(j))) {
                    u++;
                }

            } vyvod.put(vvod.get(i),u );


        }
        for (Map.Entry<String,Integer>  entry : vyvod.entrySet()) {
            System.out.println(entry);
        }
    }
}
