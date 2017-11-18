package model.graph;

import java.util.List;

/**
 * Class to represent a vertex of the graph
 * @author Shironeko
 */
public class Node {
    public byte color;
    public int x, y, pos, parent;      
    public double distance, heuristic;
    public List<Edge> adjancency;

    public Node(int x, int y, int pos) {
        this.x = x;
        this.y = y;
        this.pos = pos;
    }
}
