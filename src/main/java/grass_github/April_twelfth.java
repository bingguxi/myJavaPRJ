package grass_github;

import java.util.Scanner;

public class April_twelfth {
    public static void main(String[] args) {
        int a, b, i; // a는 바구니 개수, b는 공을 넣는 횟수, i는 배열의 첨자로 사용할 변수
        int start, end, num; // start와 end는 공 넣을 바구니 번호의 시작과 끝, num은 넣을 공의 번호
        Scanner s = new Scanner(System.in);

        a = s.nextInt();
        int aa[] = new int[a]; // a를 가장 먼저 입력 받아 해당 크기만큼의 배열을 생성한다.

        b = s.nextInt();
        for (i = 0; i < b; i++) // 그 다음, 공을 넣는 횟수인 b를 입력 받아 그 만큼 for 문을 반복시킨다.
        {
            start = s.nextInt();
            end = s.nextInt();
            num = s.nextInt(); // 공을 한번 넣을 때 어디서부터 어디까지, 번호가 몇인 공을 넣을 것인지 입력 받는다.

            for (int j = start-1; j < end; j++) // 입력 받은 범위의 바구니에 입력 받은 번호의 공을 넣는 작업!!
            {
                aa[j] = num; // 전에 이미 값이 존재하더라도 또 새로운 num으로 덮는다.
            }
        }
        for (i = 0; i < aa.length; i++)
        {
            System.out.printf("%d ", aa[i]); // 마지막에 각 바구니에 들어있는 공의 번호를 출력한다.
        }
    }
}