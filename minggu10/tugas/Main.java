package tugas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue antrianPasien = new Queue(10);
        int pilihan;

        do {
            System.out.println("\nMenu Antrian Pasien:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Hapus Pasien");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan Pasien Paling Depan");
            System.out.println("5. Tampilkan Pasien Paling Belakang");
            System.out.println("6. Cari Pasien");
            System.out.println("7. Daftar Pasien");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan nomor identitas: ");
                    int noID = scanner.nextInt();
                    System.out.print("Masukkan jenis kelamin (L/P): ");
                    char jenisKelamin = scanner.next().charAt(0);
                    System.out.print("Masukkan umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); 
                    antrianPasien.enqueue(new Pasien(nama, noID, jenisKelamin, umur));
                    break;
                case 2:
                    Pasien pasienHapus = antrianPasien.dequeue();
                    if (pasienHapus != null) {
                        System.out.println("Pasien yang dihapus: " + pasienHapus);
                    }
                    break;
                case 3:
                    antrianPasien.print();
                    break;
                case 4:
                    antrianPasien.peek();
                    break;
                case 5:
                    antrianPasien.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien yang dicari: ");
                    String namaCari = scanner.nextLine();
                    antrianPasien.peekPosition(namaCari);
                    break;
                case 7:
                    antrianPasien.daftarPasien();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
