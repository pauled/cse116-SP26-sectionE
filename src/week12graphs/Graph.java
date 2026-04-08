package week12graphs;

import java.util.ArrayList;
import java.util.Arrays;
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
    public boolean validPath(ArrayList<N> path){
        //look for invalid pair
        for (int x=0;x<path.size()-1;x++){
            N from=path.get(x);
            N to=path.get(x+1);
            if (! connected(from,to)){
                return false;
            }
        }
        return true;
    }
    public boolean connected(N from,N to){
        ArrayList<N> destinations=this.adjacencyList.get(from);
        for (N dest : destinations){
            if (dest.equals(to)){
                return true;
            }
        }
        return false;
    }
    public ArrayList<N> mostIncoming(){
        HashMap<N,Integer> counts=new HashMap<>();
        for (N from : this.adjacencyList.keySet()){
            ArrayList<N> destinations=this.adjacencyList.get(from);
            for (N to : destinations){
                if (counts.containsKey(to)){
                    counts.put(to,counts.get(to)+1);
                } else {
                    counts.put(to,1);
                }
            }
        }
        ArrayList<N> out=new ArrayList<>();
        int most=0;
        for (N key : counts.keySet()){
            Integer temp=counts.get(key);
            if (temp>most){
                most=temp;
                out=new ArrayList<>();
            }
            if (temp==most){
                out.add(key);
            }
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
        System.out.println(graph.mostIncoming());

        ArrayList<String> path=new ArrayList<>(Arrays.asList("A","B","E"));
        System.out.println(graph.validPath(path));

        ArrayList<String> path2=new ArrayList<>(Arrays.asList("A","B","E","D","F","G"));
        System.out.println(graph.validPath(path2));

        ArrayList<String> path3=new ArrayList<>(Arrays.asList("F","B","E"));
        System.out.println(graph.validPath(path3));

        ArrayList<String> path4=new ArrayList<>(Arrays.asList("A","B","E","D","F","G","B"));
        System.out.println(graph.validPath(path4));
    }
}
