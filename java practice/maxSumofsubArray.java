public class maxSumofsubArray {
    public static void main(String[] args) {
        int []arr={1,-2,6,-1,3};
        int maxSum=0;
    for(int k=0;k<arr.length;k++){
        for(int i=0;i<arr.length;i++){
            int crntSum=0;
            for(int j=k;j<=i;j++){
                crntSum=crntSum+arr[j];
                if(maxSum<crntSum){
                    maxSum=crntSum;
                }
                    
            }
            
        }
    }System.out.println(maxSum);
}
    
}
