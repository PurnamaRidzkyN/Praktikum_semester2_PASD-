import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-------------------------------------------------------");
        System.out.println("Masukan data rekening ");
        System.out.println("-------------------");
        System.out.print("No Rekening\t : ");
        String noRekening = input.next();
        System.out.print("Nama\t : ");
        String nama = input.next();
        System.out.print("Nama Ibu\t : ");
        String namaibu = input.next();
        System.out.print("Phone\t : ");
        String Phone = input.next();
        System.out.print("Email\t : ");
        String Email = input.next();

     
        Rekening Rek = new Rekening(noRekening, nama, namaibu, Phone, Email);

        Banyaktras data = new Banyaktras(); 

        while (true) {
            System.out.println("-------------------------------------------------------");
            System.out.println("Apa yang mau anda lakukan ");
            System.out.println("1. Isi saldo  ");
            System.out.println("2. Transfer ");
            System.out.println("3. Lihat riwayat transaksi");
            System.out.println("4. Keluar ");
            System.out.print("masukan pilihan : ");
            int lanjut = input.nextInt();

            if (lanjut == 1) {
                System.out.println("-------------------------------------------------------");
                System.out.println("masukan berapa banyak saldo yang mau dimasukan");
                double saldo = input.nextDouble();
                System.out.println("Masukan tanggal transaksi (DD-MM-YYYY)");
                String tanggal = input.next();
                data.tambahSaldo(saldo, tanggal); 

            } else if (lanjut == 2) {
                System.out.println("-------------------------------------------------------");
                System.out.println("Masukan jumlah transfer");
                double jumtf = input.nextDouble();
                System.out.println("Masukan tanggal transaksi (DD-MM-YYYY)");
                String tanggal = input.next();
                
                data.kurangiSaldo(jumtf, tanggal); 

            } else if (lanjut == 3) {
                System.out.println("-------------------------------------------------------");
                data.tampilkanTransaksiUrutSaldo(); 

            } else if (lanjut == 4) {
                break; 
            } else {
                System.out.println("Pilihan tidak valid ");
            }
        }

        input.close(); 
    }
}
