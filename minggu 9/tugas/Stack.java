package tugas;
public class Stack {
    int size;
    int top;
    Struk data[];

    Stack(int size){
        this.size = size;
        data = new Struk[size];
        top=-1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Struk struk) {
        if (!isFull()) {
            top++;
            data[top] = struk;
        } else {
            System.out.println("Struk penuh");
        }
    }

    public void pop() {
        if (!isEmpty()) {
            Struk removedStruk = data[top];
            top--;
            System.out.println("Data yang dikeluarkan : " + removedStruk.noTransaksi);
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Struk topStruk = data[top];
            System.out.println("===================================");
            System.out.println("          Struk Teratas            ");
            System.out.println("===================================");
            System.out.println("No Transaksi: " + topStruk.noTransaksi);
            System.out.println("Tgl Pembelian: " + topStruk.tglPembelian);
            System.out.println("Jml Barang: " + topStruk.jmlBarang);
            System.out.println("Total Harga: " + topStruk.totalHargaBayar);
            System.out.println("===================================");
        } else {
            System.out.println("Struk  masih kosong");
        }
    }

    public void print() {
        if (!isEmpty()) {
            System.out.println("===================================");
            System.out.println("             DATA STRUK            ");
            System.out.println("===================================");
            for (int i = top; i >= 0; i--) {
                Struk struk = data[i];
                System.out.println("-----------------------------------");
                System.out.println("No Transaksi: " + struk.noTransaksi);
                System.out.println("Tgl Pembelian: " + struk.tglPembelian);
                System.out.println("Jml Barang: " + struk.jmlBarang);
                System.out.println("Total Harga: " + struk.totalHargaBayar);
            }
            System.out.println("===================================");
        }
    }

   
}
