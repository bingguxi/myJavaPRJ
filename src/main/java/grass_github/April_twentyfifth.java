package grass_github;

import java.util.Scanner;

public class April_twentyfifth {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dan = s.nextInt();

        for (int i = 1; i <= 9; i++)
        {
//            출력 방법을 다양하게 해 봄!
//            System.out.print(dan + "*" + i + "=" + dan*i + "\n"); // 첫번째 방법 : print. print는 엔터 쳐야할 때 "/n" 처럼 쌍따옴표로 감싸서 사용한다
            System.out.print(dan + "*" + i + "=" + dan*i); // 두번째 방법 : print.엔터만 따로 한 줄 더 만들어서 출력
            System.out.print("\n");
//            System.out.println(dan + "*" + i + "=" + dan*i); // 세번째 방법 : println.
//            System.out.printf("%d * %d = %d\n", dan, i, dan*i); // 네번째 방법 : printf.
        }
    }
}
