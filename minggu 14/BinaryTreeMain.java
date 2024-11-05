public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Menambahkan node ke dalam tree
        tree.add(6);
        tree.add(4);
        tree.add(8);
        tree.add(3);
        tree.add(5);
        tree.add(7);
        tree.add(9);

        // Menampilkan tree dalam berbagai urutan traversal
        System.out.println("Pre-order traversal:");
        tree.traversePreOrder(tree.root);
        System.out.println();

        System.out.println("Post-order traversal:");
        tree.traversePostOrder(tree.root);
        System.out.println();

        System.out.println("In-order traversal:");
        tree.traverseInOrder(tree.root);
        System.out.println();

        // Menampilkan nilai paling kecil dan paling besar
        System.out.println("Nilai terkecil: " + tree.findMin());
        System.out.println("Nilai terbesar: " + tree.findMax());

        // Menampilkan data yang ada di leaf
        System.out.println("Leaf nodes:");
        tree.printLeaves();
        System.out.println();

        // Menampilkan jumlah leaf dalam tree
        System.out.println("Jumlah leaf: " + tree.countLeaves());

        // Menghapus node
        System.out.println("Menghapus nilai 8");
        tree.delete(8);
        System.out.println("In-order traversal setelah menghapus 8:");
        tree.traverseInOrder(tree.root);
        System.out.println();
        System.out.println("Jumlah leaf: " + tree.countLeaves());

    }
}
