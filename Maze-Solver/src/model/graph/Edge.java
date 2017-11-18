package model.graph;

/**
 * Class to represent an edge
 * @author Shironeko
 */
public class Edge {
    
    public int dst;
    public double weigth;
    
    /**
     * Create an edge
     * @param dst Target vertex
     * @param weigth Edge weitght
     */
    public Edge (int dst, double weigth){
        this.dst = dst;
        this.weigth = weigth;
    }
}
