public class Pesanan_23 {
    int kodePesanan ;
    String namaPesanan;
    int harga;
    Pesanan_23 prev, next;

    Pesanan_23 (Pesanan_23 prev,int kodePesanan, String namaPesanan , int harga,Pesanan_23 next){
        this.prev = prev;
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.next=next;
    }
}
