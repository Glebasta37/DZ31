package Compare;

import java.util.Collections;

public class Robot implements Comparable <Robot> {
    private int power;
    private String model;

    public Robot(int power, String model) {
        this.power = power;
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    @Override
    public int compareTo(Robot o) {
        if (this.model.equals(o.model)) {
            if (this.power == o.power) {
                return 0;
            } else if (this.power < o.power) {
                return -1;
            } else if (this.power > o.power) {
                return 1;
            }}
         return this.model.compareTo(o.model);
            }

    @Override
    public String toString() {
        return "Robot{" +
                "power=" + power +
                ", model='" + model + '\'' +
                '}';
    }
}


















