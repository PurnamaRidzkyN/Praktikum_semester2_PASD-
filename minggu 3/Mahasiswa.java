public class Mahasiswa {
        private String nama;
        private String nim;
        private char jenisKelamin;
        private double ipk;
    
        // Konstruktor
        public Mahasiswa(String nama, String nim, char jenisKelamin, double ipk) {
            this.nama = nama;
            this.nim = nim;
            this.jenisKelamin = jenisKelamin;
            this.ipk = ipk;
        }
    
        // Method untuk mencetak info mahasiswa
        public void cetakInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("Jenis kelamin: " + jenisKelamin);
            System.out.println("Nilai IPK: " + ipk);
        }
    
        // Getter IPK
        public double getIpk() {
            return ipk;
        }
    
}
