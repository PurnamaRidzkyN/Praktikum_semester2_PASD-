package Praktikum09;
public class SLLMain {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.print();
        myLinkedList.addFirst(800);
        myLinkedList.print();
        myLinkedList.addFirst(700);
        myLinkedList.print();
        myLinkedList.addLast(500);
        myLinkedList.print();
        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        System.out.println("Data pada index ke-1: "+myLinkedList.getData(1));
        System.out.println("Data pada index ke-1: "+myLinkedList.getData(5));
        System.out.println("Data 300 Berada pada index ke : "+ myLinkedList.indexOf(300));
        myLinkedList.print();
        myLinkedList.remove(300);
        myLinkedList.print();
        myLinkedList.removeFirst();
        myLinkedList.print();
        myLinkedList.removeLast();
        myLinkedList.print();
        myLinkedList.insertBefore(800, 2);
        myLinkedList.insertAfter(800, 5);
        myLinkedList.insertBefore(5, 324);
        myLinkedList.print();
        myLinkedList.insertAt(2,900);
        myLinkedList.print();
        myLinkedList.removeAt(3);
        myLinkedList.print();
        
    }
}
