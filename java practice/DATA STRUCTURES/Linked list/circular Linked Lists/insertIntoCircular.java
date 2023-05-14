public class insertIntoCircular {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static void printNode(node head,int x) {
            node n3=new node(x);
        node start=head;
        while(start.next!=head){
            // System.out.println(start.data);
            start=start.next;
        } start.next=n3;
        n3.next=head;
        
        node curr=head;
   
        while(curr.next!=head){
            System.out.println(curr.data);
            curr=curr.next;
        } System.out.println(curr.data);
    } 
        
    public static void main(String[] args) {
        node head=new node(20);
        node n=new node(30);
        node n1=new node(40);
        node n2=new node(50);
        head.next=n;
        n.next=n1;
        n1.next=n2;
        n2.next=head;
        printNode(head,60);
    }
}
