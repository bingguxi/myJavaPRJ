package grass_github;

import java.util.Scanner;

public class April_nineteenth { // 윤년을 구하는 문제
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) // 4의 배수이면서 100의 배수가 아니거나, 또는 400의 배수이면 윤년이다.
        {
            System.out.print("1"); // 윤년이면 1을 출력한다.
        }
        else
        {
            System.out.print("0"); // 윤년이 아니면 0을 출력한다.
        }
    }
}