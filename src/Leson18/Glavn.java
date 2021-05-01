package Leson18;

import java.util.ArrayList;
import java.util.List;

public class Glavn {
    public static void main(String[] args) {
//        List<User> list = new ArrayList<>();
//        Primer1 <User> primer1 = new Primer1<>();
//        System.out.println(primer1.get());
//        primer1.set(new User("tat",25));
//        System.out.println(primer1.get());
//        System.out.println("------------------------------");
//        Primer1p2<Uzer2> list2 = new Primer1p2<>();
//        System.out.println(list2.get());
//        list2.set(new Uzer2("nfn","lala",45));
//        System.out.println(list2.get());
//




//   Primer2.simpleInit(new User());
    Primer2 <Uzer2> primer2 = Primer2.init(new Uzer2());
    primer2.set(new Uzer2("tata","lala", 35));
        System.out.println(primer2.get());
        System.out.println("-----");



}
}