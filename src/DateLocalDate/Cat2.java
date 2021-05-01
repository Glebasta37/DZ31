package DateLocalDate;

public class Cat2 {
    private String name;
    private int age;
    private int ves;
    private int dlina;
    public  Cat2() {

    }

    public Cat2(String  name, int age, int   ves, int dlina ){
        this.name = name;
        this.age = age;
        this.ves = ves;
        this.dlina = dlina;
    }




//    public void setName(String name) {this.name = name;}
//    public void setAge(int age) {this.age = age;}
//    public void setVes(int ves) {this.ves = ves;}
//    public void setDlina(int dlina) {this.dlina = dlina;}


    @Override
    public String toString() {
        return "Cat name is"+name+"age is" +age + "ves is" + ves + "dlina"+dlina;
    }}

