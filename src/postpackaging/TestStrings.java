package postpackaging;
public class TestStrings
{
    public static void main(String[] args){
        // String initial = "Sample name";
        // String name = "sample name";
        // int length = name.length();
        // System.out.println(length);
        // char ch = name.charAt(1);
        // System.out.println(ch);
        // System.out.println();
        // System.out.println(name.equals(initial));
        // System.out.println(name.equalsIgnoreCase(initial));

        // String str1 = "Remote";
        // String str2 = "car";

        // int i = str1.compareTo(str2);
        // System.out.println(i);

        String name = "     first last    ";
        // String substr = name.substring(2, 5);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        name.trim();
        System.out.println(name);

        String newName = name.replace("last", "doe");
        System.out.println(newName);
        //string is immutable, it is stored in string pool. 
    }
}