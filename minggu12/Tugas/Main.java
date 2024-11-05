package Tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DoubleLinkedlists dll = new DoubleLinkedlists();
        boolean yes = true;
        while (yes) {
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println("1. Tambah Data Penerima Vaksin ");
            System.out.println("2. Hapus Data Pengantri Vaksin ");
            System.out.println("3. Daftar Penerima Vaksin ");
            System.out.println("4. Keluar");
            System.out.println("+++++++++++++++++++++++++++++");
            System.out.println(" Masukan Pilihan anda : ");
            int choose = input.nextInt();
            System.out.println("+++++++++++++++++++++++++++++");
            switch (choose) {
                case 1:
                    System.out.println("Masukan Data Penerima Vaksin ");
                    System.out.println("+++++++++++++++++++++++++++++");
                    System.out.println("Nomor Antrian : ");
                    String NA = input.next();
                    System.out.println("Nama Penerima :");
                    String NP = input.next();
                    dll.enqueue(NA, NP);
                    ;
                    break;
                    case 2:
                    dll.dequeue();
                    break;
                case 3:
                    dll.printQueue();
                    break;
                case 4:
                    yes = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        }
    }

}