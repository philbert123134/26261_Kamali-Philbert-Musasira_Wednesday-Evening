
/*
 * Summary:
 * This program demonstrates handling of a NullPointerException.
 * It attempts to access a method on a null object reference, triggering the exception.
 * The error is caught and handled using a try-catch block.
 */

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Try block to handle null reference operations
        try {
            String str = null; // A null string reference
            str.length(); // Attempt to access a method on a null object
        } catch (NullPointerException e) {
            // Catch block to handle null reference errors
            System.out.println("NullPointerException: Attempted to access a null object.");
        }
    }
}

