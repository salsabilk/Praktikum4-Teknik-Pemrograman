package w4.kedai;

/**
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-07
 */

public class Penjualan {
    // Deklarasi Variabel
    private String nama_makanan;
    private int jumlah;
    private int total_harga;
    
    // Membuat Constructor Penjualan
    public Penjualan(String nama_makanan, int jumlah, int total_harga){
        this.nama_makanan = nama_makanan;
        this.jumlah = jumlah;
        this.total_harga = total_harga;
    }
    
    // Membuat accessor getNamaMakanan 
    public String getNamaMakanan(){
        return nama_makanan;                // Mengembalikan nilai nama
    }
    
    // Membuat accessor getJumlah
    public int getJumlah(){
        return jumlah;                      // Mengembalikan nilai jumlah
    }
    
    // Membuat mutator setJumlah
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    // Membuat accessor getTotalHarga
    public int getTotalHarga(){
        return total_harga;                 // Mengembalikan nilai total harga
    }
}
