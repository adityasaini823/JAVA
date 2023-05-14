public class KthHeightofTree {
    public static class node {
        int key;
        node left=null;
        node right=null;
        node(int key){
        this.key=key;
        }    
    }
    public static void printkth(node root,int n) {
        if(root==null)
            return;
        if (n==0) {
            System.out.print(root.key+" ");
            
        }
        else{
        printkth(root.left, n-1);
        printkth(root.right, n-1);
        }
    }
    public static void main(String[] args) {
        node root=new node(10);
        node n1=new node(20);
        node n2=new node(30);
        node n3=new node(40);
        node n4=new node(50);
        node n5=new node(70);
        node n6=new node(80);
        root.left=n1;
        root.right=n2;
        n1.left=n3;
        n1.right=n4;
        n2.right=n5;
        n5.right=n6;
        printkth(root,3);
        
    }
    
}
