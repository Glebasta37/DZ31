package Leson17;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("str");
        list.add("str");
        System.out.println(list);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        System.out.println(set);
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"str");
        System.out.println(map);
    }
}
