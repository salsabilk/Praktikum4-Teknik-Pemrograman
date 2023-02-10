/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurantmain;

/**
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-07
 */
 
public class RestaurantMain {
    
    public static void main(String[] args) {
        // Membuat objek menu
        Restaurant menu = new Restaurant();
        
        // Menambahkan menu baru
        menu.tambahMenuMakanan("Bala-Bala",1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
    
        // Menampilkan menu makanan yang tersedia
        menu.tampilMenuMakanan();
        
        // Menampilkan rincian pesanan
        menu.orderPesanan("Bala-Bala", 15);
        
    }
    
}
