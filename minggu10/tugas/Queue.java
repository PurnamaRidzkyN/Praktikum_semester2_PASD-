package tugas;

public class Queue {
    Pasien[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue(int n) {
        max = n;
        antrian = new Pasien[max];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Pasien antri) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        antrian[rear] = antri;
        size++;
    }

    public Pasien dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Pasien depan = antrian[front];
        front = (front + 1) % max;
        size--;
        return depan;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Isi Antrian:");
        for (int i = front; i <= rear; i++) {
            System.out.println(antrian[i]);
        }
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Pasien paling depan: " + antrian[front]);
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Pasien paling belakang: " + antrian[rear]);
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        for (int i = front; i <= rear; i++) {
            if (antrian[i].nama.equals(nama)) {
                System.out.println("Posisi antrian " + nama + ": " + (i - front + 1));
                return;
            }
        }
        System.out.println("Pasien " + nama + " tidak ditemukan dalam antrian.");
    }

    public void daftarPasien() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Pasien:");
        for (int i = front; i <= rear; i++) {
            System.out.println(antrian[i]);
        }
    }
}
