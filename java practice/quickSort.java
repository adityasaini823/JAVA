  /**
 * quickSort
 */
public class quickSort {
     public static void qs(int arr[],int l,int h) {
         if(l<h){
            int p=partion(arr, l, h);
            // System.out.print(p+" pivot location \n");
            qs(arr, l, p-1);
            qs(arr, p+1, h);

         }
        
    }
    public static int partion(int arr[],int l,int h) {
         int pivot=arr[h];
         int i=l-1;
         for(int j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }
         }
         int swap=arr[i+1];
         arr[i+1]=arr[h];
         arr[h]=swap;
         return i+1;
        }
    public static void main(String[] args) {
        int arr[]={5,4,3,1,2};
        int l=0;
        int h=arr.length-1;

       qs(arr,l,h);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        // expected output 13479
       }
    }
}