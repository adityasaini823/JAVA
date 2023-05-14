public class recursion {


    public static void fact(int n) {
        if (n>0) {
            fact(n-1);
            System.out.println(n);
        }
       
    }
    public static void main(String[] args) {
        fact(5);
    }
}
