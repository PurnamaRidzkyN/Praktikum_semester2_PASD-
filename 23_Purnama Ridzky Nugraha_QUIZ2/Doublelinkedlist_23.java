import javafx.scene.Node;

public class Doublelinkedlist_23 {
    Node_23 head;
    int size;

    public Doublelinkedlist_23() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }
 
    public void addFirst(int antrian, Pembeli_23 data) {
        if (isEmpty()) {
            head = new Node_23(null, antrian , data, null);
        } else {
            Node_23 newNode = new Node_23(null, antrian , data, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    public void addLast(int antrian, Pembeli_23 data) {
        if (isEmpty()) {
            addFirst( antrian , data);
        } else {
            Node_23 Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Node_23 newNode = new Node_23(Current,  antrian , data, null);
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
            Node_23 tmp = head;
            System.out.println("|No.\t\t |Nama Customer \t\t |No hp");
            while (tmp != null) {
                System.out.println("|"+tmp.antrian+"\t\t |"+tmp.data.namaPembeli+"\t\t\t |"+tmp.data.NoHp);
                tmp = tmp.next;
            }

        } else {
            System.out.println("Antrian Kosong");
        }

    }
    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Film masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
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
        Node_23 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }


    

    
    
}
