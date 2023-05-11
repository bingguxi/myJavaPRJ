package grass_github;

import java.util.Scanner;

public class May_eleventh {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 문자열을 입력받을 스캐너 생성
        String str = s.next(); // 문자열을 입력받음
        int num = s.nextInt(); // 몇번째 문자를 가져올건지 그 숫자를 입력받음

        char character = str.charAt(num-1); // 0번째부터 시작하므로 charAt(num-1)

        System.out.println(character); // 결과를 출력함
    }
}
