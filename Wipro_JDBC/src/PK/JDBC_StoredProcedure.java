package PK;

import java.sql.*;

public class JDBC_StoredProcedure {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeeUser_db",
                    "root",
                    "123456789");

            // Call stored procedure
            CallableStatement cs = con.prepareCall("{CALL GetAllStudents()}");
            
            ResultSet rs = cs.executeQuery();

            System.out.println("\nStudents Data from Stored Procedure:");
            System.out.println("--------------------------------------");
            System.out.printf("| %-3s | %-10s | %-3s | %-10s |\n",
                    "ID", "Name", "Age", "City");
            System.out.println("--------------------------------------");

            while (rs.next()) {

                System.out.printf("| %-3d | %-10s | %-3d | %-10s |\n",
                        rs.getInt("Id"),
                        rs.getString("Name"),
                        rs.getInt("Age"),
                        rs.getString("City"));
            }

            System.out.println("--------------------------------------");

            rs.close();
            cs.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
