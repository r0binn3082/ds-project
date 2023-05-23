public class edge {
    
    vertex start;
    vertex end;

    edge(vertex start, vertex end ){
        this.start = start;
        this.end = end;
    }

    public void setEnd(vertex end) {
        this.end = end;
    }
    public void setStart(vertex start) {
        this.start = start;
    }

    public vertex getEnd() {
        return end;
    }
    public vertex getStart() {
        return start;
    }

    
}