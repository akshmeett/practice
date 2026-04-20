package oopsconcepts;

public class grandParent {
    //everyone inherts from grandParent class, name and age values.
    private String name;
    private int age;
    private boolean Superpowers;
    
    public boolean HasSuperpowers() {
        return Superpowers;
    }


    public grandParent() {
        Superpowers = false;
        System.out.println("This is grandParent class constructor");
    }


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
        this.age = age;
    }


}
