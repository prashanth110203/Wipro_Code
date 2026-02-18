package PK;

import java.sql.*;

public class JDBC_COMMANDS {

    public static void main(String[] args) {

        try {

            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/employeeUser_db",
                    "root",
                    "123456789");

            Statement stmt = con.createStatement();

//            // CREATE TABLE
// 
//            String createTable = "CREATE TABLE IF NOT EXISTS studentss ("
//                    + "Id INT PRIMARY KEY, "
//                    + "Name VARCHAR(50), "
//                    + "Age INT)";
//	
//            stmt.executeUpdate(createTable);
//            System.out.println("Table created successfully");
//
//
//            // ==============================
//            // INSERT 10 RECORDS
//            // ==============================
//            String insertSQL = "INSERT INTO students (Id, Name, Age) VALUES (?, ?, ?)";
//
//            PreparedStatement ps = con.prepareStatement(insertSQL);
//
//            ps.setInt(1, 1);
//            ps.setString(2, "Prashanth");
//            ps.setInt(3, 22);
//            ps.executeUpdate();
//
//            ps.setInt(1, 2);
//            ps.setString(2, "Rahul");
//            ps.setInt(3, 21);
//            ps.executeUpdate();
//
//            ps.setInt(1, 3);
//            ps.setString(2, "Arun");
//            ps.setInt(3, 23);
//            ps.executeUpdate();
//
//            ps.setInt(1, 4);
//            ps.setString(2, "Kiran");
//            ps.setInt(3, 20);
//            ps.executeUpdate();
//
//            ps.setInt(1, 5);
//            ps.setString(2, "Vijay");
//            ps.setInt(3, 24);
//            ps.executeUpdate();
//
//            ps.setInt(1, 6);
//            ps.setString(2, "Ajay");
//            ps.setInt(3, 22);
//            ps.executeUpdate();
//
//            ps.setInt(1, 7);
//            ps.setString(2, "Suresh");
//            ps.setInt(3, 21);
//            ps.executeUpdate();
//
//            ps.setInt(1, 8);
//            ps.setString(2, "Mahesh");
//            ps.setInt(3, 23);
//            ps.executeUpdate();
//
//            ps.setInt(1, 9);
//            ps.setString(2, "Ramesh");
//            ps.setInt(3, 25);
//            ps.executeUpdate();
//
//            ps.setInt(1, 10);
//            ps.setString(2, "David");
//            ps.setInt(3, 22);
//            ps.executeUpdate();
//
//            System.out.println("10 rows inserted successfully");
//
//            // ALTER TABLE (Add new column)
//
//            String alterSQL = "ALTER TABLE students ADD COLUMN City VARCHAR(50)";
//
//            try {
//                stmt.executeUpdate(alterSQL);
//                System.out.println("Column 'City' added successfully");
//            } catch (Exception e) {
//                System.out.println("City column already exists");
//            }
//
//
//            // UPDATE DATA
//
//            String updateSQL = "UPDATE students SET Age = 26 WHERE Id = 5";
//
//            int rowsUpdated = stmt.executeUpdate(updateSQL);
//            System.out.println(rowsUpdated + " row updated");
//
//
//            // DELETE DATA
//
//            String deleteSQL = "DELETE FROM students WHERE Id = 3";
//
//            int rowsDeleted = stmt.executeUpdate(deleteSQL);
//            System.out.println(rowsDeleted + " row deleted");


            // SELECT ALL DATA
            
            String updateSql = "UPDATE students SET City=? WHERE Id=?";
            PreparedStatement ps = con.prepareStatement(updateSql);

            // Update City values
            ps.setString(1, "Chennai");
            ps.setInt(2, 1);
            ps.executeUpdate();

            ps.setString(1, "Mumbai");
            ps.setInt(2, 2);
            ps.executeUpdate();

            ps.setString(1, "Hyderabad");
            ps.setInt(2, 4);
            ps.executeUpdate();

            ps.setString(1, "Bangalore");
            ps.setInt(2, 5);
            ps.executeUpdate();

            ps.setString(1, "Delhi");
            ps.setInt(2, 6);
            ps.executeUpdate();

            ps.setString(1, "Pune");
            ps.setInt(2, 7);
            ps.executeUpdate();

            ps.setString(1, "Kolkata");
            ps.setInt(2, 8);
            ps.executeUpdate();

            ps.setString(1, "Jaipur");
            ps.setInt(2, 9);
            ps.executeUpdate();

            ps.setString(1, "Kochi");
            ps.setInt(2, 10);
            ps.executeUpdate();

            ps.close();


            // SELECT data
            String selectSQL = "SELECT * FROM students ORDER BY Id";

            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nFinal Table Data:");
            System.out.println("-----------------------------------");
            System.out.printf("| %-3s | %-10s | %-3s | %-10s |\n", "ID", "Name", "Age", "City");
            System.out.println("-----------------------------------");

            while (rs.next()) {

                System.out.printf("| %-3d | %-10s | %-3d | %-10s |\n",
                        rs.getInt("Id"),
                        rs.getString("Name"),
                        rs.getInt("Age"),
                        rs.getString("City"));   // ✅ City printed here
            }

            System.out.println("-----------------------------------");

            rs.close();
            con.close();

        } catch (Exception e) {

            System.out.println(e);
            
        }
    }
}
