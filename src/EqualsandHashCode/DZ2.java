package EqualsandHashCode;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DZ2 {
    public static void main(String[] args) {
        Map < String, Date> arr = new HashMap<>();
        arr.put("Jhon", new Date("JUNE 1 1980"));
        arr.put("Mark", new Date("JUNE 5 1999"));
        arr.put("Elone", new Date("DECEMBER 13 1996"));
        arr.put("Stieve", new Date("JUNE 1 1980"));
        arr.put("Clark", new Date("MARCH 1 1980"));
        Iterator <Map.Entry<String, Date> >iter = arr.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Date> entry = iter.next();
            Date t = entry.getValue();
            int u = t.getMonth();

            if ( u==5 || u == 6 || u==7) {
                iter.remove();
            } else {
           System.out.println(entry); }

        }

    }
}
