package leson02;

public class User {
    private  int age;
    private String name;
    private String pass;
    public User (int age, String name, String pass) {
        this.age = age;
        this.name = name;
        this.pass = pass; }

    public User (int age, String name) {
        this.age = age;
        this.name = name;}

    public User() {

    }
    public void setName (String name) {
        this.name=name;
    }

    public int getage() {
        return age;
    }
    public  String getName () {
        return name;
    }
        //public void talk (String text) {
        //   System.out.println(text);


        //public static void e(){

    }

