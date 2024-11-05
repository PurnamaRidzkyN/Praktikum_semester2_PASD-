public class BarangRental {
    String noTNKB;
    String namaKendaraan;
    String jenisKendaraan;
    int tahun;
    int biayaSewa;
    BarangRental prev, next;

    BarangRental(BarangRental prev ,String noTNKB, String namaKendaraan,String jenisKendaraan,int tahun,int biayaSewa, BarangRental next) {
        this.noTNKB= noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa= biayaSewa;
        this.prev = prev;
        this.next = next;
    }

}