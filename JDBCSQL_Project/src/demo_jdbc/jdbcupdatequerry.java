/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demo_jdbc;

/**
 *
 * @author hp
 */
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class jdbcupdatequerry {

    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee_data", "postgres", "root");
            con.setAutoCommit(false);
            System.out.println("database connection opened");

            /*stmt=con.createStatement();
            String sql="CREATE TABLE STUDENT_RECORD" + "(ROLL_NO SERIAL NOT NULL PRIMARY KEY,"
                    + "NAME TEXT NOT NULL," + "MOBILE_NO BIGINT NOT NULL," + 
                    "ADDRESS TEXT NOT NULL," + 
                    "PERCENTAGE REAL NOT NULL)";
            stmt.executeUpdate(sql);*/
            stmt = con.createStatement();
            /* String sql="INSERT INTO STUDENT_RECORD(ROLL_NO,NAME,MOBILE_NO,ADDRESS,PERCENTAGE)" + "VALUES(4,'VISHAL BADE',8545129687,'Aurangabad',78)";
            stmt.executeUpdate(sql);
            sql="INSERT INTO STUDENT_RECORD(ROLL_NO,NAME,MOBILE_NO,ADDRESS,PERCENTAGE)" + "VALUES(5,'SHUBHAM CHILWANT',9456865239,'Aurangabad',85)";
            stmt.executeUpdate(sql);*/
           // String sql = "UPDATE STUDENT_RECORD SET NAME ='YOGESH PATIL' Where ROLL_NO=1";
           String sql = "DELETE FROM STUDENT_RECORD WHERE ROLL_NO=5 ";
            stmt.executeUpdate(sql);
            con.commit();
            ResultSet rs = stmt.executeQuery(" select * from student_record;");
            while (rs.next()) {
                int roll_no = rs.getInt("ROLL_NO");
                String name = rs.getString("NAME");
                String mobli_no = rs.getString("MOBILE_NO");
                String address = rs.getString("ADDRESS");
                double percentage = rs.getDouble("PERCENTAGE");

                System.out.println("Roll_no: " + roll_no);
                System.out.println("NAME: " + name);
                System.out.println("MOBILE_NO: " + mobli_no);
                System.out.println("ADDRESS: " + address);
                System.out.println("PERCENTAGE: " + percentage);

            }
            stmt.close();
            con.commit();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getClass().getName());
            System.exit(0);
        }
        System.out.println("values inserted in table successfully..");
    }
}
