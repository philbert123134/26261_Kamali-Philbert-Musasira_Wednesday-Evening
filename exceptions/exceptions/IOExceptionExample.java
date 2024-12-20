/*
 * Summary:
 * This program demonstrates handling of an IOException.
 * It attempts to read a file that does not exist, which triggers
 * an IOException, and the error is handled gracefully using a try-catch block.
 * Comments clarify the code logic and exception scenario.
 */

import java.io.*; // Import necessary classes for file handling

public class IOExceptionExample {
    public static void main(String[] args) {
        // Try block to handle file reading operations
        try {
            // Attempt to create a FileReader for a file that does not exist
            // This will trigger an IOException
            FileReader file = new FileReader("nonexistent_file.txt");
            
            // BufferedReader is used to read text from the file
            BufferedReader reader = new BufferedReader(file);
            
            // Read and print the first line from the file
            // This line will not execute if the file doesn't exist
            System.out.println(reader.readLine());
        } catch (IOException e) {
            // Catch block to handle input/output exceptions
            // Prints a user-friendly message when the file cannot be found
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

