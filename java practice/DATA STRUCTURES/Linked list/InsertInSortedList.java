public class InsertInSortedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }}
public static node insert(node head,int x) {
    node newNode=new node(x);
    if(head==null){
        return newNode;
    }
    node curr=head;
    while(curr.next.data<x && curr.next!=null){
        System.out.println(curr.data+" "+ newNode.data);
        curr=curr.next;
       System.out.println(curr.data+"present");
    }
    newNode.next=curr.next;
    curr.next=newNode;

return head;
}
    public static void main(String[] args) {
        node head=new node(10);
        node n1=new node(20);
        node n2=new node(30);
        node n3=new node(50);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        head= insert(head,25);
        // System.out.println(head.data);
        
       node temp=head;
       while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }



    }
}
