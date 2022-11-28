/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservices;

/**
 *
 * @author LENOVO
 */
public class ProgramInjection {
    public static void main(String[] args) {
      barang barang = new barang();
      String kd="B001' OR 'atep'='atep";
      barang.delete(kd);
      String sql = "DELETE FROM barang WHERE kode_barang='"+kd+"'";
      System.out.println(sql);  
    }
    
}
