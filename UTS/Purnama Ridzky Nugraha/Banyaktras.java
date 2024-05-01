public class Banyaktras {
    private Transaksi[] listTrans;
    private int jumTrans;
    private int idx;
    private double saldo;
    private double saldoAwal;

    public Banyaktras() {
        jumTrans = 0; 
        listTrans = new Transaksi[100];
        idx = 0;
        saldoAwal = 0; 
        saldo = 0;
    }

    public void tambahTransaksi(Transaksi transaksi) {
        if (idx < listTrans.length) {
            listTrans[idx] = transaksi;
            jumTrans= jumTrans +1;
            idx++;
        } else {
            System.out.println("Kapasitas riwayat transaksi sudah penuh.");
        }
    }

    public void tampilkanTransaksiUrutSaldo() {
        
        urutSaldoBesarKecil(); 
        System.out.println("Riwayat Transaksi (Urut berdasarkan Saldo Besar ke Kecil):");
        for (int i = 0; i < jumTrans; i++) {
            System.out.println("Transaksi ke-" + (i + 1));
            System.out.println("Saldo               : " + listTrans[i].saldo);
            System.out.println("Saldo Awal          : " + listTrans[i].saldoAwal);
            System.out.println("Saldo Akhir         : " + listTrans[i].saldoAkhir);
            System.out.println("Tanggal Transaksi   : " + listTrans[i].tanggalTransaksi);
            System.out.println("Tipe Transaksi      : " + listTrans[i].type);
            System.out.println("--------------------");
        }
    }
    

    public void tambahSaldo(double jumlah, String tanggal) {
        Transaksi transaksi = new Transaksi(saldo,saldo , saldoAwal, tanggal, "Isi Saldo");
        saldoAwal= saldo;
        saldo += jumlah; 
        tambahTransaksi(transaksi);
    }

    public void kurangiSaldo(double jumlah, String tanggal) {
        if (saldoAwal >= jumlah) { 
            Transaksi transaksi = new Transaksi(saldo, saldo, saldoAwal, tanggal, "Transfer Keluar");
            saldoAwal= saldo;
            saldo-= jumlah; 
            tambahTransaksi(transaksi); 
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer.");
        }
    }
    public void urutSaldoBesarKecil() {
        for (int i = 0; i < jumTrans - 1; i++) {
            for (int j = 0; j < jumTrans - i - 1; j++) {
                if (listTrans[j].saldo < listTrans[j + 1].saldo) {
                    
                    Transaksi temp = listTrans[j];
                    listTrans[j] = listTrans[j + 1];
                    listTrans[j + 1] = temp;
                }
            }
        }
    }
    
}
