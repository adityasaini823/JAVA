public class invertedandRotatedhalfpyramid {
    public static void main(String[] args) {
        int n=4;
        int m=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<m;j++){
                 System.out.print(" ");
                  }
                  m--;
            for(int k=1;k<=i;k++){
                System.out.print("*");
                }
                System.out.println();
    }
    
}}
