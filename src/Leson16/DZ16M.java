package Leson16;

public class DZ16M {
    public static void main(String[] args) {
        DZ16U babushka = new DZ16U("baba1",false,55);
        DZ16U bedushka1 = new DZ16U("bab2",false,56);
        DZ16U  ded= new DZ16U("ded1", true,67);
        DZ16U  ded1= new DZ16U("ded2", true,76);
        DZ16U mat = new DZ16U("mat",false ,21,ded,babushka);
        DZ16U otes = new DZ16U("papa",true,21,ded1,bedushka1);
        DZ16U reb1 = new DZ16U("reb1",false ,2,otes,mat);
        DZ16U reb2 = new DZ16U("papa",true,3,otes,mat);
        System.out.println(reb2.toString());
    }
}
