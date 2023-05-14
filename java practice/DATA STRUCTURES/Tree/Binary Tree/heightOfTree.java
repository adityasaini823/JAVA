public class heightOfTree {
    public static class node{
        int key;
        node left=null;
        node right=null;
        node (int key){
            this.key=key;
        }
    }
    public static int height(node root) {
        if(root==null){
        return 0;
        } 
        return Math.max(height(root.left),height(root.right))+1;
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

int h=height(root);
System.out.println(h);

    
}   

    

}
