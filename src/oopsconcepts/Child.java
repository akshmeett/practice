package oopsconcepts;

public class Child extends Parent {
    public Child() {
        System.out.println("This is Child class constructor");
    }
    public void ChildMethod() {
        super.ParentMethod();
        System.out.println("ChildMethod is called");
    }
}
