import java.util.Scanner;

public class RentalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Doublelinkedlists dll = new Doublelinkedlists();
        dll d = new dll();
        dll.addFirst("S4567YV", "Honda Beat", "Motor", 2017, 10000);
        dll.addFirst("N4511VS", "Honda Vario", "Motor", 2018, 10000);
        dll.addFirst("N1453AA", "Toyota Yaris", "Motor", 2022, 30000);
        dll.addFirst("AB4321A", "Toyota Innova", "Mobil", 2019, 60000);
        dll.addFirst("B1234AG", "Toyota Avanza", "Mobil", 2021, 25000);
        boolean lever = true;
        int kode = 1;
        while (lever) {
            System.out.println("Menu");
            System.out.println("1. Daftar kendaraan ");
            System.out.println("2. Peminjaman");
            System.out.println("3. Tampilkan seluruh dllansaksi");
            System.out.println("4. Urutkan dllansaksi urut no TNKB");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5) : ");
            int pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    dll.print();
                    break;
                case 2:
                    System.out.println("-----------------------");
                    System.out.println("Masukan Data Peminjaman");
                    System.out.println("-----------------------");
                    System.out.print("Masukan Nama Peminjam : ");
                    String nama = sc.next();
                    System.out.print("Masukan Nomor TNKB : ");
                    String TNKB = sc.nextLine().trim(); 
                    sc.nextLine();
                int index = dll.findIndexByTNKB(TNKB);
                
                if (index != -1) {
                    BarangRental br = dll.get(index);
                    
                    System.out.print("Lama Pinjam : ");
                    int pinjam = sc.nextInt();
                    sc.nextLine();
                    
                    System.out.print("Apakah Member (ya/tidak): ");
                    String member = sc.nextLine();
                    
                    double totalBiaya = pinjam * br.biayaSewa;
                    
                    if (member.equalsIgnoreCase("ya")) {
                        totalBiaya -= 25000;
                    }
                    
                    if (pinjam >= 48 && pinjam <= 78) {
                        totalBiaya *= 0.9;
                    } else if (pinjam > 78) {
                        totalBiaya *= 0.8;
                    }

                        System.out.println(
                                "|Kode\t|Nomor TNKB\t|Nama Barang\t|Nama Peminjam\t|Lama Pinjam\t|Total Biaya");
                        System.out.println("|" + kode + "\t|" + br.noTNKB + "\t|" + br.namaKendaraan + "\t|" + nama
                                + "\t|" + pinjam + "\t|" + totalBiaya);

                        d.addFirst(kode, nama, pinjam, totalBiaya, br);

                        kode++;
                    } else {
                        System.out.println("Kendaraan dengan TNKB tersebut tidak ditemukan.");
                    }
                    break;
                case 3:
                    d.print();
                    break;
                case 4:
                    d.sortByTNKB();
                    d.print();
                    break;
                case 5:
                    lever = false;
                    break;
                default:
                    break;
            }
        }
    }
}
