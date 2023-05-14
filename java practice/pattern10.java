public class pattern10 {
        public static void main(String[] args) {
            for(int i=0;i<5;i++){
                Character c='A';

                for(int j=1;j<(5-i);j++){
                    System.out.print("*");
                        c++;
                }
                for(int k=0;k<=i;k++){
                    
                    System.out.print(c+" ");
                    c++;
                }
                
                System.out.println();
            }
                    
        }
                



        }

