public class plaindromePatternwithnumbers {
    public static void main(String[] args) {
        int n=5;
    //    int m=5;
        for(int i=1;i<=5;i++){
            // for printing spaces in decreasing order
            for(int j=1;j<=n-i;j++){
                System.out.print(" " );
            }
            int m=0;// for getting the reverse counting that starts with 2;
            for(int j=2;j<=i;j++){
               
                System.out.print(i-m);
                m++;
            }
            // for getting the counting every time loop runs
                for(int l=1;l<=i;l++){
                System.out.print(l);
            }
           
            System.out.println();
            }
        }
    }
    
 