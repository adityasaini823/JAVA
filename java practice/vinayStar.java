import java.util.Scanner;
public class vinayStar {
    public static void pattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("#");
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }System.out.println();
        }    
    }
    public static void main(String[] args) {
        // Scanner s=new Scanner();
        // int n=NextBytes();

        
        pattern(5);
    }
    
}
