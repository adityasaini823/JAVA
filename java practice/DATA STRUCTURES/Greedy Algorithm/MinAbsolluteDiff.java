import java.lang.reflect.Array;

import java.util.*;;
public class MinAbsolluteDiff {

    public static void main(String[] args) {
        int arr[]={1,2,3};
        int arr2[]={3,1,2};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        
               System.out.println("Minimum Absolute difference= "+ Math.abs(arr[0]-arr2[0]));
    
    }
}
