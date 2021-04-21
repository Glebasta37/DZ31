package leson02;

import java.util.SimpleTimeZone;

public class Main2 {
    public static void main(String[] args) {
        User user1 = new User(30, "Глеб", "Pass");
        System.out.println(user1.getage());
        user1.setName("sosat");
        System.out.println(user1.getName());

        User user2 = new User(24, "Tata");
        System.out.println(user2.getage());
        User user3 = new User();
        System.out.println(user3.getage());

    }

}
