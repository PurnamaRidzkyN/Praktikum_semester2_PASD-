public class pegawai {
    public double datapaket;
    public double datapengiriman;
    public String lokasi;
    public String level_pegawai;
    public String akun;
    public String password;

    // Konstruktor
    public pegawai(double datapaket, double datapengiriman, String lokasi){
        this.datapaket = datapaket;
        this.datapengiriman= datapengiriman;
        this.lokasi=lokasi;
    }
    void infopaket(){
        System.out.println("Berat paket: "+datapaket);
        System.out.println("Jarak : " +datapengiriman);
        System.out.println("lokasi: "+lokasi);
    }


}
