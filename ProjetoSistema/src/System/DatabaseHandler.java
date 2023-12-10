/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thale
 */
public class DatabaseHandler {

    // JDBC URL, username, and password of MariaDB server
    private static final String JDBC_URL = "jdbc:mariadb://db.classify.fun:3306/honey";
    private static final String USERNAME = "honey";
    private static final String PASSWORD = "honey-dashboard";

    // JDBC variables for opening, closing, and managing connection
    private static Connection connection;

    // Method to establish a connection to the MariaDB database
    public static void connect() {
        try {
            // Register the JDBC driver
            Class.forName("org.mariadb.jdbc.Driver");

            // Open a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to close the connection to the MariaDB database
    public static void disconnect() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Example method to execute a simple query
    public static ArrayList executeQuery(String s) {
        
        ArrayList<App> list = new ArrayList<>();
        
        try {
            // Create a statement
            String query = s;
            try (PreparedStatement statement = connection.prepareStatement(query)) {

                // Execute the query
                try (ResultSet resultSet = statement.executeQuery()) {

                    // Process the result set
                    while (resultSet.next()) {
                        // Retrieve data from the result set
                        String column1 = resultSet.getString("name");
                        String column2 = resultSet.getString("brief");
                        String column3 = resultSet.getString("href");
                        App novo = new App(column1, column2, column3);
                        list.add(novo);

                        // Do something with the data
                        System.out.println("Name: " + column1 + ", Desc: " + column2 + ", href: " + column3);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        // Return list
        return list;
    }
}
