package w4.kedai;

/**
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-07
 */

public class Produk {
    // Deklarasi Variabel
    private String nama_makanan;
    private int harga_makanan;
    private int jumlah;
    
    // Membuat Constructor Produk
    public Produk(String nama_makanan, int harga_makanan, int jumlah){
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.jumlah = jumlah;
    }
    
    // Membuat accessor getNamaMakanan
    public String getNamaMakanan(){
        return nama_makanan;            // Mengembalikan nilai nama
    }
    
    // Membuat accessor getHargaMakanan
    public int getHargaMakanan(){
        return harga_makanan;           // Mengembalikan nilai harga
    }
    
    // Membuat accessor getJumlah
    public int getJumlah(){
        return jumlah;                  // Mengembalikan nilai jumlah
    }
    
    // Membuat mutator setJumlah
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
}
