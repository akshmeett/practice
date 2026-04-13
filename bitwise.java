public class bitwise {

    public static void main(String[] args){
    //bitwise operators to operate with bits of numbers (byte, short, int, long)

    //not on float numbers, because those are divided into different parts
    //and, or, XOR, left shift, right shift, unsigned right shift
    int c = 5 & 3;
    System.out.println(Integer.toBinaryString(5)); // prints 101
    System.out.println(Integer.toBinaryString(3)); // prints 11
    System.out.println(c);
    //& both 1 gives 1
    // "|" Or either 1 gives 1
    // ^ XOR gives 1 where bits are different
    // not ~ turns 1 to 0 and 0 to 1, so basically flips the number of the bit

    int a = 5;
    System.out.println(Integer.toBinaryString(a)); // prints 101
    int b = ~a;
    System.out.println(Integer.toBinaryString(b)); // prints 11111111111111111111111111111010
    System.out.println(b); 

    System.out.println("-------------Left Shift Operator----------------");
    //left shift << shfits bit to the left by some number n
    int ca = 5;
    System.out.println(Integer.toBinaryString(ca)); // prints 101
    int d = ca << 2;
    System.out.println(d);
    System.out.println(Integer.toBinaryString(d)); // prints 1010

    //right shift >> shifts bit to the right by some number n
    System.out.println("-------------Right Shift Operator----------------");
    int e = 2;
    System.out.println(Integer.toBinaryString(e)); // prints 10
    int f = e >> 1;
    System.out.println(f);
    System.out.println(Integer.toBinaryString(f)); // prints 1



    System.out.println("-------------PrintLn/Print/Printf Operator----------------");
    //out.println : to print something on the console
    //system is a class containing system related utility methods: methods that interact with the runtime environment.
    //out is a static member of the system class, which is connected to the console, and provides methods to print data to the console.
    //println : can take overloaded data types. can only take single argument.
    //print : prints the data without moving to the next line, single argument only
    //printf : 

    int ab = 1;
    int bc = 2;
    String abc = "Sum";
    System.out.println("Hello" + " " + "World"); // concatenation of strings
    System.out.println(abc + " : "+(ab+bc));
    }
}
