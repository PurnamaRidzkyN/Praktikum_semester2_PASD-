package tugas;
public class Struk {
    String noTransaksi;
    String tglPembelian;
    int jmlBarang;
    double totalHargaBayar;

    Struk(String noTransaksi, String tglPembelian, int jmlBarang, double totalHargaBayar) {
        this.noTransaksi = noTransaksi;
        this.tglPembelian = tglPembelian;
        this.jmlBarang = jmlBarang;
        this.totalHargaBayar = totalHargaBayar;
    }
}
