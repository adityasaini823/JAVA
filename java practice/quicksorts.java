public class quicksorts {
    
        public static void qsort(int a[]){
            int i=0;
            int j=a.length-1;
            int p=a[0];
           int temp=0;
            while(a[i]<p){
              if(p>=a[i]){
                i++;
               }
              
            }
            System.out.println("i is"+i);
            while(a[j]>p){
                if(p<a[j])
                  j--;
                
            }
            System.out.println("j is"+j);

            if(i>j){
              temp=a[j];
              a[j]=p;
              p=temp;
            }
            else{
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            System.out.println("pivoty point is"+a[p]);
    
        }
        public static void main(String args[]){
            int a[]={5,4,1,3,2};
            
            qsort(a);
        }
    }

