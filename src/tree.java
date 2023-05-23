/*
 * insert
 * insertHelper
 * display
*/
public class tree {

    Node root;

    public void insert(Node node) {
        root = insertHelper(root , node);
    }
    private Node insertHelper(Node root, Node node) { 
        if(root == null) {
            root = node;
            return node ;
        }
        else if (node.data < root.data){
            root.left= insertHelper(root.left, node);
        }        
        else{
            root.right= insertHelper(root.right, node);
        }
        return root ;
    }

    public void display(){
        displayHelper(root);
    }
    private void displayHelper(Node root) {
        if( root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
}
