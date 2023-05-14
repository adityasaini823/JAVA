public class middleNode {
     public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    
    }
public static int middle(node head) {
    node curr=head;
    int count=0;
    int value=0;
    if(head==null){
        return 0;
    }
    while (curr!=null) {
        curr=curr.next;
        count++;
    }
    System.out.println(count);
    node temp=head;
    if(count%2==0){
    for(int i=0;i<(count/2);i++){
       
            temp=temp.next;
            value=temp.data;
        
    }
}
else{
    for(int i=0;i<(count/2);i++){
       
            temp=temp.next;
            value=temp.data;
        
    }
}
return value;
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
        int m=middle(head);
        System.out.println(m);
    }
}
