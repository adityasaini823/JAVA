import java.util.random.RandomGenerator.LeapableGenerator;
public class bubbleSort {



    /**
     * InnerbubbleSort
     */
    public class InnerbubbleSort {

    public static void sorting(int arr[]) {
        // int arr[]={5,2,1,4,3,6,9,7,8,0};
        for(int k=1;k<arr.length;k++){
        for(int i=0;i<arr.length-k;i++){
            if(arr[i]>arr[i+1]){
                int swap=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=swap;
            }
        }}
        for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
        }
    }
    }






public static void main(String[] args) {
    int arr[]={5,2,1,4,3,6,9,7,8,0}; 
    InnerbubbleSort.sorting(arr);
}
    
}