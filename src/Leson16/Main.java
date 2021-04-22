package Leson16;

import Leson18.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("тата", 15);
        System.out.println(user1.toString());
        User user2 = new User("yfnf",16);
        System.out.println(user2.toString());
        System.out.println(user1.equals(user2));
    }
}
