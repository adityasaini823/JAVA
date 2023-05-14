
public class DoubleLList {
/**
 * InnerDouble_L_List
 */
public static class node {
    int data;
    node next;
    node prev;
    node(int data){
     this.prev=null;
        this.data=data;
        this.next=null;
    }
}

public static void main(String[] args) {
    node head=new node(10);
     node n=new node(20);
      node n1=new node(30);
       node n2=new node(40);
        node n3=new node(50);
        head.next=n;
        n.prev=head;
        n.next=n1;
        n1.prev=n;
        n1.next=n2;
        n2.prev=n1;
        n2.next=n3;
        n3.prev=n2;
        node curr=head;
        while (curr.next!=null) {
            System.out.println(curr.data);
            curr=curr.next;  
        }     
        while (curr!=null) {
            System.out.println(curr.data);
            curr=curr.prev;
        }

}
    
}