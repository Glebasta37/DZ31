package Leson14;

public class Cat {
    private String name;
    private int age;
    private Women owner;

    public Cat(String name, int age, Women owner) {
        this.name = name;
        this.age = age;
        this.owner= owner;
    }

    public String getname() {

        return this.name;
    }

    public int getage() {
        return this.age; }
        public Women getowner () {
            return this.owner;
        }
    }