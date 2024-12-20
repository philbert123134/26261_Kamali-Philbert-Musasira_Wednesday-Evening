
/*
 * Summary:
 * This program demonstrates handling of a FileNotFoundException.
 * It attempts to open a file that does not exist, triggering the exception.
 * The error is caught and handled using a try-catch block with a user-friendly message.
 */

import java.io.*; // Import classes for file handling

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        // Try block to handle potential file-related errors
        try {
            // Attempt to open a non-existent file
            FileReader file = new FileReader("missing.txt");
        } catch (FileNotFoundException e) {
            // Catch block to handle the specific case of a missing file
            // Prints an error message when the file is not found
            System.out.println("FileNotFoundException: File not found!");
        }
    }
}

