public class insertionSort {
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
            for(int i=0; i<arr.length-1;i++){
                int e=i;
                if(arr[i]>arr[i+1]){
                    for(int j=i+1;j>0;j--){
                        if(arr[j]<arr[e]){
                   int temp=arr[j];
                   arr[j]=arr[e];
                   arr[e]=temp;
                   e--;
                        }
                    }
            }




        }
            for(int i=0;i<arr.length;i++){

                System.out.print(arr[i]+" ");
            }
        
}
}
