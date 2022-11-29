/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statements;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import riska.KoneksiDatabase;

public class programInsert {
    public static void main(String[] args) {
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        try{
            statement = koneksi.createStatement();
            System.out.println("Statement berhasil dibuat");
            String url = "INSERT INTO barang (kode_barang,nama_barang,jumlah,harga)VALUES('B001','BUKU GAMBAR',10,3000)";
            statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan " + ex.getMessage());
        }finally{
            if(statement != null){
                try{
                 statement.close();
                 System.out.println("Statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Statement gagal ditutup");
                    System.out.println("Pesan : "+ ex.getMessage());
                }
            }
        }
    }
    
}
