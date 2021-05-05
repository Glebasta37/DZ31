package Compare;

import java.util.Comparator;

public class ComporatorSalaryDZ3 implements Comparator <UserDZ3> {
    @Override
    public int compare(UserDZ3 o1, UserDZ3 o2) {
        if (o1.getSalary()==o2.getSalary()) {
            return 0;

        }
        else if (o1.getSalary()<o2.getSalary()) {
            return -1;}
        else { return 1;}
    }
}

