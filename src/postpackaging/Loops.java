package postpackaging;
public class Loops {
    public static void main(String[] args) {
        //here i is the current value, j is what will print the different number of rows 
        for(int i = 7, j=1; j<=10; i = i+7, j++){
             System.out.println(i); 
        }

        //while loop to count the digits of a number 
        int num = 192837626;

        int count = 0;
        while(num > 0){
            num = num / 10; //removing the last digit of the number 
            count++; //incrementing the count of digits 
        }
        System.out.println("The number of digits is: " + count);

        //nested loops to print patterns
        for(int i = 1; i<=7; i++){
            for(int j = 1; j<=i; j++){
                System.out.println("*");
            }
        }

    }
}

