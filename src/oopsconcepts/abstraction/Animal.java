package oopsconcepts.abstraction;

public abstract class Animal {
    public abstract void sayHello();
    //abstract vs concrete methods
    //abstract classes can have regular methods
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}
