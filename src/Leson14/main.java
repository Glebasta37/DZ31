package Leson14;

import leson02.User;

public class main {


    public static void main(String[] args) {
        Women women1 = new Women("Erer", 30);
       // System.out.println(women1.getage());
       // System.out.println(women1.getname());

        Cat cat1 = new Cat("baba", 30,women1);
        System.out.println(cat1.getage());
        System.out.println(cat1.getname());
        System.out.println(cat1.getowner());

        Dog dog1 = new Dog("brer", 24, women1);
        System.out.println(dog1.getage());
        System.out.println(dog1.getname());
        System.out.println(dog1.getowner());
    }
}
