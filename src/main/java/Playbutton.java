public class Diamond {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            if (i < 6) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 1; j < 11 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}