
/*
 * Summary:
 * This program demonstrates handling of a NumberFormatException.
 * It attempts to convert an invalid string to a number, triggering the exception.
 * The error is caught and handled using a try-catch block.
 */
public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        // Try block to handle number conversion
        try {
            int num = Integer.parseInt("ABC"); // Invalid format for number conversion
        } catch (NumberFormatException e) {
            // Catch block to handle invalid number format
            System.out.println("NumberFormatException: Invalid number format.");
        }
    }
}
