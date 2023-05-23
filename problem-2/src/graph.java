import java.util.ArrayList;
public class graph {

    private ArrayList<vertex> vertices;
    
    graph(){
        this.vertices = new ArrayList<vertex>();
    }

    public vertex addVertex(int data) {
        
        vertex newverVertex = new vertex(data);
        this.vertices.add(newverVertex);
        
        return newverVertex;
    }

    public void addEdge(vertex start , vertex end ){
        start.addEdge(end);
    }

    /* 
    public void removeEdge(vertex start, vertex end) {
        start.removeEdge(end);
    }
    */

    public void removeVertix(vertex vertex) {
        this.vertices.remove(vertex);
    }

    public vertex getVertexByValue(int value) {
		for(vertex v: this.vertices) { 
			if (v.getData() == value) {
				return v;
			}
		}
        return null;    
    }

    public void print() {
		for(vertex v: this.vertices) {
			v.print();
		}
	}

    public void treversal(vertex start ) {
        for (edge e : start.getEdge()) {
            vertex neighbor = e.getEnd();
            if(!vistid.contains(neighbor)){
                vistid.add(neighbor);
                treversal(neighbor, vistid);
            }
        }
    }
    public static void main(String[] args) {
        graph try1  = new graph();
        vertex a = try1.addVertex(1);
        vertex b = try1.addVertex(5);

        try1.addEdge(a, b);
        try1.print();
        
    }
}
