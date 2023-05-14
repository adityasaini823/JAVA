public class mergeSort {
    public static void ms(int arr[],int l,int r) {
        if(r>l){
            int mid=arr.length/2;
            ms(arr,l,mid);
            ms(arr,mid+1,r);
            // System.out.println(mid+" ");
            
            merge(arr,l,mid,r);
        }
    }
public static int merge(int arr[],int l,int mid,int r) {
        System.out.println(mid);

    
    
    
    return 0;
}





    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        
        int r=arr.length-1;
        int l=0;
        ms(arr,l,r);

    }
}
