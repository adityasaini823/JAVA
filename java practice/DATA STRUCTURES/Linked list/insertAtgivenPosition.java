public class insertAtgivenPosition {

    
    public static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;

        } }

        public static void insert(node head,int pos,int data) {


            node newNode=new node(data);
            if(pos==1){
                newNode.next=head;
                return;

            }
            node curr=head;
            for(int i=0;i<pos-1 & curr!=null;i++){
                    // System.out.println(curr.data+" ");
                    curr=curr.next;
                      }
                      if(curr==null){
                        return;
                      }
            //  System.out.println(curr.next.data+" ");
            newNode.next=curr.next;
            // System.out.println(newNode.data+" ");
            curr.next=newNode;
            
        }
    public static void main(String[] args) {
        node head=new node(10);
        node n1=new node(20);
        node n2=new node(30);
        node n3=new node(50);
        head.next=n1;
        n1.next=n2;
        n2.next=n3;
        insert(head,2,60);
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

}