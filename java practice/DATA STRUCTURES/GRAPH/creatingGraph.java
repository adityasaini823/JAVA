// package GRAPH;
import java.lang.reflect.Array;
import java.util.ArrayList;

public  class creatingGraph {
/**
 * edge
 * 
 */
public static class edge {
int src;
int dest;
int weight;
edge(int src,int dest,int weight){
    this.src=src;
    this.dest=dest;
    this.weight=weight;
}

    
}
    public static void main(String[] args) {
/*  example graph        
        (5)
    0 --------- 1
               / \
           (1)/   \(3)  
             /     \
            2 ----- 3   
            |   (1) 
        (2) |
            |
            4  
 */
        int V=5;
        ArrayList<edge> graph[] = new ArrayList[V];
        for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
        } 
        //0 vertex
        graph[0].add(new edge(0, 1, 5));
        //1 vertex
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));
        //2 vertex
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3,1 ));
        graph[2].add(new edge(2, 4, 2));
        //3  vertex
        graph[3].add(new edge(3, 1, 3));
        graph[3].add(new edge(3, 2, 1));
        //4 vertex
        graph[4].add(new edge(4, 2, 2));

        // printing neighbours of 2nd node

        for(int i=0;i<graph[2].size();i++){
            System.out.println(graph[2].get(i).dest);
        }
    }
}
