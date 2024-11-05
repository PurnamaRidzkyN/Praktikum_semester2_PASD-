import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList list[];

    public Graph ( int vertex){
        this.vertex = vertex;
        list = new LinkedList [vertex];
        for ( int i = 0; i< vertex; i++){
            list[i] = new LinkedList();
        }

    }
    public void addEdge(Scanner sc) {
    System.out.println("Masukkan source vertex: ");
    int source = sc.nextInt();
    System.out.println("Masukkan destination vertex: ");
    int destination = sc.nextInt();
    list[source].addFirst(destination);
    list[destination].addFirst(source);
}
    
    public void degree(int source) throws Exception {
        System.out.println("degre vertex "+ source + " : "+list[source].size());
        int k, totalIn = 0,totalOut = 0;
        // indegre
        for (int i = 0; i<vertex; i++){
            for( int j = 0; j< list[i].size(); j++){
                if (list[i].get(j)==source){
                ++totalIn;
                }
            }
        // outdegre
        for(k = 0; k< list[source].size();k++){
            list[source].get(k);
        }
        totalOut = k;    
        }
        System.out.println("Indegree dari vertex "+source+" : "+totalIn );
        System.out.println("Outdegree dari vertex "+ source+" : "+totalOut);
        System.out.println("degree vertex "+ source +" : "+(totalIn+totalOut));
    }
    public void removeEdge(int source, int destination) throws Exception {
        if (source < 0 || source >= vertex || destination < 0 || destination >= vertex) {
            throw new Exception("Invalid vertex");
        }
        list[source].remove((Integer) destination);
    }
    public void removeAllEdges(){
        for(int i=0;i<vertex; i++){
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }
    public void printGraph()throws Exception{
        for( int i=0; i<vertex;i++){
            if (list[i].size()>0) {
                System.out.print ("Vertex "+i+" terhubung dengan: ");
                for(int j = 0; j<list[i].size();j++){
                    System.out.print(list[i].get(j)+" ");
                }
                System.out.println(" ");    
            }
            
        }
    }


    // tugas 
    public boolean graphType() {
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                int dest = list[i].get(j);
                boolean found = false;
                for (int k = 0; k < list[dest].size(); k++) {
                    if (list[dest].get(k) == i) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return true; // Directed graph
                }
            }
        }
        return false; // Undirected graph
    }
    
    
}