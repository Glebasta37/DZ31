package Leson14;

public class Women {
    @Override
    public String toString() {
        return name;
    }

    public String name;
    private int age;
    public Women(String name, int age) {
        this.name = name;
        this.age = age;

        }

        public String getname() {
            return this.name;
        }

        public int getage() {
            return this.age;
        }
}
