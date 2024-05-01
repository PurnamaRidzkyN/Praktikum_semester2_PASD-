import java.util.Scanner;
public class PersegiPanjangDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan Panjang array : ");
        int arlengt = sc.nextInt();
        PersegiPanjang[] arrayOfPersegiPanjang = new PersegiPanjang[arlengt];
        int panjang,lebar;

        for ( int i = 0; i<3; i++){
            System.out.println("Persegi Panjang ke-"+(i+1));
            System.out.print("Masukan panjang: ");
            panjang = sc.nextInt();
            System.out.print("Masukan lebar: ");
            lebar = sc.nextInt();
            arrayOfPersegiPanjang[i] = new PersegiPanjang(panjang,lebar);
        }
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
                    arrayOfPersegiPanjang[i].cetakInfo();
                    arrayOfPersegiPanjang[i].hitungLuas();
                    arrayOfPersegiPanjang[i].hitungKeliling();
                    System.out.println();
                    
        }

    }
}

