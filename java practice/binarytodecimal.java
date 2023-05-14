import javax.swing.text.AbstractDocument.LeafElement;

public class binarytodecimal {
    public static void main(String[] args) {
        int pow=0;
        int ld;
        int n=1011;
        int dcN=0;
        for(int i=0;i<4;i++){
            ld=n%10;
            dcN = dcN + ld* (int)Math.pow(2,pow);
            pow++;
            n=n/10;
        }
  System.out.println(dcN);
    }

}
