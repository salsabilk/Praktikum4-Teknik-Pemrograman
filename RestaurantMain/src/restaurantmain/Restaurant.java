/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmain;

/**
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-07
 */

public class Restaurant {
    public class Menu {
        // Deklarasi Variabel
        // Mengubah access modifier menjadi private
        private String[] nama_makanan;
        private double[] harga_makanan;
        private int[] stok;
        private static byte id = 0;
        
        // Membuat accessor getName
        public String[] getNama(){
            return nama_makanan;        // Mengembalikan nilai nama
        }
        
        // Membuat accessor getHarga
        public double[] getHarga(){
            return harga_makanan;       // Mengembalikan nilai harga
        }
        
        // Membuat accessor getStok
        public int[] getStok(){
            return stok;                // Mengembalikan nilai stok
        }
        
        // Membuat accessor getId
        public static byte getId(){
            return id;                  // Mengembalikan nilai id
        }
    }
    
    // Deklarasi array bernama "menu" yang memiliki tipe data Menu
    private Menu[] menu;
    
    // Membuat constructor Restaurant
    public Restaurant(){
        menu = new Menu[10];
        for(int i = 0; i < 10; i++){
            menu[i] = new Menu();
            menu[i].nama_makanan = new String[10];
            menu[i].harga_makanan = new double[10];
            menu[i].stok = new int[10];
        }
    }
    
    // Membuat method tambahMenuMakanan untuk menambah menu makanan
    public void tambahMenuMakanan(String nama, double harga, int stok){
        menu[Menu.getId()].nama_makanan[Menu.getId()] = nama;
        menu[Menu.getId()].harga_makanan[Menu.getId()] = harga;
        menu[Menu.getId()].stok[Menu.getId()] = stok;
        Menu.getId();
    }
    
    // Membuat method tampilMenuMakanan untuk menampilkan menu makanan
    public void tampilMenuMakanan(){
        System.out.println("      Menu Restaurant       ");
        System.out.println("============================");
        for(int i = 0; i <= Menu.getId(); i++){
            if(!isOutOfStok(i)){
                System.out.println(menu[i].nama_makanan[i] + "["+menu[i].stok[i]+"]"+"\tRp. "+menu[i].harga_makanan[i]);
            }
        }
    }
        
    // Membuat method isOutOfStok untuk memeriksa stok makanan
    public boolean isOutOfStok(int id){
        if(menu[id].stok[id] == 0){
            return true;
        } else {
            return false;
        }
    }
    
    // Menambah method nextId untuk menambah id
    public static void nextId(){
        Menu.id++;
    }
    
    // Membuat method orderPesanan untuk memesan makanan dan menampilkan rincian pesanan
    public void orderPesanan(String nama, int jumlah){
        for(int i = 0; i <= Menu.getId(); i++){
            // Terdapat pengkondisian, jika nama makanan dan jumlah makanan yang dipesan sesuai, maka pemesanan berhasil.
            if(menu[i].nama_makanan[i].equalsIgnoreCase(nama) && menu[i].stok[i] >= jumlah){
                System.out.println("\n      Rincian Pesanan     ");
                System.out.println("============================");
                System.out.println("Menu    : " + menu[i].nama_makanan[i]);
                System.out.println("Jumlah  : " + jumlah + " buah");
                System.out.println("Total   : Rp. " + menu[i].harga_makanan[i] * jumlah);
                menu[i].stok[i] -= jumlah;              // Mengurangi jumlah stok makanan setelah terdapat pesanan
                System.out.println("\n");
                tampilMenuMakanan();                    // Menampilkan menu makanan dengan jumlah stok yang terbaru
                return;  
            } 
        }
        // Jika nama makanan dan jumlah makanan yang dipesan tidak sesuai, maka akan tampil output "Maaf, pesanan anda melebihi stok".
        System.out.println("Maaf, pesanan anda melebihi stok");
    }
}
