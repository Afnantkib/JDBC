import java.sql.*;
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
            pstmt.setString(1,"Afnan");
            pstmt.setString(2,"Srinagar");
            pstmt.executeUpdate();
            
            System.out.println("connnected");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void executeUpdate() {
    }

    private void setString(int i, String string) {
    }
}