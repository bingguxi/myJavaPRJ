import java.util.Scanner;

public class April_eleventh {  // 반에서 나보다 키가 큰 사람의 수를 구하는 함수
    public static void main(String[] args) {
        int total, i, height; // 나를 제외한 반 학생들의 수, 인자 순서, 나의 키를 차례대로 선언
        int result = 0; // 나보다 키가 큰 사람의 수를 세어 그 결과값을 나타낼 변수를 선언
        Scanner s = new Scanner(System.in);

        System.out.printf("본인을 제외한 반 학생들의 수를 입력하세요 : ");
        total = s.nextInt();
        int aa[] = new int[total];

        System.out.printf("반 학생들의 키를 입력하세요 (공백으로 구분) : ");
        for (i = 0; i < total; i++)
        {
            aa[i] = s.nextInt();
        }

        System.out.printf("본인의 키를 입력하세요 : ");
        height = s.nextInt();

        for (i = 0; i < total; i++)
        {
            if (aa[i] > height)
            {
                result++;
            }
        }
        System.out.printf("본인보다 키가 큰 학생은 총 %d 명입니다.", result);
    }
}