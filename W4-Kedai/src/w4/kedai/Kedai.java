package w4.kedai;

import java.util.Scanner;

/**
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-07
 */

public class Kedai {

    public static void main(String[] args) {
        // Membuat Scanner baru bernama keyboard
        Scanner keyboard = new Scanner (System.in);
        
        // Membuat objek menu yang merupakan array dari objek "Produk" yang memiliki ukuran 10.
        Produk[] menu = new Produk[10];
        
        // Membuat objek pesanan yang merupakan array dari objek "Penjualan" yang memiliki ukuran 10.
        Penjualan[] pesanan = new Penjualan[10];
        
        // Inisialisasi objek menu
        menu[0] = new Produk("Ayam Penyet           ", 23000, 10);
        menu[1] = new Produk("Udang Bakar           ", 25000, 20);
        menu[2] = new Produk("Nasi Empal            ", 15000, 13);
        menu[3] = new Produk("Nasi Goreng           ", 20000, 27);
        menu[4] = new Produk("Sop Buntut            ", 45000, 15);
        menu[5] = new Produk("Cappucino             ", 10000, 30);
        menu[6] = new Produk("Choco Vanila          ", 8000, 20);
        menu[7] = new Produk("Coffe Mocha           ", 15000, 22);
        menu[8] = new Produk("Air Mineral           ", 5000, 50);
        menu[9] = new Produk("Soda Gembira          ", 10000, 25);
        
        // Deklarasi Variabel
        int jumlah_pesanan = 0;
        int pilihan;
        int jumlah;
        int total_harga = 0;
        
        // Proses melakukan pemesanan menu
        // Proses dibawah akan dilakukan sekali, dan selama user memilih untuk memesan kembali.
        do {
            // Menampilkan daftar menu makanan
            System.out.println("            Daftar Menu Kedai");
            System.out.println("============================================");
            for(int i = 0; i < menu.length; i++){
                System.out.println((i+1) + ". " + menu[i].getNamaMakanan() + "[" + menu[i].getJumlah() + "]" + " \tRp " + menu[i].getHargaMakanan());
            }
            
            System.out.println("\n          Silahkan Pesan Menu");
            System.out.println("============================================");
        
            System.out.print("Masukkan Nomor Menu yang Ingin Dipesan : ");
            pilihan = keyboard.nextInt();
            System.out.print("Masukkan Jumlah Pesanan : ");
            jumlah = keyboard.nextInt();
            
            if(jumlah > menu[pilihan - 1].getJumlah()) {
                // Jika jumlah menu yang dipesan lebih banyak daripada stok yang tersedia, maka akan tampil output "Maaf, pesanan anda melebihi stok".
                System.out.println("Maaf, pesanan anda melebihi stok");
            } else {
                pesanan[jumlah_pesanan] = new Penjualan(menu[pilihan - 1].getNamaMakanan(), jumlah, (int) menu[pilihan - 1].getHargaMakanan());
                jumlah_pesanan++;
                menu[pilihan - 1].setJumlah(menu[pilihan - 1].getJumlah() - jumlah);
                total_harga += jumlah * menu[pilihan - 1].getHargaMakanan();
            }
            // Menampilkan pesan untuk memastikan user memesan kembali atau tidak
            System.out.print("\nApakah ingin memesan kembali? pilih(y/t) ");
        } while (keyboard.next().equals("y"));
        
        // Menampilkan rincian pesanan
        System.out.println("\n              Rincian Pesanan");
        System.out.println("============================================");
        for(int i = 0; i < jumlah_pesanan; i++){
            System.out.println((i+1) + ". " + pesanan[i].getNamaMakanan() + "  " + pesanan[i].getJumlah() + " buah" + "    Rp " + pesanan[i].getTotalHarga());
        }
        // Menampilkan total harga yang harus dibayar
        System.out.println("Total Bayar : Rp " + total_harga);      
        
        // Kode untuk menutup stream keyboard
        keyboard.close();
    }
}
