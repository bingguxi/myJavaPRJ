public class April_fifth {
    public static void main(String[] args) {
        int i = 2, j = 1;

        while (i < 10)
        {
            System.out.printf("%d X %d = %d \n", i, j, i*j);
            j++;

            if (j == 10)
            {
                i++;
                j = 1;
            }
        }
    }
}
