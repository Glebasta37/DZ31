package DateLocalDate;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DZ1 {
    public static void main(String[] args) {
        System.out.println(getTimeOfGet(fill(new ArrayList())));
        System.out.println(getTimeOfGet(fill(new LinkedList())));
    }
    private static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }return list;
    }

    public static long getTimeOfGet (List list) {
        Date startTime = new Date();
        get10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return fin;

    }
    public static void get10000(List list) {
                    for (int i =0; i <10000;i++) {
            list.remove(0);

    }
}}

