package grass_github;

import java.util.Scanner;

public class April_twentyfourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i, j;

        i = s.nextInt();
        j = s.nextInt();

        if (i > 0)
        {
            if (j > 0)
            {
                System.out.print("1");
            }
            else if (j < 0)
            {
                System.out.print("4");
            }
        }
        else if (i < 0) {
            if (j > 0)
            {
                System.out.print("2");
            }
            else if (j < 0)
            {
                System.out.print("3");
            }
        }
    }
}
