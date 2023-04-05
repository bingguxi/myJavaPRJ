public class Java_quiztwo {
    public static void main(String[] args) {

        int i, j;

        for (i = 2, j = 1; i < 10; j++) // 변수 i는 몇단, 변수 j는 뒤에서 하나씩 늘어나는 수
        {
                System.out.printf("%dx%d=%d \n", i, j, i*j); // ex. "2x3=6" 의 형태로 출력한다.

                if (j == 9)
                {
                    i++;
                    j = 0;
                }
        }
    }
}