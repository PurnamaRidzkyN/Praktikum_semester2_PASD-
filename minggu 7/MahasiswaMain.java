import java.util.Scanner;

public class MahasiswaMain {

    public static void main(String[] args) {      
        Scanner s = new Scanner(System.in);
        
        
        System.out.print("berapa jumlah mahasiswa : ");
        int jumMhs = s.nextInt();
        
        PencarianMhs data = new PencarianMhs(jumMhs); 
        
        System.out.println("-------------------------------------------------------");
        System.out.println("Masukan data mahasiswa secara urut dari nim ");
        for ( int i = 0; i< jumMhs ; i++){
            System.out.println("-------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();
            System.out.print("Nama\t : ");
            String nama = s.next();
            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);


        }
        data.insertionSortByname();
        System.out.println("----------------------------------------------");
        System.out.println("Data keseluruhan Mahasiswa : ");
        data.tampil();
        

        while (true) {
            System.out.println("______________________________________________");
            System.out.println("Mau mencari data dengan apa?");
            System.out.println("1.Nim");
            System.out.println("2.Nama");
            System.out.println("3.Keluar");
            System.out.println("Masukan pilihan (1/2) : ");
            int pil = s.nextInt();
            int posisi;
            if (pil == 1){
                System.out.println("______________________________________________");
                System.out.println("Pencarian Data : ");
                System.out.println("Masukan Nim Mahasiswa yang dicari: ");
                System.out.println("NIm : ");
                int cari = s.nextInt();
                System.out.println("menggunakan sequential Search");
                posisi = data.FindSeqSearch(cari);
                data.TampilData( posisi);
                
            }else if (pil == 2){
                System.out.println("______________________________________________");
                System.out.println("Masukan nama yang mau di cari "  );
                String Carinama = s.next();
                System.out.println("Menggunaka Binary Search");
                posisi = data.findBinarySearch(Carinama);           
                data.TampilData( posisi);
            }else if (pil ==3){
                break;
            }
        }
     
        

        
    }
        
}