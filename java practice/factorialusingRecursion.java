public class factorialusingRecursion {

    public static void fact(int a,int fact1){
        if(a>=1){
            
            fact(a-1,fact1);
            
            
                System.out.println((fact1+a)*fact1);
          
        }
        }



    public static void main(String[] args) {
        int a=7;
        int fact1=0;
        fact(a,fact1);
    }
}
