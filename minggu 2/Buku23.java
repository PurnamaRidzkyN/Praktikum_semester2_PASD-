public class Buku23 {
    String judul;
    String pengarang;
    int halaman;
    int stok;
    int harga;

    public Buku23() {
        // Isi konstruktor default jika diperlukan
    }

    public Buku23(String jud, String pg, int hal, int st, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        stok = st;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok = stok - jml;
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal() {
        return harga * stok;
    }

    int hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        if (hargaTotal > 150000) {
            return (int) (hargaTotal *= 0.12);
        } else if (hargaTotal > 75000 && hargaTotal > 150000) {
            return (int) (hargaTotal * 0.05);
        } else {
            return (int) 0;
        }
    }
    int hitungBayar(){
        int bayar  = hitungHargaTotal()-hitungDiskon();
        return (int) bayar;
        
    }
}
