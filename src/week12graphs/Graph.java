package week12graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph <N> {
    private HashMap<N, ArrayList<N>> adjacencyList;

    public Graph(){
        this.adjacencyList=new HashMap<>();
    }
    //add methods to add in the graph
    public void addNode(N node){
        if (!this.adjacencyList.containsKey(node)) {
            this.adjacencyList.put(node, new ArrayList<>());
        }
    }
    public void addEdge(N from,N to){
        this.addNode(from);
        this.addNode(to);
        this.adjacencyList.get(from).add(to);
    }
    public String toString(){
        String out="";
        for (N node : this.adjacencyList.keySet()){
            out+=node+": ";
            for (N destination : this.adjacencyList.get(node)){
                out+=destination+" ";
            }
            out+="\n";
        }
        return out;
    }

    public static void main(String[] args) {
        Graph<String> graph=new Graph<>();
        graph.addEdge("A","B");
        graph.addEdge("B","A");
        graph.addEdge("A","C");
        graph.addEdge("A","E");
        graph.addEdge("B","C");
        graph.addEdge("B","E");
        graph.addEdge("C","D");
        graph.addEdge("E","D");
        graph.addEdge("D","F");
        graph.addEdge("F","G");
        graph.addEdge("G","H");
        System.out.println(graph);
    }
}
