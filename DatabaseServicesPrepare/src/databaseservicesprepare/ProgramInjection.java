/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package databaseservicesprepare;

/**
 *
 * @author LENOVO
 */
public class ProgramInjection {
    public static void main(String[] args) {
        barang barang = new barang();
        barang.delete("B001 OR 'atep'='atep");
    }
    
}
