package accessmodifiers.zoo;

public class Dog extends Animal{
    public Dog(String name){
        super(name, "Woof");
    }

    public void wagTail(){
        System.out.println(getName() + " wags its tail.");
    }
}
