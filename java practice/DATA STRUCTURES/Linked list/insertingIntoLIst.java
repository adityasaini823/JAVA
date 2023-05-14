public class insertingIntoLIst {
    /**
     s node
     int data;

     */
    public static class node {
        int data;
        node next=null;
        node(int data){
            this.data=data;
        }
    
        
    }
    public static node insert(node head,int newValue) {
                    node temp=new node(newValue);
                    // System.out.println(temp.data);
                    temp.next=head;
                    return temp; 
    }
    public static void main(String[] args) {
        
        node head=null;
            head= insert(head,10);
            head=insert(head,50);
            head=insert(head, 30);
            node curr=head;
            while(curr!=null){
                System.out.println(curr.data);
                curr=curr.next;
            }
                 
    }
}
