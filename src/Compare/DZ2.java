package Compare;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class DZ2 {
    public static void main(String[] args) {
        Robot robot1 = new Robot(35,"aaa");
        Robot robot2 = new Robot(7,"ttt");
        Robot robot3 = new Robot(8,"ccc");
        Robot robot4 = new Robot(35,"aaa");

        Map<Robot, String> map = new TreeMap<>();
        map.put(robot1, "1");
        map.put(robot2, "2");
        map.put(robot3, "3");
        map.put(robot4, "4");
                for (Map.Entry<Robot, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

    }

}
