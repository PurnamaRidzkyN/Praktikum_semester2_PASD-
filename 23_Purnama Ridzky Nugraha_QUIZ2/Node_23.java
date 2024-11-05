public class Node_23 {
    int antrian ;
    
    Pembeli_23 data;
    Node_23 prev, next;

    Node_23(Node_23 prev,int antrian, Pembeli_23 data, Node_23 next) {
        this.prev = prev;
        this.antrian = antrian;
        
        this.data = data;
        this.next = next;
    }
       
}
