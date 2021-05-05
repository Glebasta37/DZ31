package Compare;

public class UserDZ3 {
    private int age;
    private String name;
    private int salary;

    public UserDZ3(int age, String name, int salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "UserDZ3{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
