package grass_github;

import java.util.Scanner;

public class May_eighth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int i = 0; i < num / 4; i++)
        {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
