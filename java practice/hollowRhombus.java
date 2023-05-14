public class hollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("#");
            }
            n--;
            for (int l = 1; l <= 5; l++) {
                if (i == 1 || i == 5 || l == 1 || l == 5) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }

            System.out.println();
        }

    }

}
