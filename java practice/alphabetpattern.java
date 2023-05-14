import java.util.zip.ZipEntry;

public class alphabetpattern {
    public static void main(String[] args) {
        char ch='A';
        int i,j=0;
        for(i=0;i<=3;i++){
            for(j=0;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println("");
        }
    }
}
