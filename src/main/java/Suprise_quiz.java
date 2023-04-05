public class Suprise_quiz {
    public static void main(String[] args) {
        int hap = 0;
        int i;
        int max = 0;

        for (i = 1; i <= 100; i++)
        {
//            if (i / 10 != 5)
//            {
//                hap += i;
//            }
            if (i / 10 == 5)
                continue;

            hap += i;
            max = i;
        }
        System.out.printf("1부터 100까지 숫자에서 50 ~ 59까지의 숫자는 빼고 덧셈한 합계 : %d \n", hap);
        System.out.printf("더해진 최대숫자는 %d입니다\n", max);
    }
}