public class Doublelinkedlists {
    BarangRental head;
    int size;

    public Doublelinkedlists() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String noTNKB, String namaKendaraan,String jenisKendaraan,int tahun,int biayaSewa) {
        if (isEmpty()) {
            head = new BarangRental(null, noTNKB, namaKendaraan, jenisKendaraan, tahun,biayaSewa, null);
        } else {
            BarangRental newNode = new BarangRental(null, noTNKB, namaKendaraan, jenisKendaraan, tahun,biayaSewa, head);
            head.prev = newNode;
            head = newNode;
        }
       
        size++;
    }
    public void print() {
        if (!isEmpty()) {
            BarangRental tmp = head;
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Daftar Kendaraan Rental Serba Serbi");
            System.out.println("++++++++++++++++++++++++++++++++++++++++");
            while (tmp != null) {
                System.out.println("|Nomor TNKB\t\t|Nama Kendaraan\t\t|Jenis\t\t|Tahun\t\t|Biaya Sewa Perjam");
                System.out.println( "|"+tmp.noTNKB+"\t\t|"+ tmp.namaKendaraan+"\t\t|"+tmp.jenisKendaraan+"\t\t|"+tmp.tahun+"\t\t|"+tmp.biayaSewa);
                tmp = tmp.next;
            }

        } else {
            System.out.println("Rental kosong Kosong");
        }
      
    }
    public int findIndexByTNKB(String TNKB) {
        BarangRental current = head;
        int index = 0;
        while (current != null) {
            if (current.noTNKB.equals(TNKB)) {
                return index; // TNKB ditemukan, kembalikan indeks
            }
            current = current.next;
            index++;
        }
        return -1; // TNKB tidak ditemukan
    }
    public BarangRental get(int index) {
        BarangRental current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current;
            }
            current = current.next;
            count++;
        }
        return null; 
    }
}
