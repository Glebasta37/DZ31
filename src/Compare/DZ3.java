package Compare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DZ3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Comparator <UserDZ3> usersos = new Comporator1DZ3();
        Comparator <UserDZ3> usersos3 = new ComporatorSalaryDZ3();
        Comparator <UserDZ3> usersos2 = new ComporatorName();
        Map<UserDZ3, String> map = new HashMap<>();
                Set<UserDZ3> set1 = new TreeSet<>(usersos3);
        Set<UserDZ3> set2 = new TreeSet<>(usersos);
        Set<UserDZ3> set3 = new TreeSet<>(usersos2);
        List <UserDZ3> test = new ArrayList<>();


        for (int i =0; i<5; i++) {
            System.out.println("vvedite object");

            int n = Integer.parseInt(reader.readLine());
            String m = reader.readLine();
            int p = Integer.parseInt(reader.readLine());
            test.add(new UserDZ3(n, m, p));
            System.out.println("vvedite dolshnoct");
            String t = reader.readLine();
            map.put(test.get(i), t);
        }

        Iterator <Map.Entry<UserDZ3,String>> iter = map.entrySet().iterator();
        for ( Map.Entry<UserDZ3, String> entry : map.entrySet()) {
            if (entry.getValue().equals("Boss")) {
                set1.add(entry.getKey());

                                 }
                else if ((entry.getValue().equals("worker"))) {
                    set2.add(entry.getKey());

            }
                else {
                    set3.add(entry.getKey());

            }
        }
        System.out.println("mass1");
for (UserDZ3 s: set1) {
    System.out.println(s);
}
        System.out.println("mass2");
        for (UserDZ3 s: set2) {
            System.out.println(s);
        }
        System.out.println("mass3");
        for (UserDZ3 s: set3) {
            System.out.println(s);
        }


        }
    }

