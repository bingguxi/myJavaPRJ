import java.util.Scanner;

public class Baekjoon_one {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        System.out.printf("첫번째 값을 입력하세요 : ");
        a = s.nextInt();

        System.out.printf("두번째 값을 입력하세요 : ");
        b = s.nextInt();

        System.out.printf("%d\n", a*(b%10));
        System.out.printf("%d\n", a*((b%100)/10));
        System.out.printf("%d\n", a*((b%1000)/100));
        System.out.printf("%d\n", a*b);
    }
}