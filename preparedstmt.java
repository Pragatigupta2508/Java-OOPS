import java.sql.*;
import java.util.Scanner;

public class preparedstmt {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hello";
        String username = "root";
        String password = "Sk1234##";
        String query ="insert into employee(id,namme,job,salary)values(?,?,?,?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection successful!");

            Scanner sc = new Scanner(System.in);
            int id=sc.nextInt();
            sc.nextLine();

            String namme=sc.nextLine();
            String job=sc.nextLine();
            double salary=sc.nextDouble();

           // Statement st = con.createStatement();
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1,id);
            pst.setString(2,namme);
            pst.setString(3,job);
            pst.setDouble(4,salary);
            int rowsaffected=pst.executeUpdate();
//            ResultSet rs = pst.executeQuery();
//            while(rs.next()) {
//                int id=rs.getInt("id");
//                String namme=rs.getString("namme");
//                String job=rs.getString("job");
//                double salary=rs.getDouble("salary");
//                System.out.println("ID"+id);
//                System.out.println("Name"+namme);
//                System.out.println("Job"+job);
//                System.out.println("Salary"+salary);
//            }
//            rs.close();
            if(rowsaffected>0){
                System.out.println("insert successful!");
            }
            else{
                System.out.println("insert failed!");
            }
            pst.close();



            //st.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed successfully!");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found: " + e);
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e);
        }
    }
}
