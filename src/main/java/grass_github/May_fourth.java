package grass_github;

import java.util.Scanner;

public class May_fourth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hour = s.nextInt();
        int minute = s.nextInt();

        if (hour != 0)
        {
             if (minute < 45)
            {
                hour--;
                minute += 15; //minute = minute + 60 - 45;
            }
             else
             {
                 minute -= 45;
             }
        }
        else
        {
            if (minute < 45)
            {
                hour = 23;
                minute += 15; //minute = minute + 60 - 45;
            }
            else
            {
                minute -= 45;
            }
        }
        System.out.printf("%d %d", hour, minute);
    }
}
