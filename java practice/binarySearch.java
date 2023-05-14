import java.lang.annotation.Target;

import javax.lang.model.util.ElementScanner14;

public class binarySearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int target=0;
        int high=arr.length-1;
        int low=0;
        int mid=(low+high)/2;
        // System.out.println(mid+"mid");
        for(int i=low;i<=high;i++){
            if(arr[mid]>target){
                high=mid-1;
                mid=(low+high)/2;
                // System.out.println(mid+"high");
            }
             
            else{
                low=mid+1;
                // System.out.println(mid+"low");
                mid=(low+high)/2;
                // System.out.println(mid);
            }
            if(arr[mid]==target){
                System.out.println("element is at index number "+ mid);
                break;
            }
            if(high==low){
                System.out.println("not available");
                break;
            }
                
            }

        }
    }

