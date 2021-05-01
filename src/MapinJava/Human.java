package MapinJava;

import java.util.ArrayList;

public class Human {
    private String name;
    private boolean pol;
    private int age;
    private ArrayList<Human>  deti;

    public Human(String name,boolean pol,int age,ArrayList<Human> deti) {
        this.name = name;
        this.age = age;
        this.pol = pol;
        this.deti = deti;}

        public Human(String name,boolean pol,int age ) {
            this.name = name;
            this.age = age;
            this.pol = pol;
            this.deti = deti;

    }

    @Override
    public String toString() {
        String text ="name" + this.name;
        if (this.pol=false) {
            text += "pol женщина";}
        else {text += "pol мужчина";
        }
        text+= "age" + this.age;
        if (this.deti == null) {

        }  else if  (this.deti.size()==1) {
            text += this.deti.get(0).name; }
            else if ( this.deti.size()>1) {
            for (int i = 0; i < this.deti.size(); i++) {
                text += this.deti.get(i).name;
            }
        }
            return text;


        }


    }

