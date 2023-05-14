import java.sql.Array;

public class mergingSortedArray {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9};
        int arr2[]={2,4,6,8,10,11,12};
        int n=arr.length +arr2.length;
        int arr3[]=new int[n];
        int a=0,b=0, i=0;
        while(a<arr.length && b<arr2.length){
            
                if(arr[a]<=arr2[b]){
                        arr3[i]=arr[a];
                        a++; 
                        i++;
                        // System.out.print(smallest+" ");
                }

                else{
                    arr3[i]=arr2[b];
                    b++;
                    i++;
                    // System.out.print(smallest+" ");
                }
            }
            // System.out.println("first");
            // for(int j=0;j<arr3.length-1;j++){
            //     System.out.print(" "+arr3[j]);
            // }
            // System.out.println("a"+a+"b"+b+" arr"+arr.length+" arr2"+arr2.length+" i="+i);
            while (a<arr.length) {

                arr3[i]=arr[a];
                i++;
                a++;
            }

            while (b<arr2.length) {
               
                arr3[i]=arr2[b];
                i++;
                b++;
                
            }
            
         
        for(int j=0;j<arr3.length;j++){
            System.out.print(" "+arr3[j]);
        }
    }}
    

