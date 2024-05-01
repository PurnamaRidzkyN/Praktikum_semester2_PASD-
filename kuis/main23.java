import java.util.Scanner;

public class main23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisa;

        System.out.println("Selamat datang di ");
        System.out.print("Masukan banyak obat: ");
        int banyakObat23 = input.nextInt();
        obat23[] obat23 = new obat23[banyakObat23];

        // memasukan data tentang obat
        for (int i = 0; i < obat23.length; i++) {
            System.out.println("masukan nama obat: ");
            String nama23 = input.next();
            System.out.println("masukan kategori obat: ");
            String kategori23 = input.next();
            System.out.println("masukan stok obat : ");
            int stok23 = input.nextInt();
            System.out.println("masukan jumlah yang terjual : ");
            int jumlah23 = input.nextInt();

            obat23[i] = new obat23(nama23, kategori23, stok23, jumlah23);
        }

        // menampilkan data tentang obat
        System.out.println("=================================");
        for (int i = 0; i < obat23.length; i++) {
            System.out.println("Data obat ke-" + (i + 1));
            obat23[i].tampil();
        }

        System.out.println("=================================");

        // menampilkan sisa tentang obat
        for (int i = 0; i < obat23.length; i++) {
            sisa = obat23[i].hitungSisa();
            System.out.println("Sisa obat ke-" + (i + 1) + " adalah : " + sisa);
            obat23[i].stok = sisa;
        }

        // mencari obat paling laku
        System.out.println("=================================");

        int indeksLaku23 = 0;
        int jumlahLaku23 = obat23[0].jumlah;

        for (int i = 1; i < obat23.length; i++) {
            if (obat23[i].jumlah > jumlahLaku23) {
                jumlahLaku23 = obat23[i].jumlah;
                indeksLaku23 = i;
            }
        }
        obat23[indeksLaku23].cariObatPalingLaku(jumlahLaku23);

        int[] indeksObatlaku23 = new int[obat23.length];

        for (int i = 0; i < indeksObatlaku23.length; i++) {
            indeksObatlaku23[i] = i;
        }

        System.out.println("=================================");

        // menampilkan data secara ascending dengan bubleshort
        for (int i = 0; i < obat23.length - 1; i++) {
            for (int j = 0; j < obat23.length - i - 1; j++) {
                if (obat23[indeksObatlaku23[j]].stok > obat23[indeksObatlaku23[j + 1]].stok) {
                    // Tukar posisi indeksObatlaku jika stoknya lebih besar
                    int temp = indeksObatlaku23[j];
                    indeksObatlaku23[j] = indeksObatlaku23[j + 1];
                    indeksObatlaku23[j + 1] = temp;
                }
            }
        }

        // Menampilkan daftar obat setelah diurutkan
        for (int i = 0; i < obat23.length; i++) {
            obat23[indeksObatlaku23[i]].daftarObat();
        }

    }
}
