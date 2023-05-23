import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        
        graph test = new graph();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("enter the number of islands");
        int n = keyboard.nextInt();

        System.out.println("enter the number of one way bridges");
        int m = keyboard.nextInt();

        System.out.println("enter the the index u intially on");
        int r = keyboard.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("start: ");
            vertex start = test.addVertex(keyboard.nextInt());
            System.out.print("end: ");
            vertex end = test.addVertex(keyboard.nextInt());
            test.addEdge(start, end);
        }
    }
}
