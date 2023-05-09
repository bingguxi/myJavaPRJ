package grass_github;

import java.util.Scanner;

public class May_ninth {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        int num = s.nextInt();
        int a[] = new int[num];

        for (int i = 0; i < a.length; i++)
        {
            int num1 = s.nextInt();
            int num2 = s.nextInt();
            a[i] = num1 + num2;
        }

        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("Case #%d: %d\n", i+1, a[i]);
        }
    }
}
