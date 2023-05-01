package grass_github;

import java.util.Scanner;

public class May_first { // 입력받은 9개의 자연수 중, 최댓값과 그 최댓값이 몇 번째 수인지 구하는 문제
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 값을 입력받을 스캐너 생성
        int a[] = new int [9]; // 9개의 자연수를 저장할 배열 생성

        for (int i = 0; i < a.length; i++) // 9개의 값을 입력받는 for 문
        {
            a[i] = s.nextInt();
        }

        int max = a[0]; // 최댓값을 저장할 변수 max와 그 순서를 저장할 변수 i를 선언하고, 일단 배열의 첫번째 요소로 초기화
        int num = 1;

        for (int i = 0; i < a.length; i++) // max의 값과 배열 요소 하나하나를 순서대로 비교하고, max에 최댓값을 저장하는 for 문
        {
            if (a[i] > max)
            {
                max = a[i];
                num = i + 1;
            }
        }

        System.out.printf("%d\n%d", max, num); // 결과 값을 출력
    }
}
