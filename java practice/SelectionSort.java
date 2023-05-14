public class SelectionSort {
    public static void sorting(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            int smallest=arr[i];
            for(int j=i;j<arr.length;j++) {
                if(arr[j]<smallest) {
                    smallest=arr[j];
                    int swap=arr[i];
                    arr[i]=smallest;
                    arr[j]=swap;
                    System.out.print("Sort pass " + (i + 1) + ": ");
                    for (int k = 0; k < arr.length; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
        System.out.print("Final sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2}; 
        sorting(arr);
    }
}
