import java.sql.*;
public class exception {
    public static void main(String[] args)throws SQLException, ClassNotFoundException {
        String url="jdbc:mysql://localhost:3306/hello";
        String username="root";
        String password="Sk1234##";

        try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());}
        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Connection successful!");
            Statement st=con.createStatement();

            ResultSet rs=st.executeQuery("select * from employee");
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("namme");
                String job=rs.getString("job");
                double salary=rs.getDouble("salary");
                System.out.println("--------------");

                System.out.println(id+" "+name+" "+job+" "+salary);
            }
            rs.close();
            st.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed successfully!");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }


}
