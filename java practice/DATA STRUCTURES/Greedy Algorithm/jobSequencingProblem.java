import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

static class job{
    int deadline;
    int id;
    int profit;
    public job(int i,int d,int p){
            profit=p;
            deadline=d;
            id=i;
    }
}
public class jobSequencingProblem {
    public static void main(String[] args) {
        int jobinfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<job> jobs=new ArrayList<>();
        for(int i=0;i<jobinfo.length;i++){
            jobs.add(new job(i, jobinfo[i][0],jobinfo[i][1]));
        }
        Collections.sort(jobs,(a,b)-> b.profit-a.profit );
        for(int i=0;i<jobs.size();i++){
            
        }
    }
}
