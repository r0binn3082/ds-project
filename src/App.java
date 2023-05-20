import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {

        int value = 0;
        Scanner keyboard = new Scanner(System.in);
        int n = 4;
        tree t1 = new tree();
        double i;

        System.out.println("plaease enter the ratio of redudnacy");
        double x = keyboard.nextDouble();

        System.out.println("enter the values");
        for (i = 0.0; (i)/n <= x; i++) {
            value = keyboard.nextInt();
            t1.insert(new Node(value));
            if (value == -1) {
                System.out.println("ratio ="+ (int) i + "/" + n + " = " + i/n );
                System.out.println("only a few repitions");
                break;
            }
        }

        if(value != -1){
            System.out.println("ratio = " + (int) i +"/" + n + " = " + x);
            System.out.println("many repition");
        }
    }
}
