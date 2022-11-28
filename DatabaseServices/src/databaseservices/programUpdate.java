/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservices;

/**
 *
 * @author LENOVO
 */
public class programUpdate {
    public static void main(String[] args) {
        barang buku = new barang();
        buku.update("B003", "PENSIL 2B", 30, 1750);
        buku.update("B004", "PENGGARIS", 15, 1000);

    }
    
}
