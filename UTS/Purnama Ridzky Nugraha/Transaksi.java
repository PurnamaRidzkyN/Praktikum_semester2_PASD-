public class Transaksi {
    double saldo;
    double saldoAkhir;
    double saldoAwal;
    String tanggalTransaksi;
    String type;

    Transaksi(double a, double b, double c, String d, String e) {
        saldo = a;
        saldoAkhir = b;
        saldoAwal = c;
        tanggalTransaksi = d;
        type = e;
    }


    public void tampilTransaksi() {
        System.out.println("Saldo Awal : " + saldoAwal);
        System.out.println("Saldo Akhir : " + saldoAkhir);
        System.out.println("Tanggal Transaksi : " + tanggalTransaksi);
        System.out.println("Type : " + type);
    }
}
