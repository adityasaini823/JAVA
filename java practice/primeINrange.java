public class primeINrange {
    public static void main(String[] args) {
        int n=10;
        for(int i=3;i<=n;i++){
            for(int j=2;j<i;j++){
                    if (i%j==0){
                        break;
                    }
                    else{
                        System.out.println(i);
                    }
                }
            }System.out.print("these are prime numbers");
    }
}
