import java.io.*;
import java.sql.*;
import javax.swing.JFileChooser;
public class SelectQuery {
   public static void main(String[] args) {
    try {
        Connection con=ConnectionProvider.getConnection();
        String q="insert into image(pic) values(?)";
        java.sql.PreparedStatement pstmt=con.prepareStatement(q);
        JFileChooser jfc=new JFileChooser();
        jfc.showOpenDialog(null);
        File file=jfc.getSelectedFile();
        FileInputStream fis=new FileInputStream(file);
        pstmt.setBinaryStream(1, fis,fis.available());
        pstmt.executeUpdate();
        System.out.println("Image saved***");
    } catch (Exception e) {
        //TODO: handle exception
        e.printStackTrace();
    }
        
        
   }
}
