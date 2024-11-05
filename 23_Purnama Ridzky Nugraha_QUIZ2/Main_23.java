import java.util.Scanner;

public class Main_23 {

    public static void main(String[] args) {
        Scanner purnama = new Scanner(System.in);
        System.out.println("=========== QUIZ 2 PRAKTIKUM ASD SIB - 1B ===========");
        System.out.println("dibuat oleh : Purnama Ridzky Nugraha ");
        System.out.println("NIM : 2341760037");
        System.out.println("Absen : 23 ");
        System.out.println("======================================================");
        System.out.println("Sistem Antrian Royal Delish ");
        Doublelinkedlist_23 dll = new Doublelinkedlist_23();
        dllpesanan_23 dllpesan = new dllpesanan_23();
        boolean on = true;
        while (on) {
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian ");
            System.out.println("2. Cetak Antrian ");
            System.out.println("3. Hapus Antrian ");
            System.out.println("4. Laporan Pengurutan peasanan by nama ");
            System.out.println("5.  Hitung total Pendapatan ");
            System.out.println("6. Keluar");
            System.out.println("Pilih  (1- 5): ");
            int choose = purnama.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("---------------------------------------");
                    System.out.println("Masukan Data Pembeli ");
                    System.out.println("---------------------------------------");
                    System.out.println("Nomor Antrian : ");
                    System.out.println("1");
                    int nomorAntri = 1;
                    System.out.println("Nomor Customer : ");
                    System.out.println("Mamluatul");
                    String namaPembeli = "Mamluatul";
                    System.out.println("Nomor HP : ");
                    System.out.println("08224500000");
                    String noHp = "08224500000";

                    Pembeli_23 pembeli = new Pembeli_23(namaPembeli, noHp);
                    dll.addLast(nomorAntri, pembeli);

                    System.out.println("---------------------------------------");
                    System.out.println("Masukan Data Pembeli ");
                    System.out.println("---------------------------------------");
                    System.out.println("Nomor Antrian : ");
                    System.out.println("2");
                    nomorAntri = 2;
                    System.out.println("Nomor Customer : ");
                    System.out.println("Abyaz A.M");
                    namaPembeli = "Abyaz A.M";
                    System.out.println("Nomor HP : ");
                    System.out.println("08224511111");
                    noHp = "08224511111";
                    Pembeli_23 pembeli1 = new Pembeli_23(namaPembeli, noHp);
                    dll.addLast(nomorAntri, pembeli1);

                    System.out.println("---------------------------------------");
                    System.out.println("Masukan Data Pembeli ");
                    System.out.println("---------------------------------------");
                    System.out.println("Nomor Antrian : ");
                    System.out.println("3");
                    nomorAntri = 3;
                    System.out.println("Nomor Customer : ");
                    System.out.println("Yoshinoya");
                    namaPembeli = "Yoshinoya";
                    System.out.println("Nomor HP : ");
                    System.out.println("08224522222");
                    noHp = "08224522222";
                    Pembeli_23 pembeli2 = new Pembeli_23(namaPembeli, noHp);
                    dll.addLast(nomorAntri, pembeli2);

                    System.out.println("---------------------------------------");
                    System.out.println("Masukan Data Pembeli ");
                    System.out.println("---------------------------------------");
                    System.out.println("Nomor Antrian : ");
                    System.out.println("4");
                    nomorAntri = 4;
                    System.out.println("Nomor Customer : ");
                    System.out.println("Susi Susanti");
                    namaPembeli = "Susi Susanti";
                    System.out.println("Nomor HP : ");
                    System.out.println("081234456");
                    noHp = "081234456";
                    Pembeli_23 pembeli3 = new Pembeli_23(namaPembeli, noHp);
                    dll.addLast(nomorAntri, pembeli3);

                    break;
                case 2:
                    dll.print();
                    break;
                case 3:
                    try {
                        dll.removeFirst();
                    } catch (Exception e) {
                        System.out.println("Exception caught: " + e.getMessage());
                    }
                    System.out.println("------------------------------");
                    System.out.println("Transaksi input pesanan ");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Pesanan :");
                    System.out.println("1");
                    System.out.println("Pesanan : ");
                    System.out.println("Nasi Rendang");
                    System.out.println("Harga : ");
                    System.out.println("25000");

                    int kodePesanan = 1;
                    String pesanan = "Nasi Rendang";
                    int Harga = 25000;
                    dllpesan.addLast(kodePesanan, pesanan, Harga);

                    System.out.println("------------------------------");
                    System.out.println("Transaksi input pesanan ");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Pesanan :");
                    System.out.println("2");
                    System.out.println("Pesanan : ");
                    System.out.println("Mie Goreng");
                    System.out.println("Harga : ");
                    System.out.println("15000");

                    kodePesanan = 2;
                    pesanan = "Mie Goreng";
                    Harga = 15000;
                    dllpesan.addLast(kodePesanan, pesanan, Harga);

                    System.out.println("------------------------------");
                    System.out.println("Transaksi input pesanan ");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Pesanan :");
                    System.out.println("3");
                    System.out.println("Pesanan : ");
                    System.out.println("Soto Ayam");
                    System.out.println("Harga : ");
                    System.out.println("15000");

                    kodePesanan = 3;
                    pesanan = "Soto Ayam";
                    Harga = 15000;
                    dllpesan.addLast(kodePesanan, pesanan, Harga);

                    System.out.println("------------------------------");
                    System.out.println("Transaksi input pesanan ");
                    System.out.println("------------------------------");
                    System.out.println("Nomor Pesanan :");
                    System.out.println("4");
                    System.out.println("Pesanan : ");
                    System.out.println("Bulgogi");
                    System.out.println("Harga : ");
                    System.out.println("25000");

                    kodePesanan = 4;
                    pesanan = "Bulgogi";
                    Harga = 25000;
                    dllpesan.addLast(kodePesanan, pesanan, Harga);

                    
                    break;
                case 4:
                    dllpesan.selectionSortDesc();
                    dllpesan.print();
                    break;
                case 5:
                    System.out.println("+++++++++++++++++++++");
                    System.out.println("Total Pendapatan ");
                    System.out.println("+++++++++++++++++++++");
                    dllpesan.hitungTotalPendapatan();
                    break;
                case 6:
                    on = false;
                    break;
                default:
                    System.out.println("Pilihan anda tidak valid");
                    break;
            }

        }

    }
}