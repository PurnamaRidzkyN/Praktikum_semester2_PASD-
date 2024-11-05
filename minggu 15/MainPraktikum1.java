import java.util.Scanner;

public class MainPraktikum1 {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(6);
        Scanner sc = new Scanner(System.in);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.addEdge(sc);
        graph.printGraph();
        graph.degree(2);
        graph.removeEdge(1, 2);
        graph.printGraph();
    }
}
