package Compare;

import java.util.Comparator;

public class Comporator1DZ3 implements Comparator <UserDZ3> {
    @Override
    public int compare(UserDZ3 o1, UserDZ3 o2) {
        if (o1.getAge()==o2.getAge()) {
            return 0;

        }
        else if (o1.getAge()<o2.getAge()) {
            return -1;}
else { return 1;}
        }
    }

