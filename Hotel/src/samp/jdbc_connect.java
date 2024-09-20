package samp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class jdbc_connect {
    public static void main(String[] args) {
        // Database URL and credentials
        String url = "jdbc:mysql://localhost:3306/jbeans";  // Replace 'test_db' with your database name
        String user = "root";  // Replace 'root' with your MySQL username
        String password = "Passing@5q1";  // Replace with your MySQL password

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Connected to the database successfully!");
            }

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
}
