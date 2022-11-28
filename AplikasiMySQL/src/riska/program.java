/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package riska;

/**
 *
 * @author LENOVO
 */
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class program {
    public static void main(String[] args) {
        try{
        Driver driver = new Driver();
        DriverManager.registerDriver(driver);
            System.out.println("Berhasil meregistrasi driver");
        }
        catch(SQLException ex){
            System.out.println("Gagal meregistrasi driver");
            System.out.println("Pesan : " + ex.getMessage());
        }
        try{
            String url="jdbc:mysql://localhost:3306/db_oop";
            String user="root";
            String pass="";
            Connection koneksi = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke database berhasil");
        }
        catch(SQLException ex){
            System.out.println("Koneksi ke database gagal");
            System.out.println("Pesan : " + ex.getMessage());
        }
    }
    
}
