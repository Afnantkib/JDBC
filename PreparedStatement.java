import java.sql.*;
import java.io.*;
public class PreparedStatement{
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/youtube";
			String user="root";
			String password="1234";
            Connection con=DriverManager.getConnection(url, user, password);
            String q="insert into table1(tName,tCity) values (?,?)";  
            java.sql.PreparedStatement pstmt= con.prepareStatement(q);
            //taking custom input from user
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the name :");
            String name=br.readLine();
            System.out.println("Enter the city name");
            String city=br.readLine();
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
            System.out.println("Data saved successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}