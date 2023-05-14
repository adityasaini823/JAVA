public class activityManage {
public static void main(String[] args) {
    int start[]={1,2,3,10};
    int end[]={3,4,8,11};
    
    int count=0;
    int lastend=0;
    for (int i = 0; i < start.length; i++) {
            
        for(int j=i;j<end.length;j++){
                
                if(start[i]>=lastend){
                    count++;
                    lastend=end[i];
                }
        }
        
    }
    System.out.println("maximum activity "+ count);
}      
}