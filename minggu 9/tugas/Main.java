package tugas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(100);
        
        boolean loop = true;
        do {
            System.out.println("Menu:");
            System.out.println("1. Menambah Struk");
            System.out.println("2. Mengambil Struk");
            System.out.println("3. Melihat Struk Teratas");
            System.out.println("4. Melihat Struk ");
            System.out.println("5. Exit");
            System.out.print("Pilih operasi yang ingin dilakukan: ");
            int opsi = sc.nextInt();
            sc.nextLine(); 
            
            switch (opsi) {
                case 1:
                    System.out.print("No Transaksi : ");
                    String noTransaksi = sc.nextLine();
                    System.out.print("Tanggal Pembelian: ");
                    String tglPembelian = sc.nextLine();
                    System.out.print("Jumlah Barang : ");
                    int jmlBarang = sc.nextInt();
                    System.out.print("Total Harga Barang: ");
                    double totalHargaBayar = sc.nextDouble();
                    sc.nextLine(); 
                    Struk s = new Struk(noTransaksi, tglPembelian, jmlBarang, totalHargaBayar);
                    stk.push(s);
                    break;
                case 2:
                    System.out.println("Berapa struk yang mau diambil : ");
                    int total = sc.nextInt();
                    for (int i = 0; i < total; i++){
                        if (!stk.isEmpty()) {
                            stk.pop();
                        } else {
                            System.out.println("Struk kosong");
                        }
                    }
                case 3:
                    if (!stk.isEmpty()) {
                        stk.peek();
                    } else {
                        System.out.println("Struk kosong");
                    }
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    loop = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            
            
        } while (loop);
        
        
    }
}
