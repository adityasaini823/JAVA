import java.util.*;;

public class factors {

    public static void main(String[] args) {
        int n = 2, num = 20;
        int a []= { 2};
        int b []= { 20,30,12 };
        ArrayList<Integer> f = new ArrayList<Integer>();

        for (int i = n; i <= num; i++) {

            if (num % i == 0) {

                f.add(i);
            }
        }

        for (int j = 0; j < f.size(); j++) {
            for (int i = 0; i < a.length; i++) {
                if (f.get(j) % a[i] != 0) {
                    f.remove(j);
                }
            }

        }
       
            for (int k = 0; k < b.length; k++) {
                for (int j = 0; j < f.size(); j++) {
                if (b[k] % f.get(j) != 0) {
                    f.remove(j);
                }
            }
        }
        // f.remove(Integer.valueOf(1));

        for (int i = 0; i < f.size(); i++) {
            System.out.println(f.get(i));
        }
    }
}