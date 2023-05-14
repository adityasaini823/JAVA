public class TraversingCircular {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
        public static void printNode(node head) {
        node start=head;
        while(start.next!=head){
            System.out.println(start.data);
            start=start.next;
        } System.out.println(start.data);
    } 
        
    public static void main(String[] args) {
        node head=new node(20);
        node n=new node(30);
        node n1=new node(40);
        node n2=new node(50);
        head.next=n;
        n.next=n1;
        n1.next=n2;
        n2.next=head;        printNode(head);
    }
}
