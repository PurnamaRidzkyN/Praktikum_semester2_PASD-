package tugas_film;

public class Node {
    String id;
    String judul;
    double rating;
    Node prev, next;

    Node(Node prev, String id, String judul, double rating, Node next) {
        this.prev = prev;
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.next = next;
    }

}
