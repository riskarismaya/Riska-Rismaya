/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservicesprepare;

/**
 *
 * @author LENOVO
 */
public class programInsert {
    public static void main(String[] args) {
        barang pensil = new barang();
        pensil.insert("P001", "PENSIL 2B", 20, 2000);
        pensil.insert("P002", "SPIDOL", 50, 1500);
        barang buku = new barang();
        buku.insert("B001", "BUKU TULIS", 30, 2500);
        buku.insert("B002", "BUKU GAMBAR", 40, 3000);
    }
    
}
