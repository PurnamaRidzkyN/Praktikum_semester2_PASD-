public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }


    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.data + " ");
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(node.data + " ");
            traverseInOrder(node.right);
        }
    }
    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
    
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
    
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
    
        return successor;
    }
    void delete(int data){
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        
        // find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChild = false;
        
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else {
            // if there is no child, simply delete it
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            } else if (current.left == null) { // if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            } else if (current.right == null) { // if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            } else { // if there are 2 children
                Node successor = getSuccessor(current);
        
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
        
    }
    void add(int data) {
        root = addRecursive(root, data);
    }

    private Node addRecursive(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }

        if (data < current.data) {
            current.left = addRecursive(current.left, data);
        } else if (data > current.data) {
            current.right = addRecursive(current.right, data);
        }

        return current;
    }
    // Menampilkan nilai paling kecil
    int findMin() {
        return findMinRecursive(root);
    }

    private int findMinRecursive(Node current) {
        return current.left == null ? current.data : findMinRecursive(current.left);
    }

    // Menampilkan nilai paling besar
    int findMax() {
        return findMaxRecursive(root);
    }

    private int findMaxRecursive(Node current) {
        return current.right == null ? current.data : findMaxRecursive(current.right);
    }

    // Menampilkan data yang ada di leaf
    void printLeaves() {
        printLeavesRecursive(root);
    }

    private void printLeavesRecursive(Node node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(node.data + " ");
            }
            printLeavesRecursive(node.left);
            printLeavesRecursive(node.right);
        }
    }

    // Menampilkan jumlah leaf dalam tree
    int countLeaves() {
        return countLeavesRecursive(root);
    }

    private int countLeavesRecursive(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeavesRecursive(node.left) + countLeavesRecursive(node.right);
        }
    }
    
}