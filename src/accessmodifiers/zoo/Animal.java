package accessmodifiers.zoo;

public class Animal {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected String sound;

    public Animal(String name, String sound){
        this.name = name;
        this.sound = sound; 
    }

    public void makeSound(){
        System.out.println(name + " says " + sound);
    }

    protected void changeSound(String newSound){
        this.sound = newSound;
    }
}
