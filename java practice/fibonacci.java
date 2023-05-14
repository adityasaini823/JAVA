public class fibonacci {
    public static void main(String[] args) {
        int n=10;
        int a=0;
        int b=1;
        int sum=a+b;
        for(int i=0;i<n;i++){
            System.out.println(sum);
            if(i<=10){
                a=b;
                b=sum;
                sum=a+b;
            }
        }
    }
}
