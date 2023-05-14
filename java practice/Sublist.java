import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.sound.sampled.SourceDataLine;

public class Sublist {
    public static void main(String[] args) {
        ArrayList <Integer>s=new ArrayList<>();
        ArrayList <Integer>list=new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        int d=3,m=2;

            for(int j=0;j<s.size()-m+1;j++){
                int sum=0;
        for(int i=j;i<m+j;i++){
            sum=sum+s.get(i);
        }
        list.add(sum);
    } 
      for(int i=0;i<list.size();i++){
        if(d!=list.get(i)){
            list.remove(i);
            i--;
        }
      }
  
        }
    }
    
// }
