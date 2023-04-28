package grass_github;

import java.util.Scanner;

public class April_fourteenth { // 입력할 숫자의 개수와 숫자를 입력받아 최솟값과 최댓값을 출력하는 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[num];

        for (int i = 0; i < a.length; i++) // 배열에 값을 넣는 for 문
        {
            a[i] = sc.nextInt();
        }

//        이번엔 정렬하지 않고 다른 방법으로 max 와 min 구해보기!!

        int max = a[0]; // max 와 min 을 모두 배열의 첫번째 값으로 초기화
        int min = a[0];

        for (int i = 0; i < a.length; i++) // 정렬과 다르게 한 번의 for 문으로 max 와 min 을 모두 구할 수 있음!
        {
            if (a[i] > max)
            {
                max = a[i];
            }
            else if (a[i] < min)
            {
                min = a[i];
            }
        }
        System.out.printf("%d %d", min, max);
    }
}