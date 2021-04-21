package Leson14;

public class Robot {
    private static String name;
    private int age;
    private int power;

    public Robot(String name, int age, int power) {
        this.name = name;
        this.age = age;
        this.power = power;

    }

    public String getname() {
        return this.name;
    }

    public int getage() {
        return this.age;
    }

    public int getpower() {
        return this.power;
    }

    public boolean fight(Robot r) {
      if (this.getpower()>r.getpower()) {
          System.out.println("победа 1");
          return true;}
      else System.out.println("Победа 2");
    return false;

      }

}





