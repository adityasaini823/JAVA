public class insertingAtBeginClist {
public static class node {
int data;
node next;
node(int data){
    this.data=data;
    this.next=null;
}}
public static node insert(int data,node head) {
    node latest=new node(data);
    node curr=head;
    while (curr.next!=head) {
        curr=curr.next;   
    }
            curr.next=latest;
            // System.out.println(curr.data);
            latest.next=head;
            // System.out.println(latest.next.data);
    return latest;
    
}

 public static void main(String[] args) {
    node head=new node(10);
    node n=new node(20);
    node n1=new node(30);
    node n2=new node(40);
    head.next=n;
    n.next=n1;
    n1.next=n2;
    n2.next=head;
    head=insert(5,head);
    node curr=head;
    while(curr.next!=head) {
        System.out.println(curr.data);
        curr=curr.next;   
    }
    System.out.println(curr.data);

 }   
}
