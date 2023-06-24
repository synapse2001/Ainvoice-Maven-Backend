package com.highradius.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:sqlserver://synapse1504.database.windows.net:1433;database=h2h_oap";
    private static final String USERNAME = "synapse";
    private static final String PASSWORD = "Gagan#2001";

    private static Connection connection;

    static {
        establishConnection();
    }

    private static void establishConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            System.out.println("Database connection established.");
        } catch (ClassNotFoundException e) {
            System.err.println("Error loading JDBC driver: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
    }

    public static Connection getConnection() {
        return connection;
    }
}
