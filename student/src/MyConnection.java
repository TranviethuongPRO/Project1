/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author PC
 */
public class MyConnection {
     public static Connection getConnection() {
        Connection con = null;

        try {
            // Load driver
            Class.forName("com.mysql.jdbc.Driver");

            // Kết nối tới MySQL trong XAMPP
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/project1",
                "root",           // user mặc định của XAMPP
                ""                // mật khẩu mặc định là rỗng
            );

            System.out.println("Kết nối thành công!");

        } catch (Exception ex) {
            System.out.println("Lỗi kết nối: " + ex.getMessage());
        }

        return con;
    }  
}

