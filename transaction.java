import java.sql.*;
public class transaction {
    public static void main(String[] args)throws SQLException ,ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps1 = null;
        PreparedStatement ps2 = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/hello",
                    "root",
                    "Sk1234##"
            );
            con.setAutoCommit(false);

            ps1 = con.prepareStatement("INSERT INTO account(id, name, balance) VALUES (?, ?, ?)");
            ps1.setInt(1, 104);
            ps1.setString(2, "Pragati");
            ps1.setDouble(3, 5000);
            ps1.executeUpdate();


            ps2 = con.prepareStatement("UPDATE account SET balance = balance + ? WHERE id = ?");
            ps2.setDouble(1, 2000);
            ps2.setInt(2, 102);
            ps2.executeUpdate();


            con.commit();
            System.out.println("Transaction successful!");

        } catch (Exception e) {
            try {

                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back due to error!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {

                if (ps1 != null) ps1.close();
                if (ps2 != null) ps2.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}



