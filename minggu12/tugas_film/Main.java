package tugas_film;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Doublelinkedlists dll = new Doublelinkedlists();
        Scanner input = new Scanner(System.in);
        boolean lever = true;
        while (lever) {
            System.out.println("========================================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("========================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("========================================");

            System.out.print("Masukkan pilihan: ");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Masukkan ID Film: ");
                    String id = input.next();
                    input.nextLine();
                    System.out.print("Judul Film: ");
                    String judul = input.nextLine();
                    System.out.print("Rating Film: ");
                    double rating = input.nextDouble();
                    dll.addFirst(id, judul, rating);
                    break;
                case 2:
                    System.out.print("Masukkan ID Film: ");
                    id = input.next();
                    input.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input.nextLine();
                    System.out.print("Rating Film: ");
                    rating = input.nextDouble();
                    dll.addLast(id, judul, rating);
                    break;
                case 3:
                    System.out.print("Masukkan ID Film: ");
                    id = input.next();
                    input.nextLine();
                    System.out.print("Judul Film: ");
                    judul = input.nextLine();
                    System.out.print("Rating Film: ");
                    rating = input.nextDouble();
                    System.out.println("Data Film ini akan masuk di urutan ke- ");
                    int indek = input.nextInt();
                    try {
                        dll.add(id, judul, rating, indek);
                    } catch (Exception e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                case 4:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                    break;
                case 5:
                    try {
                        dll.removeLast();
                    } catch (Exception e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                    break;
                case 6:

                    System.out.println("Masukan id film yang mau di hapus: ");
                    id = input.next();
                    try {
                        dll.remove(id);
                    } catch (Exception e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                    break;
                    case 7: 
                    dll.print();
                    break;
                    case 8:
                    System.out.println("Masukan id film yang mau dicari: ");
                    id = input.next();
                    dll.searchIdFilm(id);
                    break;
                    case 9: 
                    dll.selectionSortDesc();
                    dll.print();
                    break;
                    case 10:
                    lever = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;

            }
        }
    }
}
