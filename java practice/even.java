import java.util.*;
public class even {
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        int e=0;
        int o=0;
        for(int i=1;i<=n;i++){
          if(i%2==0){
           e=e+1;
          }
          else{
                o +=1;
          }
        }
        System.out.println("odds are " + o +"  even are " + e);
    }
    
}

