public class reverseOfNumber {
    // public static void main(String[] args) {
    //     int n=10899;
    //     for(int i=1;i<=5;i++){
    //         System.out.print(n%10);
    //         n=n/10;
    //     }

    //     }#method 2nd
    public static void main(String[] args) {
        int n=123456;
        int l=0;
        int rev=0;
        while(n>0){
            l=n%10;
            rev=(rev*10)+l;
            n/=10;
        };
        System.out.println(rev);
    };

}