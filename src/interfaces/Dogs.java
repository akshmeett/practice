package interfaces;

public class Dogs implements Animals {
    @Override
    public void eat(){
        System.out.println("Dog eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog sleeping");
    }
}
