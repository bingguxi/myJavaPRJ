public class Diamond {
    public static void main(String[] args) {
        for (int i = 1; i < 8; i++) {
            if (i < 5) {
                for (int j = 1; j < 5 - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i) - 1; k++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= i - 4; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= 15 - (2 * i) ; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}