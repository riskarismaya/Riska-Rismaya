/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservicesprepare;

/**
 *
 * @author LENOVO
 */
public class programDelete {
    public static void main(String[] args) {
        barang pensil = new barang();
        pensil.delete("P001");
        barang buku = new barang();
        buku.delete("B002");
    }
    
}
