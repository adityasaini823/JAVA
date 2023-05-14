public class insertionSorting {
    class solution{
        public static void insertion(int arr[]) {
            int j;
            int n=arr.length;
            for(int i=1;i<n;i++){
            int key=arr[i];
            j=i-1;
            while (j>=0 && key<arr[j]) {
                arr[j+1]=arr[j];
                
                j=j-1;
            }
            arr[j+1]=key;

                }
            
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }

        }
        }


    public static void main(String[] args) {
        int arr[]={5,4,2,1,3};
        solution.insertion(arr);
    }
}
