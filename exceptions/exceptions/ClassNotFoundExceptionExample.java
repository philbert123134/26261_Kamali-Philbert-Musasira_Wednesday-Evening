
/*
 * Summary:
 * This program demonstrates handling of a ClassNotFoundException.
 * It attempts to load a class that does not exist, which triggers the exception.
 * The error is handled gracefully using a try-catch block.
 */

public class ClassNotFoundExceptionExample {
    public static void main(String[] args) {
        // Try block to handle class loading
        try {
            // Attempt to load a non-existent class
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Catch block to handle the error when the class is missing
            System.out.println("ClassNotFoundException: Class not found.");
        }
    }
}
