package accessmodifiers;
import accessmodifiers.school.School;
import accessmodifiers.school.Student;

public class Test {
    public static void main(String[] args) {
        // // Create an instance of the Student class from the school package
        // Student student = new Student();

        // // Access the public fields of the Student class
        // student.name = "Alice";
        // student.age = 20;
        // student.sayHello();

        //testing singeton pattern
        //School school1 = new School() //doesnt work because object creation is private
        School s1 = School.getInstance();
        School s2 = School.getInstance();
        System.out.println(s1 == s2); // Output: true, both references point to the same instance

    }
}
