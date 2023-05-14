public class Recursive2Linkedlist {
/**
 * InnerRecursive2Linkedlist
 */
public static class node {
int data;
node next;
node(int data){
    this.data=data;
    this.next=null;
}
    }

public static node reverse(node head,node prev) {
    if(head==null){
        return prev;
    }
    node next=head.next;
    head.next=prev;
     return reverse(next,head);
    
}


public static void main(String[] args) {
node head=new node(10);
node n=new node(20);node n1=new node(30);
node n2=new node(40);
node n3=new node(50);
head.next=n;
n.next=n1;
n1.next=n2;
n2.next=n3;
node prev=null;
head=reverse(head,prev);
node curr=head;
while (curr!=null) {
    System.out.println(curr.data);
    curr=curr.next;
}

    
}
    
}