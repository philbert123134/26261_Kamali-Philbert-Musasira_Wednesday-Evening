
/*
 * Summary:
 * This program demonstrates handling of a ClassCastException.
 * It attempts to cast an object to an incompatible type, triggering the exception.
 * The error is caught and handled using a try-catch block.
 */

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Try block to handle type casting
        try {
            Object obj = new Integer(10); // Object is an Integer
            String str = (String) obj; // Invalid cast
        } catch (ClassCastException e) {
            // Catch block to handle invalid type casting
            System.out.println("ClassCastException: Invalid type casting.");
        }
    }
}
