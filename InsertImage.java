import java.sql.*;
import java.sql.PreparedStatement;
import java.io.*;
public class InsertImage {
    public static void main(String[] args) {
       try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/youtube";
		String user="root";
		String password="1234";
        Connection con=DriverManager.getConnection(url, user, password);
        //create table image
        String q="insert into image(pic) values(?)";
        PreparedStatement pstmt=con.prepareStatement(q);
        FileInputStream fis=new FileInputStream("capture.png");
        pstmt.setBinaryStream(1, fis,fis.available());
        pstmt.executeUpdate();
        System.out.println("Image inserted");
        con.close();
       } catch (Exception e) {
        //TODO: handle exception
            e.printStackTrace();
        }
    }
}
