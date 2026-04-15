package postpackaging;

public class Methods {
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        sumArr(a);

        int b[] = {12, 23, 34, 45, 56};
        sumArr(b);

        String name = "   first last      ";
        System.out.println(alterStr(name));
    }

    public static void sumArr(int[] arr){
        int result = 0;
        for(int num : arr){
            result += num;
        }
        System.out.println("The sum of the array is: " + result);
    }

    public static String alterStr(String str){

        String newStr = str.trim();
        newStr = newStr.toUpperCase();  
        return newStr;
    }
}
