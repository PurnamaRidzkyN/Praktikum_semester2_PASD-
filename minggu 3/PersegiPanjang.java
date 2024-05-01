public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public void cetakInfo() {
        System.out.print("Persegi panjang, panjang: " + panjang + ", lebar: " + lebar);
    }
    public PersegiPanjang(){
        
    }
    public PersegiPanjang(int p, int l) {
        panjang = p;
        lebar = l;
    }

    public void hitungLuas() {
        int luas = panjang * lebar;
        System.out.print(", Luas: " + luas);
    }

    public void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.print(", Keliling: " + keliling);
    }
}