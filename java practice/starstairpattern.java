public class starstairpattern{
    
    public static void main(String[] args) {
        // int k=4;
        // for(int line=1;line<=4;line++){
        //         for(int star=1;star<=k;star++){
        //         System.out.print("*");
        //                                 }
        // System.out.print("\n");
        // k=k-1;
    // }}
    int n=4;
    int i,j=0;
    for(i=0;i<=n;i++){
        for(j=0;j<=n-i;j++){
            System.out.print("*");
        }
    System.out.print("\n");
         }

    }}