package Praktikum09;

public class LinkedList {
    Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            System.out.print("Isi linked list: ");
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print((currentNode.data + "\t"));
                currentNode = currentNode.next;
            }
            System.out.println("");

        } else {
            System.out.println("Linked list kosong ");
        }
    }

    public void addFirst(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int input) {
        Node newNode = new Node(input, null);
        if (isEmpty()) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void insertAfter(int key, int input) {
        Node newNode = new Node(input, null);
        if (!isEmpty()) {
            Node currentNode = head;
            do {
                if (currentNode.data == key) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int getData(int index) {
        if (index < 0 || index >= size()) {
            System.out.println("Indeks diluar rentang linked list.");
            return -1;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Indeks diluar rentang linked list.");
            return -1;
        }
        return currentNode.data;
    }

    public int indexOf(int key) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
            index++;
        }
        if (currentNode == null) {
            return -1;
        } else {
            return index;
        }

    }

    public void removeFirst() {
        if (!isEmpty()) {
            head = head.next;
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosng");
        } else if (head.next == null) {
            head = null;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                if (currentNode.next.next == null) {
                    currentNode.next = null;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void remove(int key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (head.data == key) {
            removeFirst();
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                if (currentNode.next.data == key) {
                    currentNode.next = currentNode.next.next;
                    break;
                }
                currentNode = currentNode.next;
            }
        }
    }

    public void insertAt(int index, int key) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks diluar rentang linked list.");
            return;
        }

        Node newNode = new Node(key, null);
        if (isEmpty() || index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void insertBefore(int key, int input) {
        Node newNode = new Node(input, null);
        if (!isEmpty()) {
            Node currentNode = head;
            if (head == null) {
                System.out.println("Linked list kosong");
                return;
            }

            if (head.data == key) { // Insert before head
                newNode.next = head;
                head = newNode;
                return;
            }
            do {
                if (currentNode.next.data == key && currentNode.next != null) {
                    newNode.next = currentNode.next;
                    currentNode.next = newNode;
                    break;
                }
                currentNode = currentNode.next;
            } while (currentNode != null);
        } else {
            System.out.println("Linked list kosong");
        }
    }
    public void removeAt(int index) {
        if (index < 0 || index > size()) {
            System.out.println("Indeks diluar rentang linked list.");
        }
        if (isEmpty()) {
            System.out.println("Linked list kosong");
        } else if (0 == index) {
            removeFirst();
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            remove(currentNode.data);
        }
    }

}
