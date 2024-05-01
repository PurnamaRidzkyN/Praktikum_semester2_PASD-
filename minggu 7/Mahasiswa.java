public class Mahasiswa {
    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa( int ni, String n, int u, double i){
        nim = ni;
        nama=n.toLowerCase();
        umur = u;
        ipk=i;
    }
    void tampil(){
        System.out.println("NIm = "+ nim);
        System.out.println("Nama = "+nama);
        System.out.println("Umur = "+ umur);
        System.out.println("IPK = "+ ipk);
    }

    
}
