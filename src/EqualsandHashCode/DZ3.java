package EqualsandHashCode;

import java.util.*;

public class DZ3 {
    public static void main(String[] args){
        List <String> res = new ArrayList<>();
        Map <String, String> map = new HashMap<>();
        map.put("Rooney", "Leo");
        map.put("Lloris", "Hugo");
        map.put("Messi", "Leo");
        map.put("Ronaldo", "Cristiano");
        map.put("Maldini", "Paolo");
        map.put("Indzaghi", "Pipo");
        map.put("Del Piero", "Alesandro");
        map.put("Balotelli", "Mario");
        map.put("Gotze", "Mario");
        map.put("Gomez", "Mario");
        Iterator<Map.Entry<String, String> > iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            String u = entry.getValue();
                        int i = 0;
            for ( Map.Entry<String, String> entry1: map.entrySet() ) {
                String t = entry1.getValue();
                if (u.equals(t)) {
                    i++;
                }

               }
            if (i>1) {
                                res.add(entry.getValue());
                iter.remove();

                }}

        huy(map,res);
    }




                public static void huy(Map <String, String> map, List <String> res) {

                    Iterator<Map.Entry<String, String> > iteren = map.entrySet().iterator();
                    while (iteren.hasNext()) {
                        Map.Entry<String, String> entry = iteren.next();
                        Iterator <String> iterator = res.iterator();
                        int i=0;
                                while (iterator.hasNext()) {
                                    String elem = iterator.next();
                            if (entry.getValue().equals(elem)) {
                                i++;
                            }
                            }
                         if (i>0)
                             iteren.remove();
                         else {
                             System.out.println(entry);
                         }





                }}}






