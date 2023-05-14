public class BooksPages {
    //BOOK with Pages// 
//    {0,1},{2,3},{4,5},{6,7},{8,9},{10,11}
public static void main(String[] args) {
    int n=5,p=4;
    int count=0;
    int page1=n,page2=0;
    if((n-p)<p){
    if(n%2!=0){
        if((n-1)==p ||n==p){
            count=0;
        }
        else{

            page1=n;page2=page1-1;
            for(int i=n;i>0;i--){
                    if(page1==p || page2==p){
                        break;
                    }
                    else{
                        page1-=2;
                        page2=page1-1;
                        count++;
                    }
            }
        }
    }
    else{
            if(n==p){
                count=0;
            }  
            else{
                page1=n-1;page2=page1-1;count=1;
                for(int i=n;i>0;i--){
                    if(page1==p || page2==p){
                        break;
                    }
                    else{
                        page1-=2;
                        page2=page1-1;
                        count++;
                    }
            }

            }
        }
    }
    else{
        if(p==1){
            count=0;
        }
        else{ page1=2;page2=page1+1;count=1;
           for(int i=2;i<=p;i++){
                if(p==page1||p==page2){
                    break;
                }
                else{
                    page1+=2;
                    page2=page1+1;
                    count++;
                }
           }

        }
        
    }
    System.out.println(count);
   
}
    
}
