/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseservicesprepare;

/**
 *
 * @author LENOVO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import riska.KoneksiDatabase;

public class barang {
    private Connection koneksi;
    public barang(){
        koneksi = KoneksiDatabase.getKoneksi();
    }
    public void insert(String kd, String nm, int jml, long hrg){
        PreparedStatement prepare = null;
        try{
            String sql="INSERT INTO barang (kode_barang,nama_barang,jumlah,harga)VALUES(?,?,?,?)";
            prepare = koneksi.prepareStatement(sql);
            System.out.println("Prepare statement berhasil dibuat");
            prepare.setString(1, kd);
            prepare.setString(2, nm);
            prepare.setInt(3, jml);
            prepare.setLong(4, hrg);
            prepare.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Prepare statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        }finally{
            if (prepare != null){
                try{
                    prepare.close();
                    System.out.println("Prepare statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
        }
    }
    
    public void update(String kd, String nm, int jml, long hrg){
        PreparedStatement prepare = null;
        try{
            String sql="UPDATE barang SET nama_barang=?,jumlah=?,harga=? WHERE kode_barang=?";
            prepare = koneksi.prepareStatement(sql);
            System.out.println("Prepare statement berhasil dibuat");
            prepare.setString(1, nm);
            prepare.setInt(2, jml);
            prepare.setLong(3, hrg);
            prepare.setString(4, kd);
            prepare.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Prepare statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        }finally{
            if (prepare != null){
                try{
                    prepare.close();
                    System.out.println("Prepare statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
        }
    }
    
    public void delete(String kd){
        PreparedStatement prepare = null;
        try{
            String sql="DELETE FROM barang WHERE Kode_barang=?";
            prepare = koneksi.prepareStatement(sql);
            System.out.println("Prepare statement berhasil dibuat");
            prepare.setString(1, kd);
            prepare.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Prepare statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        }finally{
            if (prepare != null){
                try{
                    prepare.close();
                    System.out.println("Prepare statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
        }
    }
}
