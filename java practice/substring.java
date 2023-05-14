import java.sql.Array;

public class substring {
    public static void main(String[] args) {
        String s="He is a very very good boy, isn't he?";
        String arr[]=new String[]{" ","@","'",",","s"};
        String[] result=s.split("[ !_.@,'?]",0);
        System.out.println(result.length-1);
        String arr2[]=new String[20];

        for(int i=0;i<result.length;i++){
            
            if(result[i]==""){
                continue;
            }
            else{
                arr2[i]=result[i];
                System.out.println(arr2[i]);
             }


        }
        
    }


}

