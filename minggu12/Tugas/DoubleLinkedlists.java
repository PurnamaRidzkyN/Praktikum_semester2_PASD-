package Tugas;

public class DoubleLinkedlists {
    Node front, rear;
    int size;
    public DoubleLinkedlists(){
        front = rear = null;
        size = 0;

    }
    public void enqueue(String number, String name) {
        Node newNode = new Node(number, name);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            newNode.prev = rear;
            rear = newNode;
        }
        size++;
    }

    public Node dequeue() {
        if (front == null) {
            System.out.println("Tidak ada pasien");
            return null;
        }
        Node temp = front;
        System.out.println(front.NP + " telah selesai divaksinasi");
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            rear = null;
        }

        size--;
        return temp;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        Node current = front;
        System.out.println("Daftar Penerima Vaksin:");
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("|No.\t|Nama\t|");
        System.out.println("+++++++++++++++++++++++++++++++");
        while (current != null) {
            System.out.println("|" + current.NA + "\t|" + current.NP + "\t|");
            current = current.next;
        }
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("Sisa Antrian: " + size);
    }

}

