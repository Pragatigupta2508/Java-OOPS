import java.sql.*;

public class Practice {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/hello";
        String username = "root";
        String password = "Sk1234##";
        //String query="Insert into employee(id,namme,job,salary) values(4,'Harry','Devops',750000)";
        //String query2="delete from employee where id=4";
        //String query3=" update employee set job='React Developer',salary=750000 where id=3";
        String query3=" update employee set salary=250000 where id=1";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection successful!");
            Statement st = con.createStatement();
            int rowsaffected =st.executeUpdate(query3);
            if(rowsaffected>0){
                System.out.println("Row updated successfully!");
                //System.out.println("Deleted successfully");
                //System.out.println("Employee inserted successfully!"+" " +rowsaffected);
            }else{
                System.out.println("Row not updated successfully!");
                //System.out.println("Failed to delete row");
                //System.out.println("Employee insert failed!");
            }

            st.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed successfully!");

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
