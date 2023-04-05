import java.io.IOException;
import java.util.Scanner;

public class Ex07_04 {
    public static void main(String[] args) throws IOException {   // 자바에서 에러가 났을 때 얘가 처리해준다.
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        while (2 > 1){          // while (true) { 해도 되겠네~~!!
            System.out.printf("계산할 첫번째 수를 입력 : ");
            a = s.nextInt();

            System.out.printf("계산할 두번째 수를 입력 : ");
            b = s.nextInt();

            System.out.printf("계산할 연산자를 입력하세요 : ");
            ch = (char) System.in.read();       // 이거 처음 나온거... 얘는 무조건 exception을 쓰라고 자바에서 정의되어 있대.

            switch (ch) {
                case '+':
                    System.out.printf("%d + %d = %d 입니다. \n", a, b, a+b); break;
                case '-':
                    System.out.printf("%d - %d = %d 입니다. \n", a, b, a-b); break;
                case '*':
                    System.out.printf("%d * %d = %d 입니다. \n", a, b, a*b); break;
                case '/':
                    System.out.printf("%d / %d = %d 입니다. \n", a, b, a/b); break;
                case '%':
                    System.out.printf("%d %% %d = %d 입니다. \n", a, b, a%b); break;
                default:
                    System.out.printf("연산자를 잘못 입력했습니다. \n");
            }
        }
    }
}
