import java.util.Scanner;

public class Java_quizseven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 값을 입력 받을 스캐너 생성
        int a[] = new int[5]; // 5개의 입력을 받는다고 했으므로 길이가 5인 배열 생성

        for (int i = 0; i < 5; i++) // 입력 받은 값을 순서대로 배열에 저장하는 for 문
        {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) // 배열의 값들끼리 크기를 비교하고 내림차순으로 정렬하는 for 문
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (a[i] < a[j])
                {
                    int blank = a[i];
                    a[i] = a[j];
                    a[j] = blank;
                }
            }
        }

        for (int i = 0; i < 5; i++)
        {
            System.out.printf("%d ", a[i]);
        }
    }
}