package oopsconcepts.abstraction;

public class Dog extends Animal {
    @Override
    public void sayHello() {
        System.out.println("Woof! Hello!");
    }//say hello was an abstract method in the parent class which is also abstract, so it needs to be overridden in the child class or child class also needs to be abstract
    public void eat() {
        System.out.println("Dog is eating");
    }
}
