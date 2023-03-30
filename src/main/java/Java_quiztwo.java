public class Java_quiztwo {
    public static void main(String[] args) {

        int i, j;

        for (i = 2, j = 1; i < 10; j++)
        {
                System.out.printf("%dx%d=%d \n", i, j, i*j);

                if (j == 9)
                {
                    i++;
                    j = 0;
                }
        }
    }
}