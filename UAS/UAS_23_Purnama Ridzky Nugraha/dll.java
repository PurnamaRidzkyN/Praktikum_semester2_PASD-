public class dll {
        TransaksiRental head;
        int size;

        public dll() {
            head = null;
            size = 0;
    
        }
    
        public boolean isEmpty() {
            return head == null;
        }
    
        public void addFirst(int kodetransaksi, String namapeminjam,int lamaPinjam,double totalBiaya,BarangRental br) {
            if (isEmpty()) {
                head = new TransaksiRental(null, kodetransaksi, namapeminjam, lamaPinjam,totalBiaya,br, null);
            } else {
                TransaksiRental newTransaksiRental = new TransaksiRental(null, kodetransaksi, namapeminjam, lamaPinjam,totalBiaya,br, head);
                head.prev = newTransaksiRental;
                head = newTransaksiRental;
            }
           
            size++;
        }
        public void print() {
            if (!isEmpty()) {
                TransaksiRental tmp = head;
                while (tmp != null) {
                    System.out.println("|Kode\t\t|Nomor TNKB\t\t|Nama Barang\t\t|Nama Peminjam\t\t|Lama Pinjam\t\t|Total Biaya");
                    System.out.println( "|"+tmp.kodeTransaksi+"\t\t|"+tmp.br.noTNKB+"\t\t|"+ tmp.br.namaKendaraan+"\t\t|"+tmp.namaPeminjam+"\t\t|"+tmp.lamaPinjam+"\t\t|"+tmp.totalBiaya);
                    tmp = tmp.next;
                }
    
            } else {
                System.out.println("Rental kosong Kosong");
            }
          
        }
        public void sortByTNKB() {
            if (size > 1) {
                boolean wasChanged;
    
                do {
                    TransaksiRental current = head;
                    TransaksiRental previous = null;
                    TransaksiRental next = head.next;
                    wasChanged = false;
    
                    while (next != null) {
                        if (current.br.noTNKB.compareTo(next.br.noTNKB) > 0) {
                            wasChanged = true;
    
                            if (previous != null) {
                                TransaksiRental sig = next.next;
    
                                previous.next = next;
                                next.next = current;
                                current.next = sig;
                            } else {
                                TransaksiRental sig = next.next;
    
                                head = next;
                                next.next = current;
                                current.next = sig;
                            }
    
                            previous = next;
                            next = current.next;
                        } else {
                            previous = current;
                            current = next;
                            next = next.next;
                        }
                    }
                } while (wasChanged);
            }
        }
    
    
}
