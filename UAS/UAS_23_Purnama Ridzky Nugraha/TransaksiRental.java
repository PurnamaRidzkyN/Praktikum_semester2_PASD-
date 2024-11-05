
public class TransaksiRental {
    int kodeTransaksi;
    String namaPeminjam ;
    int lamaPinjam;
    double totalBiaya;
    BarangRental br;
    TransaksiRental prev,next;
    TransaksiRental(TransaksiRental prev,int kodeTransaksi, String namapeminjam,int lamaPinjam,double totalBiaya,BarangRental br,TransaksiRental next){
        this.kodeTransaksi=kodeTransaksi;
        this.namaPeminjam = namapeminjam;
        this.lamaPinjam = lamaPinjam;
        this.totalBiaya = totalBiaya;
        this.br = br;
        this.prev = prev;
        this.next = next;
    }
    
}