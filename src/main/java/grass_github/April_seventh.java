package grass_github;

import java.util.Scanner;

public class April_seventh {
    public static void main(String[] args) {
        int N;
        int i;
        int v;
        int count = 0;
        Scanner s = new Scanner(System.in);

        N = s.nextInt();
        int[] a = new int[N];

        for (i = 0; i < N; i++)
        {
            a[i] = s.nextInt();
        }

        v = s.nextInt();
        for (i = 0; i < a.length; i++)
        {

            if (v == a[i])
            {
                count++;
            }
        }
        System.out.printf("%d", count);

    }
}
