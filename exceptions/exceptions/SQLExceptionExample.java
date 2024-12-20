
/*
 * Summary:
 * This program demonstrates handling of an SQLException.
 * It simulates a database connection error by attempting to connect to
 * a non-existent database. The exception is caught and handled using a try-catch block.
 */

import java.sql.*; // Import classes for SQL operations

public class SQLExceptionExample {
    public static void main(String[] args) {
        // Try block to handle potential database errors
        try {
            // Attempt to connect to a non-existent database
            Connection conn = DriverManager.getConnection("jdbc:invalid:url", "user", "pass");
        } catch (SQLException e) {
            // Catch block to handle database connection errors
            // Prints an error message explaining the issue
            System.out.println("SQLException: Unable to connect to database. " + e.getMessage());
        }
    }
}

