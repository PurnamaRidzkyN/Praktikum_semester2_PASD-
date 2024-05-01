import java.util.Scanner;

public class mainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("===========================================================");
        System.out.println("Hasil Faktorial Dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long start = System.nanoTime(); // Catat waktu awal
            int hasilBF = fk[i].FaktorialBF(fk[i].nilai);
            long end = System.nanoTime(); // Catat waktu akhir
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilBF);
            System.out.println("Waktu eksekusi (Brute Force) : " + (end - start) + " nanoseconds");
        }
        System.out.println("==============================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long start = System.nanoTime(); // Catat waktu awal
            int hasilDC = fk[i].FaktorialDC(fk[i].nilai);
            long end = System.nanoTime(); // Catat waktu akhir
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + hasilDC);
            System.out.println("Waktu eksekusi (Divide and Conquer) : " + (end - start) + " nanoseconds");
        }
        System.out.println("============================================================================");
    }
}
