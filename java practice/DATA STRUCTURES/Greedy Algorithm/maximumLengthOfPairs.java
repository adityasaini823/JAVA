import java.util.Arrays;
import java.util.Comparator;

/**
 * maximumLengthOfPairs
 */
public class maximumLengthOfPairs {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60}, {5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o ->o[1]));
        int chainlength=1;// ISt pair is Always included in the chain that why it is taken as 1. 
        int lastEnd=pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(lastEnd<pairs[i][0]){
                chainlength++;
                lastEnd=pairs[i][1];
            }
        }
        System.out.println(chainlength);
    }
    
}