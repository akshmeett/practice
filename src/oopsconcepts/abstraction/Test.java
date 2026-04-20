package oopsconcepts.abstraction;

public class Test {
    public static void main(String[] args){
        Dog puppy1 = new Dog();
        puppy1.sayHello();
        Cat kitty1 = new Cat();
        kitty1.sayHello();
        Animal animal1 = new Dog();
        animal1.sayHello();
        
    }
}
