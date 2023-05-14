import java.util.Currency;

public class maximumSubArray {
    public static void main(String[] args) {
        int []arr={1,-2,6,-1,3};
        
        int maxSum=0;
        for(int i=0;i<arr.length;i++){
            int crntSum=0;
            for(int j=0;j<=i;j++){
                crntSum=crntSum+arr[j];
                System.out.println(crntSum);
                if(crntSum>maxSum){
                    maxSum=crntSum;
                    
                }

            }
        }
        System.out.println("max sum is"+ maxSum);
    }
}
