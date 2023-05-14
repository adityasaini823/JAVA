public class insertionAtEndLinkedList {
    /**
     * InnerinsertionAtEndLinkedList
     */
    public static class node {
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }    
    }
public static node insert(node n,int x) {
    node nod=new node(x);
    node temp=n;
    if(n==null)
        return nod;
    // System.out.println(temp.data);
    while(temp.next!=null){
        // System.out.println(temp.data);
        temp=temp.next;
        
    }
   // System.out.println(temp.data+" "+temp.next);
    temp.next=nod;
    System.out.println(temp.data);
    return n ;
}
    public static void main(String[] args) {
        node n=new node(10);
        n=insert(n,20);
        System.out.println(n.data+" "+n.next);
        n=insert(n,30);
        System.out.println(n.data+" "+n.next);
        n=insert(n, 40);
        System.out.println(n.data+" "+n.next);
        node curr=n;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
