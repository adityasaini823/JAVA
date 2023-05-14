public class deleteNodeAtStart {
public static class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }

}
public static node deletenode(node head) {
    if(head==null){
        return null;
    }
    else{
        head=head.next;
        return head;
    }
}

    public static void main(String[] args) {
        node head=new node(20);
        node n=new node(30);
        node n1=new node(40);
        node n2=new node(50);
        head.next=n;
        n.next=n1;
        n1.next=n2;
        // System.out.println(head.next.next.next.data);
       head=deletenode(head);
       System.out.println(head.data);

    }
    
    
}
