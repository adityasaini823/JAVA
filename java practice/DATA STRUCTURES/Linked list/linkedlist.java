public class linkedlist {


    //class to create nodes and access values
    public static class node{
        int data;
        node next;
        //constructor to access values 
        node(int data){
            this.data=data;
            next=null;
        }
    }
    
    // **********function to traverse a linked list **************

    public static void printlist(node head) {
        node curr=head;
        while(curr !=null){
            System.out.println(curr.data);
            curr=curr.next;
        }
    }
    public static void main(String[] args) {
       
        // creating nodes 
        node head=new node(10);
        node n2=new node(20);
        node n3=new node(30);
        node tail= new node(40);
      
        //linking nodes
      
        head.next=n2;
        n2.next=n3;
        n3.next=tail;
        // tail.next=head;
        
        //********************traversing the linked list(printing list) **************
        
        printlist(head);

    }
}
