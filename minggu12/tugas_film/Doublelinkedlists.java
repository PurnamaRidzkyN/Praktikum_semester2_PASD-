package tugas_film;

public class Doublelinkedlists {
    Node head;
    int size;

    public Doublelinkedlists() {
        head = null;
        size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String id, String judul, double rating) {
        if (isEmpty()) {
            head = new Node(null, id, judul, rating, null);
        } else {
            Node newNode = new Node(null, id, judul, rating, head);
            head.prev = newNode;
            head = newNode;
        }
       
        size++;
    }

    public void addLast(String id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node Current = head;
            while (Current.next != null) {
                Current = Current.next;
            }
            Node newNode = new Node(Current, id, judul, rating, null);
            Current.next = newNode;
            size++;
        }
    }

    public void add(String id, String judul, double rating, int index) throws Exception {
        if (isEmpty()){
            addFirst(id, judul, rating);
        }else if (index<0 || index > size){
            throw new Exception("Nilai indeks di luar batas");
        }else {
            Node current =head;
            int i = 0 ;
            while (i<index) {
                current = current.next;
                i++;
            }if (current.prev == null){
                Node newNode = new Node (null,id, judul, rating,current);
                current.prev = newNode;
                head = newNode;
            }else{
                Node newNode = new Node(current.prev, id, judul, rating, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
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
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID : " + tmp.id);
                System.out.println("\tJudul : " + tmp.judul);
                System.out.println("\tRating : " + tmp.rating);
                tmp = tmp.next;
            }

        } else {
            System.out.println("Film Kosong");
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
            throw new Exception("Film masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(String judul) throws Exception {
        int index = findIndex(judul);
        if (isEmpty()) {
            throw new Exception("Nilai indeks di luar batas");

        } else if (index == 0) {
            removeFirst();
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }

    public int findIndex(String id) {
        if (head == null) {
            return -1;
        }
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.id.equals(id)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public void searchIdFilm(String id) {
        int indek = findIndex(id);
        if (indek == -1) {
            System.out.println("Film tidak ada ");
        } else {
            Node tmp = head;
            for (int i = 0; i <= indek; i++) {
                if (i == indek) {
                    System.out.println("Pencarian ditemukan ");
                    System.out.println("ID : " + tmp.id);
                    System.out.println("\tJudul : " + tmp.judul);
                    System.out.println("\tRating : " + tmp.rating);
                }
                tmp = tmp.next;
            }
        }
    }
    public void selectionSortDesc() {
        Node current = head;
        while (current != null) {
            Node maxNode = current;
            Node temp = current.next;
            while (temp != null) {
                if (temp.rating > maxNode.rating) {
                    maxNode = temp;
                }
                temp = temp.next;
            }
            // Tukar data dengan node yang memiliki nilai rating maksimum
            String tempId = current.id;
            String tempJudul = current.judul;
            double tempRating = current.rating;
            current.id = maxNode.id;
            current.judul = maxNode.judul;
            current.rating = maxNode.rating;
            maxNode.id = tempId;
            maxNode.judul = tempJudul;
            maxNode.rating = tempRating;

            current = current.next;
        }
    
    }

}
