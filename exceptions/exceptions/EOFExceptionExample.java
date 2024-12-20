
/*
 * Summary:
 * This program demonstrates handling of an EOFException.
 * It simulates a scenario where an attempt is made to read beyond the end of a file.
 * The exception is triggered and handled using a try-catch block.
 */

import java.io.*; // Import classes for file input and output

public class EOFExceptionExample {
    public static void main(String[] args) {
        // Try block to handle reading data from a stream
        try {
            // Simulate EOF using a byte array stream
            byte[] data = "test".getBytes(); // Data to read
            DataInputStream input = new DataInputStream(new ByteArrayInputStream(data));
            
            // Continuously read characters until an EOFException occurs
            while (true) {
                input.readChar(); // Attempt to read beyond available data
            }
        } catch (EOFException e) {
            // Catch block to handle the end of file error
            System.out.println("EOFException: Reached end of file unexpectedly.");
        } catch (IOException e) {
            // Handle other potential I/O exceptions
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

