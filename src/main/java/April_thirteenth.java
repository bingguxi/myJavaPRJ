import java.util.Scanner;

public class April_thirteenth { // 학생 30명 중 과제를 제출하지 않은 2명의 출석번호를 구하는 문제
    public static void main(String[] args) {
        int classroom[] = new int[30];
        int i, num;
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 28; i++) // 출석번호를 총 28회 입력받기 위해 임의의 변수 i를 선언하고 for문을 돌림
        {
            num = s.nextInt();
            classroom[num-1] = num; // 과제를 제출한 학생의 출석번호를 입력받아, 입력된 숫자와 동일한 순서위치에 저장될 수 있게 설정
        }

        for (i = 0; i < 30; i++) // 배열 요소들 중 값이 0인 요소를 찾기 위해 임의의 변수 i를 선언하고 30회 for문을 돌림
        {
            if (classroom[i] == 0)
            {
                System.out.printf("%d\n", i+1); // 해당 순서위치에 실제 저장된 값은 순서번호 + 1임
            }
        }
    }
}