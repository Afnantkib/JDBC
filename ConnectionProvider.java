import java.sql.Connection;

import java.sql.*;

public class ConnectionProvider {
    private static Connection con;

    public static Connection getConnection() {
        try {
                if (con == null) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/youtube";
                String user = "root";
                String password = "1234";
                con = DriverManager.getConnection(url, user, password);
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
        return con;

    }
}
