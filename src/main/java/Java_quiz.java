public class Java_quiz {
    public static void main(String[] args) {
        int i , j;

        for (j = 1; j < 10; j++)
        {
            for (i = 2; i<10; i++)
            {
                System.out.printf("%dx%d=%d \t", i, j, i*j);
            }
            System.out.println();
        }
        System.out.printf("구구단 끝!");
    }
}