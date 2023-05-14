public class decimalToBinary {
    public static void main(String[] args) {
        int n=5;
        int a=n;
        int binry=0;
        int deci=0;
        int rev=0;
        int h=0;
        for(int i=0;n>=1;i++){
            deci=a%2;
            a=n/2;
            binry=(binry*10)+deci; 
            n=a;  
        }
        // System.out.println(binry);
        // for reversing the number that we got
        for(int i=0;binry>=1;i++){
            h=binry%10;
            rev= (rev*10)+h;
            binry=binry/10;


        }

            System.out.print("your binary number is"+ rev);
            
    }
    
}
