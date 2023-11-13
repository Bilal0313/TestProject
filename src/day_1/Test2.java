package day_1;

import Customer.CumtomerInfo;

public class Test2 extends CumtomerInfo {
    private char gender;
    private double salary;

    public Test2(int age, String name, char gender, double salary) {
        super(age, name);
        setGender(gender);
        setSalary(salary);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
