import java.util.ArrayList;

public class vertex {
    
    private int data;
    private ArrayList <edge> edge; 

    vertex(int data){
        this.data= data;
        this.edge = new ArrayList<edge>();
    }

    public void  addEdge(vertex end) {
        this.edge.add(new edge(this, end));
    }

    /* 
    public void removeEdge(vertex end) {
        this.edge.removeIf(edge -> edge.getEnd().equals(endVertex));
    }
    */

    public void setData(int data) {
        this.data = data;
    }
    public void setEdge(ArrayList<edge> edge) {
        this.edge = edge;
    }

    public int getData() {
        return data;
    }
    public ArrayList<edge> getEdge() {
        return edge;
    }

    public void print() {
		String message = "";
		
		if (this.edge.size() == 0) {
			System.out.println(this.data + " -->");
			return;
		}
		
		for(int i = 0; i < this.edge.size(); i++) {
			if (i == 0) {
				message += this.edge.get(i).getStart().data + " -->  ";
			}

			message += this.edge.get(i).getEnd().data;

			if (i != this.edge.size() - 1) {
				message += ", ";
			}
		}
		System.out.println(message);
	}

}
