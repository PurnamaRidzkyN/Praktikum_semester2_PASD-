import java.text.DecimalFormat;
import java.util.Scanner;

public class mainSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================================================");    
        System.out.println("Program Menghitung keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.println("Masukan jumlah perusahaan ");
        int jmlp = sc.nextInt();
        for (int j=0; j<jmlp; j++){
            System.out.println("============================================================");   
            System.out.println("Masukan jumlah bulan perusahaan ke-" +(j+1)+" : ");
            int elm = sc.nextInt();

            Sum sm = new Sum(elm);
            System.out.println("================================================================");
         for(int i=0; i<sm.elemen;i++){
                System.out.print("Masukan untung bulan ke - "+ (i+1)+" = ");
                sm.keuntungan[i]= sc.nextDouble();
            }
            System.out.println("=================================================================");
            System.out.println("Algoritman Brute Force ");
            System.out.println("Total keuntungan perusahaan selama "+sm.elemen +" bulan adalah = "+ formatDecimal(sm.totalBf(sm.keuntungan)));
            System.out.println("=================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen +" bulan adalah = "+ formatDecimal(sm.totalDC(sm.keuntungan,0, sm.elemen-1)));
    }
    }

    // Method untuk membatasi output menjadi dua desimal di belakang koma
    public static String formatDecimal(double value) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(value);
    }
}