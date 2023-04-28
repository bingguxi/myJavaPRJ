package grass_github;

import java.util.Scanner;

public class April_tenth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, target;

            i = s.nextInt();
            int a[] = new int[i];
            target = s.nextInt();

        for (i = 0; i < a.length; i++)
        {
            a[i] = s.nextInt();

            if (a[i] < target)
            {
                System.out.printf("%d ", a[i]);
            }
        }
    }
}
