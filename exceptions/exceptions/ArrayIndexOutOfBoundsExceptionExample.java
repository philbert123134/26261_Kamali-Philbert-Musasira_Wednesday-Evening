
/*
 * Summary:
 * This program demonstrates handling of an ArrayIndexOutOfBoundsException.
 * It attempts to access an invalid index of an array, which triggers the exception.
 * The error is caught and handled using a try-catch block.
 */

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Try block to handle array index access
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Access an invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block to handle invalid array index errors
            System.out.println("ArrayIndexOutOfBoundsException: Index out of bounds.");
        }
    }
}

