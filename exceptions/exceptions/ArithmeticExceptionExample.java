
/*
 * Summary:
 * This program demonstrates handling of an ArithmeticException.
 * It attempts to divide a number by zero, triggering the exception.
 * The error is caught and handled using a try-catch block.
 */

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        // Try block to handle arithmetic operations
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            // Catch block to handle division by zero errors
            System.out.println("ArithmeticException: Division by zero is not allowed.");
        }
    }
}

