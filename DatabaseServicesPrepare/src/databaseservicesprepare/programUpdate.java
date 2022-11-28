/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservicesprepare;

/**
 *
 * @author LENOVO
 */
public class programUpdate {
    public static void main(String[] args) {
       barang pensil = new barang();
       pensil.update("P001", "Pensil 2B", 20, 2000);
       pensil.update("P002", "Spidol", 50, 1500);
       barang buku = new barang();
       buku.update("B001", "Buku Tulis", 30, 2500);
       buku.update("B002", "Buku Gambar", 40, 3000);
    }
    
}
