package Compare;

import java.util.Comparator;

public class ComporatorName implements Comparator <UserDZ3> {

    @Override
    public int compare(UserDZ3 o1, UserDZ3 o2) {


            return o1.getName().compareTo(o2.getName());
    }
}

