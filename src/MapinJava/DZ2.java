package MapinJava;

import java.util.ArrayList;
import java.util.List;

public class DZ2 {
    public static void main(String[] args) {
        Human son = new Human("son Pavel",true,5);
        Human son1 = new Human("son Saha",true,6);
        Human son3 = new Human("son oleg",true,7);
         ArrayList <Human> maldet = new ArrayList<>();
        maldet.add(son);
        maldet.add(son1);
        maldet.add(son3);
        Human mama = new Human("son Taha",false,35,maldet);
        Human papa = new Human("son Bo",true,35,maldet);
        ArrayList <Human> strdet1 = new ArrayList<>();
        strdet1.add(mama);
        ArrayList <Human> strdet2 = new ArrayList<>();
        strdet2.add(papa);

        Human ded1 = new Human("son Taha",true,65,strdet1);
        Human bab1 = new Human("son Bo",false,64,strdet1);
        Human ded2 = new Human("son Taha",true,67,strdet2);
        Human baba2 = new Human("son Bo",false,69,strdet2);
        System.out.println(son.toString());
    }
}
