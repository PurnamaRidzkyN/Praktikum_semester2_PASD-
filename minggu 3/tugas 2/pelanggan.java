public class pelanggan {
    public double datapaket;
    public double datapengiriman;
    public String lokasi;
    public String level_pegawai;
    public String akun;
    public String password;

    // Konstruktor
    public pelanggan(double datapaket, double datapengiriman, String lokasi){
        this.datapaket = datapaket;
        this.datapengiriman= datapengiriman;
        this.lokasi=lokasi;
    }
    public void infoPaketPelanggan(){
        System.out.println("Berat paket: "+datapaket);
        System.out.println("Jarak : " +datapengiriman);
        System.out.println("lokasi: "+lokasi);
    }

}
