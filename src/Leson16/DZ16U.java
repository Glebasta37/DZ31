package Leson16;

public class DZ16U {
    String name;
    boolean pol;
    int age;
    DZ16U father;
    DZ16U mother;

    public DZ16U(String name, boolean pol, int age, DZ16U father, DZ16U mother) {
        this.name = name;
        this.pol = pol;
        this.age = age;
        this.father = father;
        this.mother = mother;
    }

    public DZ16U(String name, boolean pol, int age) {
        this.name = name;
        this.pol = pol;
        this.age = age;

    }

    @Override
    public String toString() {
        String text = "";
        text += this.name;
        if (this.pol == false) {
            text += "женщина";
        } else {
            text += "мужчина";
        }
        text += this.age;
        if (this.father.name == null) {
            text += "";
        } else {
            text += this.father.name;
        }
        if (this.mother.name == null) {
            text += "";
        } else {
            text += this.mother.name;
        }
return text;
    }}


