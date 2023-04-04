import java.util.Scanner;

public class Baekjoon_two {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);

        System.out.printf("첫번째 값을 입력하세요 : ");
        a = s.nextInt();

        System.out.printf("두번째 값을 입력하세요 : ");
        b = s.nextInt();

        if (a > b)
            System.out.printf(">");
        else if (a == b)
            System.out.printf("==");
        else
            System.out.printf("<");
    }
}
