/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservices;

/**
 *
 * @author LENOVO
 */
public class programInsert {
    public static void main(String[] args) {
        barang buku = new barang();
        buku.insert("B003", "BUKU TULIS", 60, 2000);
        buku.insert("B004", "BUKU KERJA", 30, 7500);

    }
    
}
