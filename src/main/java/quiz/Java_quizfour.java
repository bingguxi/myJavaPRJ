package quiz;

import java.util.Scanner;

public class Java_quizfour {
    public static void main(String[] args) {
        int[] aa = new int[5];
        int i;
//        int i = 0;
        int j;
        int blank = 0;
        Scanner s = new Scanner(System.in);

        System.out.printf("");
        for (i = 0; i < 5; i++)
        {
            aa[i] = s.nextInt();
        }

        for (i = 0; i < 5; i++) // 배열의 첫번째 값 aa[0]부터 1씩 올라간다.
        {
            for (j = i+1; j < 5; j++) // 배열의 두번째 값 aa[1]부터 1씩 올라간다.
            {

                if (aa[i] > aa[j])
                {
                    blank = aa[i]; // blank에 aa[i] 값을 대입 (잠시 보관)
                    aa[i] = aa[j]; // aa[i]에 aa[j] 값을 대입 (덮어쓰기)
                    aa[j] = blank; // aa[j]에 blank 값을 대입 (보관해뒀던 aa[i] 값 이동)
                }
                if (aa[i] == aa[j])
                {
                    System.out.printf("중복 숫자는 입력하실 수 없습니다");
                    return;
                }

            }
        }

        for (i = 0; i < 5; i++)
        {
            System.out.printf("%d ", aa[i]);
        }
    }
}