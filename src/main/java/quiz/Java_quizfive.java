package quiz;

import java.util.Scanner;
public class Java_quizfive {
    public static void main(String[] args) {
        int i, max, min, avg;
        int sum = 0;
        int aa[] = new int[5];
        Scanner s = new Scanner(System.in);

        for (i = 0; i < 5; i++)
        {
            aa[i] = s.nextInt();
            sum += aa[i];
        }

        for (i = 0; i < 5; i++)
        {
            for (int j = i + 1; j < 5; j++)
            {
                if (aa[i] > aa[j])
                {
                    int blank = aa[i];
                    aa[i] = aa[j];
                    aa[j] = blank;
                }
            }
        }

        max = aa[aa.length-1];
        min = aa[0];
        avg = sum / aa.length;

        System.out.printf("가장 큰 값 : %d / 가장 작은 값 : %d / 평균 값 : %d", max, min, avg);
    }
}