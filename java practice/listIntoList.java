import java.util.*;
public class listIntoList {
    public static void main(String[] args) {
    
          ArrayList<Integer>arr=new ArrayList<>();
          arr.add(0);
          arr.add(1);
          arr.add(1);
          arr.add(2);
          arr.add(3);
          arr.add(1);
        ArrayList<Integer>highest=new ArrayList<>();
        ArrayList<ArrayList<Integer>> superlist = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer>countN=new ArrayList<>();

    
        Collections.sort(arr);
        for(int i=0;i<arr.size()-1;i++){
        int count=0;
            if(arr.get(i)==arr.get(i+1)){
                continue;
            }
            else{
            for(int j=0;j<arr.size();j++){
                if(i==j){
                    count++;
                }
             } highest.add((arr.get(i)));
                highest.add(count);
                superlist.add(highest);}
        }
    for(int i=0;i<superlist.size();i++){
            countN=superlist.get(i);
            System.out.println(countN.get(i)+" "+countN.get(i+1));

    
    }
    }
}
