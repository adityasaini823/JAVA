public class butteryflypattern {
    public static void main(String[] args) {
        // First half 
        int n=3;
        for(int i=1;i<=4;i++){
            // taking 3 loops for printing 3 different values * ," " and again *.
            // loop 1
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
               } 

                 // loop 2
            for(int k=1;k<=(2*n);k++){
                System.out.print("   ");
                
                // System.out.print(n);
            }
            n--;

                 // loop 3
            for(int l=1;l<=i;l++){
                System.out.print(" * ");
            }

            System.out.println();
        }
        // 2nd half for lower pattern
        int m=4;
        for(int i=1;i<=4;i++){

        for(int j=1;j<=m;j++){
            System.out.print(" * ");
                             }

        for(int k=2;k<(i*2);k++){
            System.out.print("   ");
                                 } 

        for(int l=1;l<=m;l++){
        System.out.print(" * ");
                             }
    m--;
    System.out.println();
        }
        }}
