package postpackaging;

public class TestStudent{
    public static void main(String[] args){
        Student entrance1 = new Student();
        entrance1.name = "Jane";
        entrance1.address = "123 Main St";
        entrance1.age = 20;
        entrance1.standard = 12;
        entrance1.rollNumber = 45;

        System.out.println(entrance1.address);
    }
   
}