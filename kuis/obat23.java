public class obat23 {

    public String nama;
    public String kategori;
    public int stok;
    public int jumlah;

    public obat23() {

    }

    public obat23(String nama23, String kategori23, int stok23, int jumlah23) {
        this.nama = nama23;
        this.kategori = kategori23;
        this.stok = stok23;
        this.jumlah = jumlah23;
    }

    void tampil() {
        System.out.println("Nama            : " + nama);
        System.out.println("Kategori        : " + kategori);
        System.out.println("Stok            : " + stok);
        System.out.println("Jumlah terjual  : " + jumlah);

    }

    int hitungSisa() {
        int sisa = stok - jumlah;
        return sisa;
    }

    void cariObatPalingLaku(int jumlah) {
        System.out.println("Data obat paling laku ");
        tampil();
    }

    void daftarObat() {

        System.out.println("Daftar oba sesuai stok ");
        tampil();
        System.out.println("=================================");

    }

}