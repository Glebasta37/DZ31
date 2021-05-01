package Leson18;

public class Uzer2 {
    private String name;
    private String fam;
    private int age;
    public  Uzer2() {

    }

    public Uzer2(String  name, String fam, int  age ){
        this.name = name;
        this.fam = fam;
        this.age = age;
    }




    public void setName(String name) {this.name = name;}
    public void setFam(String fam) {this.fam = fam;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "my name is"+name+ fam + "I am" + age + "years old";
    }}

