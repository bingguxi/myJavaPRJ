package grass_github;

import java.util.Scanner;

public class April_twentyeighth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int testsum = 0;
        int realsum = s.nextInt();
        int kind = s.nextInt();

        for (int i = 0; i < kind; i++)
        {
            int price = s.nextInt();
            int num = s.nextInt();

            testsum += price * num;
        }

        if (realsum == testsum)
        {
            System.out.print("Yes");
        }
        else
        {
            System.out.print("No");
        }
    }
}