public class solidRohmnus {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=n;j++){
                System.out.print("   ");
            }
            for(int k=0;k<=5;k++){
                System.out.print(" * ");
            }
            n--;
            System.out.println();
        }
    }
}
