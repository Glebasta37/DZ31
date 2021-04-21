package Leson16;

public class User extends Object {
    private String name;
    private int age;
    public User( String  name, int age ){
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString() {
        return "my name is"+name+ "I am" + age + "years old";
    }}

