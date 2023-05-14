public class searchingInLinkedList {
    public static class node {
        int data;
        node next=null;
        node(int data){
            this.data=data;
        }
    
        
    }
   public static void searching(node head,int target) {
    node curr=head;
    int x=1;
        while(curr !=null){
            if(curr.data==target){
                System.out.println(x);
                break;
                
            }
            curr=curr.next;
            x++;
        }

        if(curr==null){
            System.out.println("not found");
        }
        

   }
   
    public static void main(String[] args) {
        node head=new node(10);
        node n=new node(20);
        node n2=new node(30);
        head.next=n;
        n.next=n2;
        searching(head,20);

    }
    
}
