import java.util.Scanner;

public class PengirimanProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Pengiriman!");
        System.out.println("1. Pegawai");
        System.out.println("2. Pelanggan");
        System.out.print("Pilih opsi (1/2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int pegawaiLength;
                System.out.print("Masukkan jumlah paket yang akan dikirim oleh Pegawai: ");
                pegawaiLength = sc.nextInt();
                pegawai[] jumlahPaketPegawai = new pegawai[pegawaiLength]; 
                for (int i = 0; i < jumlahPaketPegawai.length; i++) {
                    System.out.println("\nMasukkan data paket ke-" + (i + 1) + " yang akan dikirim oleh Pegawai");
                
                    // Input data paket dari pengguna
                    System.out.print("Masukkan berat paket per kg: ");
                    double datapaket = sc.nextDouble();
                    sc.nextLine(); // Consuming the newline character
                    System.out.print("Masukkan jarak pengiriman per km: ");
                    double datapengiriman = sc.nextDouble();
                    sc.nextLine(); // Consuming the newline character
                    System.out.print("Masukkan lokasi pengiriman: ");
                    String lokasi = sc.nextLine();

                    jumlahPaketPegawai[i] = new pegawai(datapaket, datapengiriman, lokasi);

                }
                System.out.println("\nData Paket yang Akan Dikirim oleh Pegawai:");
                for (int i = 0; i < jumlahPaketPegawai.length; i++) {
                    System.out.println("Data paket ke-" + (i + 1) + " yang akan dikirim oleh Pegawai");
                    jumlahPaketPegawai[i].infopaket();
                }
                break;

            case 2:
                System.out.print("Masukkan jumlah paket yang akan dikirim oleh Pelanggan: ");
                pegawaiLength = sc.nextInt();
                pegawai[] jumlahPaketPelanggan = new pegawai[pegawaiLength]; 
                for (int i = 0; i < jumlahPaketPelanggan.length; i++) {
                    System.out.println("\nMasukkan data paket ke-" + (i + 1) + " yang akan dikirim oleh Pelanggan");
                
                    // Input data paket dari pengguna
                    System.out.print("Masukkan berat paket per kg: ");
                    double datapaket = sc.nextDouble();
                    sc.nextLine(); // Consuming the newline character
                    System.out.print("Masukkan jarak pengiriman per km: ");
                    double datapengiriman = sc.nextDouble();
                    sc.nextLine(); // Consuming the newline character
                    System.out.print("Masukkan lokasi pengiriman: ");
                    String lokasi = sc.nextLine();

                    jumlahPaketPelanggan[i] = new pegawai(datapaket, datapengiriman, lokasi);

                }
                System.out.println("\nData Paket yang Akan Dikirim oleh Pelanggan:");
                for (int i = 0; i < jumlahPaketPelanggan.length; i++) {
                    System.out.println("Data paket ke-" + (i + 1) + " yang akan dikirim oleh Pelanggan");
                    jumlahPaketPelanggan[i].infopaket();
                }
                break;

            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}