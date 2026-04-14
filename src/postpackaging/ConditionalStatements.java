package postpackaging;

public class ConditionalStatements {
    public static void main(String[] args){
        //relational operators: >, <, >=, <=, ==, !=
        //compare two values and return boolean result
        int a = 1;
        int b = 2; 
        boolean c = a<=b;
        System.out.println("Relational comparison: " + c);
        System.out.println();
        char ascii1 = 'a';
        char ascii2 = 'z';
        System.out.println('a'+0);
        System.out.println('z'+0);
        boolean d = ascii1==ascii2;
        System.out.println("Character comparison: " + d);
        System.out.println();
        String str1 = "Pool";
        String str2 = new String("Pool");
        boolean e = str1==str2;
        System.out.println("String comparison: " + e);
        System.out.println();

        int ramMarks = 8;
        int ramAge = 12;
        //String name = "Ram";
        int experience = 2;
        boolean tier1 = true;
        //logical operators: &&, ||, !
        //logical AND &&
        System.out.println("&& operator: " + (ramMarks<10 && ramAge>10));
        //logical OR ||
        System.out.println("|| operator: " + (experience>=5 || tier1));
        System.out.println();
        System.out.println("----------------------------------------");
        //logical NOT !, simply flips i.e if we write 2>3 then it's false, but if we write !(2>3) then it becomes true
        //conditional statements: if, else if, else, switch
        int age = 21;
        if(age<18){System.out.println("You are a minor");}
        else if(age>=18 && age<60){System.out.println("You are an adult");}
        else{System.out.println("You are a senior citizen");}
        System.out.println("----------------------------------------");
        System.out.println("Switch cases sample");
        //switch cases
        int day = 3;
        switch(day){
            case 1:{
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;  
            }
            case 3:{
                System.out.println("Wednesday");
                break;
            }
            case 4:{
                System.out.println("Thursday");
                break;
            }
            case 5:{
                System.out.println("Friday");
                break;
            }
            case 6:{
                System.out.println("Saturday");
                break;
            }
            case 7:{
                System.out.println("Sunday");
                break;
            }
            default:{
                System .out.println("Invalid day");
            }
        }
    }

   
}
