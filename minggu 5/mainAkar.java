import java.util.Scanner;

public class mainAkar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================================");
        System.out.println("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        akar[] akarArray = new akar[elemen];
        for (int i = 0; i < elemen; i++) {
            akarArray[i] = new akar();
            System.out.println("Masukkan nilai data ke-" + (i + 1) + " : ");
            akarArray[i].nilai = sc.nextDouble();
        }
        System.out.println("===========================================================");
        System.out.println("Hasil akar Dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            long start = System.nanoTime(); // Catat waktu awal
            double hasilBF = akarArray[i].akarBF();
            long end = System.nanoTime(); // Catat waktu akhir
            System.out.println("akar dari nilai " + akarArray[i].nilai + " adalah : " + formatDecimal(hasilBF) );
            System.out.println("Waktu eksekusi (Brute Force) : " + (end - start) + " nanoseconds");
        }
        System.out.println("===========================================================");
        System.out.println("Hasil Akar Dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            long startDC = System.nanoTime(); // Catat waktu awal Divide and Conquer
            double hasilDC = akarArray[i].akarDC();
            long endDC = System.nanoTime(); // Catat waktu akhir Divide and Conquer
            System.out.println("Akar dari nilai " + akarArray[i].nilai + " adalah : " + formatDecimal(hasilDC));
            System.out.println("Waktu eksekusi (Divide and Conquer) : " + (endDC - startDC) + " nanoseconds");
        }
        
        System.out.println("============================================================================");
    }
    
    public static double formatDecimal(double value) {
        return Math.floor(value); // Mengembalikan nilai terbulatkan ke bawah
    }
}
