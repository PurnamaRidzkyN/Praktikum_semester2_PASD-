import java.util.Scanner;

public class MahasiswaProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahMahasiswa;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMahasiswa = sc.nextInt();

        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahMahasiswa];

        // Looping untuk input data mahasiswa
        for (int i = 0; i < mahasiswaArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("Masukkan nama: ");
            String nama = sc.next();

            System.out.print("Masukkan NIM: ");
            String nim = sc.next();

            System.out.print("Masukkan jenis kelamin (L/P): ");
            char jenisKelamin = sc.next().charAt(0);

            System.out.print("Masukkan IPK: ");
            double ipk = sc.nextDouble();

            mahasiswaArray[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            int i = 1;
            System.out.println("\nData Mahasiswa ke-" + (i ));
            mahasiswa.cetakInfo();
            i++;
        }
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / mahasiswaArray.length;
        System.out.println("\nRata-rata IPK: " + rataRataIpk);
    }
}
