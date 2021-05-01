package SetinJava;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public class DZ6 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        int a = now.getDayOfYear();
        System.out.println(a);

    }
}
