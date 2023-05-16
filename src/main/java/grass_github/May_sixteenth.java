package grass_github;

import java.util.Scanner;

public class May_sixteenth { // 문자열을 입력 받아 문자열의 첫 글자와 마지막 글자를 함께 출력하는 문제
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 문자열을 입력받을 스캐너 생성
        int num = s.nextInt(); // 입력받을 횟수를 변수 num에 저장

        for (int i = 0; i < num; i++)
        {
            String a[] = s.next().split(""); // split 쓰는 이유? 배열 초기화 할 때 대입할 수 있음. split 도 배열형태로 결과값이 나오니까!
            System.out.print(a[0] + a[a.length-1] + "\n"); // 문자열의 첫 글자와 마지막 글자를 출력
        }
    }
}