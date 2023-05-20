public class App {
    public static void main(String[] args) throws Exception {
    
        tree t1 = new tree();
        t1.insert(new Node(5));
        t1.insert(new Node(4));
        t1.insert(new Node(8));
        t1.insert(new Node(6));
        t1.insert(new Node(1));
        t1.insert(new Node(3));
        t1.insert(new Node(7));
        t1.insert(new Node(9));
        t1.insert(new Node(2));

        t1.display();
    }
}
