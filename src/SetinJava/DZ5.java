package SetinJava;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;

public class DZ5 {
    public static void main(String[] args) {
        Date now = new Date();
     int c = now.getHours();
        int b = now.getMinutes();
        int d = now.getSeconds();
        System.out.println(c);
        System.out.println(b);
        System.out.println(d);
    }
}
