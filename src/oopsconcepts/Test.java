package oopsconcepts;

public class Test {
    public static void main(String[] args){
        Dog chowchow = new Dog();
        chowchow.setName("Chow Chow");
        chowchow.setAge(5);
        chowchow.eat();
        chowchow.speak();

        //Multi-level inheritance where inheritance is going own from Grandparent->Parent->Child
        Child child = new Child();
        child.setName("John");
        child.setAge(10);

        Parent parent = new Parent();
        // parent.setName("Michael");
        // parent.setAge(35);

        //Hierarchical inheritance where multiple classes are inheriting from a single parent class which can be from different packages altogether, so import is done at the beginning of the project to accommodate the classes from different package the same
        Child baby1 = new Child();
        baby1.setAge(1);
        // System.out.println(baby1.HasSuperpowers());
        baby1.ChildMethod();
    }

    
}
