public class reverseLinkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
    public static node reverse(node head) {
        node curr=head;
        node prev=null;
        while(curr!=null){
            node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
    public static void main(String[] args) {
        node head=new node(20);
        node n=new node(30);
        node n1=new node(40);
        node n2=new node(50);
        node n3=new node(60);
        head.next=n;
        n.next=n1;
        n1.next=n2;
        n2.next=n3;
        head=reverse(head);
        node curr=head;
        while(curr!=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
}
