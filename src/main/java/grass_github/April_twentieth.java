package grass_github;

import java.util.Scanner;

public class April_twentieth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;

        i = sc.nextInt();
        j = sc.nextInt();

        if (i > j)
            System.out.print(">");
        else if (i < j)
            System.out.print("<");
        else
            System.out.print("==");
    }
}