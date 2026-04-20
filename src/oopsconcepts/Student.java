package oopsconcepts;

public class Student {
    // instance variables
    private String name;
    private int age;
    private int rollnumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative. Setting age to 0.");
            this.age = 0; // Default to 0 if invalid age is provided
        } else {
            this.age = age;
        }
    }

    public int getRollnumber() {
        return rollnumber;
    }

    // Setter for rollnumber
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}