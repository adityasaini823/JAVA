public class twinprimenumber {
   
    public static void main(String[] args) {
      int n=27,i;
      boolean var=true;
      
      for(i=2;i<n/2;i++) 
      {
        if(n%i==0)
        {
            //System.out.print("no is not prime");
           var=false;
            break;
        }
        else{
            // System.out.print(" prime");
            var=true;
        }
      } 
      if(var==false)
      {
        System.out.print("no  is  not prime");
      }
      else{
        System.out.println("prime");
      }
                                                                                                                                 

    
       
    }
    // for (int i=2;i<=n;i++){
    //     for(int j=2;j<=i;j++){
    //         if(i%j==0){
    //         System.out.print(" "+j);
    //         break;
    //             }               
    // else{
    //     continue;
    // }
    // }
    // }
}
