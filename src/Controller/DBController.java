package Controller;

import java.sql.*;


public class DBController {
    private static String DB_URL = "jdbc:sqlserver://localhost";
    private static String user = "Test";
    private static String password = "test";
    private static Connection connection;

    public DBController(){
    }

    public static Connection connect(){
        connection = null;
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(DB_URL, user, password);
              System.out.println("Connection to database successful.");
        } catch(SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }


    public static void disconnect() {
        try {
            if(connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch(SQLException e) {
            System.out.println("Failed to disconnect from database.");
        }
    }



    public boolean checkIfAlreadyExists(String userName) {
        return false;
    }

    public boolean isUserNormal(String userNameLogin, String passwordLogin) {
        return false;
    }

    public boolean isUserAdmin(String userNameLogin, String passwordLogin) {
        return false;
    }
}
