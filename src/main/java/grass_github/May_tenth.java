package grass_github;

import java.util.Scanner;

public class May_tenth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];

        for (int i = 0; i < num; i++)
        {
            a[i] = s.nextInt();
            b[i] = s.nextInt();
        }

        for (int i = 0; i < num; i++)
        {
            System.out.printf("Case #%d: %d + %d = %d\n", i+1, a[i], b[i], a[i]+b[i]);
        }
    }
}
