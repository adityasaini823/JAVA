public class subarray {
    public static void subarry(int n[]) {
       
        for(int i=0;i<=n.length;i++){
            int start=i;
           for(int j=i;j<=n.length-1;j++){
                    int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(n[k]+" ");

                }System.out.println();
                }
                System.out.println();
           }
        }
        
        public static void main(String[] args) {
            int arr[]={2,4,6,8,10};
            subarry(arr);
    }
    }

