import java.util.Scanner;
public class Quiz_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("입력값 : ");
        a = s.nextInt();

        if (a % 2 == 0) {
            if (a % 3 == 0) {
                System.out.printf("2의 배수와 3의 배수를 만족합니다.");
            }
            else {
                System.out.printf("2의 배수입니다.");
            }
        }
        else if (a % 3 == 0) {
            System.out.printf("3의 배수입니다.");
        }
        else {
            System.out.printf("2의 배수도 3의 배수도 아닙니다.");
        }
    }
}