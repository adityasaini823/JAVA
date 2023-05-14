import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class indianCoins {
    public static void main(String[] args) {
        Integer arr[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(arr,Comparator.reverseOrder());
        int volume=121,n=0;;
        ArrayList<Integer> totalcoins=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(volume>0){
                while(volume>=arr[i]){
                    volume=volume-arr[i];
                    totalcoins.add(arr[i]);
                    n++;
                }
            }
        }
            System.out.println("number of coins "+n);
        for(int i=0;i<totalcoins.size();i++){
            System.out.println(totalcoins.get(i));
        }
    }
}
