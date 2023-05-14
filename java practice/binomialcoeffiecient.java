public class binomialcoeffiecient {
    static int fact(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            
            f=f*i;
        }
        
        return f;

    }
    public static void main(String args[]) {
        int a=5;
        int b=2;
       int n= fact(a);
        int r=fact(b);
        int c=a-b;
        int d=fact(c);
        System.out.println(n/(r*d));
        
    }
}
