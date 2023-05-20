import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        


        Scanner keyboard = new Scanner(System.in);
        int n = 4;
        tree t1 = new tree();

        System.out.println("plaease enter the ratio of redudnacy");
        double x = keyboard.nextDouble();

        System.out.println("enter the values");
        for (double i = 0.0; (i)/n != x; i++) {
            t1.insert(new Node(keyboard.nextInt()));
        }

        
    }
}
