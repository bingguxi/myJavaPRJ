package grass_github;

import java.util.Scanner;

public class April_sixth {
    public static void main(String[] args) {
        long A, B, C;
        Scanner s = new Scanner(System.in);

        System.out.printf("첫번째 값을 입력하세요 : ");
        A = s.nextInt();

        System.out.printf("두번째 값을 입력하세요 : ");
        B = s.nextInt();

        System.out.printf("세번째 값을 입력하세요 : ");
        C = s.nextInt();

        System.out.printf("세 값의 합은 %d 입니다", A + B + C);
    }
}
