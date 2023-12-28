import java.util.*;

class Edges {
    String destination;
    int weight;

    public Edges(String destination, int weight) {
        this.destination = destination;
        this.weight = weight;
    }
}
public class BfsGraphTranversal {
    private Map<String, List<Edges>> adjacencyList;

    public BfsGraphTranversal() {
        adjacencyList = new HashMap<>();  
}
 // Menambahkan node baru ke graf
 public void addNode(String node) {
    adjacencyList.putIfAbsent(node, new ArrayList<>());
}

// Menambahkan edge berbobot ke graf
public void addEdge(String source, String destination, int weight) {
    // Pastikan node sumber ada dalam adjacency list
    adjacencyList.putIfAbsent(source, new ArrayList<>());

    // Tambahkan edge berbobot
    adjacencyList.get(source).add(new Edges(destination, weight));
}

// Mendapatkan daftar tetangga dan bobot dari node
public List<Edges> getNeighbors(String node) {
    return adjacencyList.getOrDefault(node, Collections.emptyList());
}

// BFS traversal dari node sumber
public void bfsTraversal(String start) {
    Set<String> visited = new HashSet<>();
    Queue<String> queue = new LinkedList<>();

    queue.add(start);
    visited.add(start);

    while (!queue.isEmpty()) {
        String current = queue.poll();
        System.out.print(current + " ");

        // Menambahkan semua tetangga yang belum dikunjungi ke antrian
        for (Edges edge : adjacencyList.getOrDefault(current, Collections.emptyList())) {
            if (!visited.contains(edge.destination)) {
                queue.add(edge.destination);
                visited.add(edge.destination);
                //System.out.print("-> (" + edge.weight + ") " + edge.destination + " ");
            }
        }
    }
    System.out.println();
}

public static void main(String[] args) {
    BfsGraphTranversal graph = new BfsGraphTranversal();
    graph.addNode("A");
    graph.addNode("B");
    graph.addNode("C");
    graph.addNode("D");

    graph.addEdge("A", "B", 5);
    graph.addEdge("A", "C", 3);
    graph.addEdge("B", "C", 2);
    graph.addEdge("C", "D", 4);

    graph.bfsTraversal("A");
}



}