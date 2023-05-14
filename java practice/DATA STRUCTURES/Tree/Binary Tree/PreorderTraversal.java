public class PreorderTraversal {
    public static class node{
        int key;
        node left=null;
        node right=null;
        node (int key){
            this.key=key;
        }
    }
    public static void traverse(node root) {
        if(root!=null){
            System.out.println(root.key);
        traverse(root.left);
        traverse(root.right);
        // System.out.println(root.key);
        }
    }
public static void main(String[] args) {
node root=new node(10);
node n1=new node(20);
node n2=new node(30);
node n3=new node(40);
node n4=new node(50);
root.left=n1;
root.right=n2;
n1.left=n3;
n1.right=n4;

traverse(root);

    
}   
}

