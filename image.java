import java.io.*;
import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class image {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String url = "jdbc:mysql://localhost:3306/mydb";
        String username = "root";
        String password = "Sk1234##";
        String folderpath= "C:\\PRAGATI\\PHOTOS\\";
        String query="select imgdata from img where img_id=(?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection successful!");
//            FileInputStream fis = new FileInputStream(imgpath);
//            byte[] imgdata=new byte[fis.available()];
//            fis.read(imgdata);
//            PreparedStatement ps = con.prepareStatement(query);
//            ps.setBytes(1,imgdata);
//            int affectedrows=ps.executeUpdate();
//            if(affectedrows>0){
//                System.out.println("Successfully added image");
//            }else{
//                System.out.println("Failed to add image");
//            }

            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1,1);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                byte[] imgdata = rs.getBytes("imgdata");
                String imgpath=folderpath+"extraxtedimg.jpg";
                OutputStream out = new FileOutputStream(imgpath);
                out.write(imgdata);
                out.close();
                System.out.println("imgpath uploaded successfully!");
            }
            else{
                System.out.println("No data found!");
            }


            con.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e);
        }catch(FileNotFoundException e){
            System.out.println("File not found: " + e);
        }
        catch (SQLException e) {
            System.out.println("SQL Error: " + e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
