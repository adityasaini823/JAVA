import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter any number to calculate the factorial");
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int fact=1;
        for (int i=0;i<=a;i++){
            fact= fact*a;
            a=a-1;
        }
        System.out.println(fact);


    }
}
