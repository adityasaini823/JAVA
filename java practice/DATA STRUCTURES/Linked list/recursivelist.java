public class recursivelist {
    public static class node{
        int data;
        node next;
        //constructor to access values 
        node(int data){
            this.data=data;
            next=null;
        }
    }
    public static void recursiveFun(node head) {
                if(head==null)
                return;
                System.out.println(head.data);
                recursiveFun(head.next);
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
            recursiveFun(head);
}
}