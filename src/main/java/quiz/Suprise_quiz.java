package quiz;

public class Suprise_quiz {
    public static void main(String[] args) {
        int hap = 0;
        int max = 0;
        int i = 1;

        while (i <= 100)
        {
            if (i / 10 != 5)
            {
                hap += i;
                max = i;
            }
            i++;
        }
        System.out.printf("1부터 100까지 숫자에서 50 ~ 59까지의 숫자는 빼고 덧셈한 합계 : %d \n", hap);
        System.out.printf("더해진 최대숫자는 %d입니다\n", max);
    }
}