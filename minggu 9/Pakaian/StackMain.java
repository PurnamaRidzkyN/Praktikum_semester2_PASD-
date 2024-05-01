

import java.util.Scanner;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih;
        do {
            System.out.println("Menu:");
            System.out.println("1. Nambah Pakaian ");
            System.out.println("2. Hapus Pakaian ");
            System.out.println("3. Pakaian terakhir");
            System.out.println("4. Melihat semua pakaian");
            System.out.println("5. Nyari pakaian Paling mahal ");
            System.out.println("6. Exit");
            System.out.print("Pilih operasi yang ingin dilakukan: ");
            int opsi = sc.nextInt();
            sc.nextLine(); // Membersihkan newline
            
            switch (opsi) {
                case 1:
                    System.out.print("Jenis: ");
                    String jenis = sc.nextLine();
                    System.out.print("Warna: ");
                    String warna = sc.nextLine();
                    System.out.print("Merk: ");
                    String merk = sc.nextLine();
                    System.out.print("Ukuran: ");
                    String ukuran = sc.nextLine();
                    System.out.print("Harga: ");
                    double harga = sc.nextDouble();
                    sc.nextLine(); 
                    Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                    stk.push(p);
                    break;
                case 2:
                    if (!stk.isEmpty()) {
                        stk.pop();
                    } else {
                        System.out.println("Stack kosong, operasi pop tidak bisa dilakukan.");
                    }
                    break;
                case 3:
                    if (!stk.isEmpty()) {
                        stk.peek();
                    } else {
                        System.out.println("Stack kosong, tidak ada elemen untuk dipeek.");
                    }
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("mencari pakaian tertinggi ");
                    stk.getMax();
                    break;
                case 6:
                System.out.println("Terima kasih telah menggunakan program ini.");
                System.exit(0); // Keluar dari program
                break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            System.out.print("Apakah Anda ingin melanjutkan (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine(); // Membersihkan newline
        } while (pilih == 'y');
        
        sc.close(); // Menutup scanner
    }
}
