import java.util.Scanner;
public class Threes_Fives {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("입력값 : ");
        a = s.nextInt();

        if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.printf("3의 배수와 5의 배수를 둘다 만족합니다.");
            } else {
                System.out.printf("3의 배수입니다.");
            }
        } else if (a % 5 == 0) {
            System.out.printf("5의 배수입니다.");
        } else {
            System.out.printf("3의 배수도 5의 배수도 아닙니다.");
        }
    }
}