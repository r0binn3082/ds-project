/*
 * insert
 * wheretoinsert
 * display
*/
public class tree {

    Node root;

    public void insert(Node node) {
        root = whereToInsert(root , node);
    }
    public Node whereToInsert(Node root, Node node) { 
        if(root == null) {
            root = node;
            return node ;
        }
        else if (node.data < root.data){
            root.left= whereToInsert(root.left, node);
        }        
        else{
            root.right= whereToInsert(root.right, node);
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
