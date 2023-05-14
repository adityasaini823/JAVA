import java.util.function.Function;

public class printingrectangle {
   public static void rectangle(int ttl_rows,int ttl_cols) {
    for(int i=1;i<=ttl_rows;i++){
        for(int j=1;j<=ttl_cols;j++){
            if (i==1 || i==ttl_rows || j==1 || j==ttl_cols){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    
   }
   public static void main(String[] args) {
        rectangle(4,5);
        
    }
    
}
