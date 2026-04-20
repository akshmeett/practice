package accessmodifiers.school;

public class School {
    private static School schoolInstance;

    private School() {
        // Private constructor to prevent instantiation
    }

    public static School getInstance() {
        if (schoolInstance == null) {
            schoolInstance = new School();
        }
        return schoolInstance;
    }

}
