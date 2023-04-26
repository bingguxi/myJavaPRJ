package grass_github;

import java.util.Scanner;

public class April_twentysixth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int a[] = new int[num];

        for (int i = 0; i < a.length; i++)
        {
            int j = s.nextInt();
            int k = s.nextInt();
            a[i] = j + k;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%d \n", a[i]);
        }
    }
}