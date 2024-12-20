
/*
 * Summary:
 * This program demonstrates handling of an IllegalArgumentException.
 * It passes an invalid argument to a method, triggering the exception.
 * The error is caught and handled using a try-catch block.
 */

public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        // Try block to handle invalid arguments
        try {
            Thread thread = new Thread();
            thread.setPriority(20); // Invalid priority value
        } catch (IllegalArgumentException e) {
            // Catch block to handle invalid arguments
            System.out.println("IllegalArgumentException: Invalid argument passed.");
        }
    }
}
