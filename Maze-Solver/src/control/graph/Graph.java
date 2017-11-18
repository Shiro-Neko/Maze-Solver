package control.graph;

import java.util.ArrayList;
import java.util.List;
import model.graph.Edge;
import model.graph.Node;

/**
 * Graph class based on adjancecy list 
 * @author Shironeko
 */
public class Graph {
    public static final byte COLOR_WHITE = 0;
    public static final byte COLOR_GRAY = 1;
    public static final byte COLOR_BLACK = 2;
    
    private int numVertices, numEdges, analVert;
    private long runtime;
    
    private final List<Node> graph;
    
    public Graph(){
        this.numEdges = 0;
        this.numVertices = 0;
        this.graph = new ArrayList<>();
    }
    
    
    /**
     * Add a vertex in graph
     * @param x Coordinate x of the vertex in maze
     * @param y Coordinade y of the vertex in maze
     */
    public void addVertex(int x, int y){
        graph.add(new Node(x, y, numVertices));
        numVertices++;
    }
    
    /**
     * Add an edge between two vertices
     * @param src Source vertex
     * @param dst Target Vertex
     * @param weigth weith of the edge
     */
    public void addEdge(int src, int dst, double weigth){
        graph.get(src).adjancency.add(new Edge(dst, weigth));
        numEdges++;
    }
    
    /**
     * Show the graph in terminal
     * Used only for debug.
     */
    public void showGraph(){
        int numAdj;
        List<Edge>adj;
        
        for (int i = 0; i < numVertices; i++){
            adj = graph.get(i).adjancency;
            numAdj = adj.size();
            
            System.out.printf("| (%d)[%d;%d] |", i, graph.get(i).x, graph.get(i).y);
            for (int j = 0; j < numAdj; j++){
                System.out.printf(" -> (%d)[%d][%d](%.3f)", adj.get(j).dst, graph.get(adj.get(j).dst).x,
                        graph.get(adj.get(j).dst).y, adj.get(j).weigth);
            }
            System.out.println("");
        }
    }
}
