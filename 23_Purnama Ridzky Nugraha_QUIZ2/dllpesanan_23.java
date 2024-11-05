public class dllpesanan_23 {
    Pesanan_23 head;
    int size;

    public dllpesanan_23() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }
 
    public void addFirst(int kodePesanan, String namaPesanan , int harga) {
        if (isEmpty()) {
            head = new Pesanan_23(null, kodePesanan , namaPesanan, harga, null);
        } else {
            Pesanan_23 newNode = new Pesanan_23(null, kodePesanan , namaPesanan, harga, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int kodePesanan, String namaPesanan , int harga) {
        if (isEmpty()) {
            addFirst( kodePesanan , namaPesanan, harga);
        } else {
            Pesanan_23 Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Pesanan_23 newNode = new Pesanan_23(Current,  kodePesanan , namaPesanan, harga, null);
            Current.next = newNode;
            size++;
        }
    }


    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Pesanan_23 tmp = head;
            System.out.println("|No.\t\t |Nama Pesanan \t\t |Harga");
            while (tmp != null) {
                
                System.out.println("|"+tmp.kodePesanan+"\t\t |"+tmp.namaPesanan+"\t\t |"+tmp.harga);
                tmp = tmp.next;
            }

        } else {
            System.out.println("Antrian Kosong");
        }

    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Pesanan_23 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }


    
    public void selectionSortDesc() {
        if (head == null) {
            return;
        }
        Pesanan_23 current = head;
        while (current != null) {
            Pesanan_23 maxNode = current;
            Pesanan_23 temp = current.next;
            while (temp != null) {
                if (temp.namaPesanan.compareTo(maxNode.namaPesanan) > 0) {
                    maxNode = temp;
                }
                temp = temp.next;
            }
            
            int tempKode = current.kodePesanan;
            String tempNama = current.namaPesanan;
            int tempHarga = current.harga;
    
            current.kodePesanan = maxNode.kodePesanan;
            current.namaPesanan = maxNode.namaPesanan;
            current.harga = maxNode.harga;
    
            maxNode.kodePesanan = tempKode;
            maxNode.namaPesanan = tempNama;
            maxNode.harga = tempHarga;
    
            current = current.next;
        }
    }
    public void hitungTotalPendapatan() {
        if (!isEmpty()) {
            Pesanan_23 tmp = head;
            int totalPendapatan = 0;
            while (tmp != null) {
                totalPendapatan += tmp.harga;
                tmp = tmp.next;
            }
            System.out.println("Pendapatan Hari ini : " + totalPendapatan);
        } else {
            System.out.println("Antrian kosong, tidak ada pendapatan!");
        }
    }
}
