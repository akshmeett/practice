package oopsconcepts;

public class Student {
    // instance variables
    private String name;
    private int age;
    private int rollnumber;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    // Getter for rollnumber
    public int getRollnumber() {
        return rollnumber;
    }

    // Setter for rollnumber
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}