package Leson14;

public class DZ14 {
    public static void main(String[] args) {
        Robot robot1 = new Robot("Sasa", 14, 17);
        System.out.println(robot1.getname());
        System.out.println(robot1.getage());
        System.out.println(robot1.getpower());

        Robot robot2 = new Robot("tata", 16, 16);
        System.out.println(robot2.getname());
        System.out.println(robot2.getage());
        System.out.println(robot2.getpower());

        robot1.fight(robot2);


    }


        }

